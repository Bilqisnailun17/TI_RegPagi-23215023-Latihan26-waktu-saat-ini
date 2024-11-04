/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62818
 */
   
    import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class latihan26  {
    public static void main(String[] args) {
        // Membuat objek Date untuk mendapatkan tanggal dan waktu saat ini
        Date sekarang = new Date();

        // Format untuk menampilkan hari, tanggal, dan waktu
        SimpleDateFormat formatTanggal = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));

        // Menampilkan hasil format
        System.out.println("Hari ini adalah hari : " + formatTanggal.format(sekarang));
    }
}

