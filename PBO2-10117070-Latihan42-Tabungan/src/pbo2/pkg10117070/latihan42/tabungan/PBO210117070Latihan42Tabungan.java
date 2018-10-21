/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan42.tabungan;
import java.util.Scanner;
/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung 
 * saldo tabungan
 */
public class PBO210117070Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tabungan1 = new Tabungan();
        Scanner scn = new Scanner (System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal\t: ");
        int sd = scn.nextInt();
        System.out.print("Jumlah uang yang diambil: ");
        int jm = scn.nextInt();
        System.out.println("");
        System.out.println("Saldo Anda Sekarang\t: "+tabungan1.ambilUang(sd-jm));
        
        
    }
    
}
