package Tugas4;

import java.time.YearMonth;
import java.util.Date;
import java.time.temporal.ChronoUnit;

/**
 * Kelas helper untuk logika perhitungan hari
 * @author Achmad Rafiq Syaddid
 */
public class AplikasiPerhitunganHariHelper {

    /**
     * Menghitung jumlah hari dalam bulan dan tahun tertentu
     */
    public static int hitungJumlahHari(int bulan, int tahun) {
        YearMonth ym = YearMonth.of(tahun, bulan);
        return ym.lengthOfMonth();
    }

    /**
     * Menghitung selisih hari antara dua tanggal
     */
    public static long hitungSelisihHari(Date tgl1, Date tgl2) {
        if (tgl1 == null || tgl2 == null) return 0;
        long days = Math.abs(ChronoUnit.DAYS.between(
                tgl1.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate(),
                tgl2.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate()
        ));
        return days;
    }
}
