/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waktusaatini;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author
 * NIM : 10116584
 * Nama : Muhammad Syahrun Dalu
 */
public class WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date jam;
        int hari;
        
        jam = new Date();
        Calendar cal = Calendar.getInstance();
        hari = cal.get(Calendar.DAY_OF_WEEK);
        SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        String[] strDays = new String[]
        {"Sabtu","Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        /*String[] strMonth = new String[]
        {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        */
        System.out.println("Hari Ini Adalah Hari : "+(strDays[hari])+" ,"+formatIndo.format(jam));
        System.out.println("Developed by Muhammad Syahrun Dalu");
    }  
    
}
