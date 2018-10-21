/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan42.tabungan;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung 
 * saldo tabungan
 */
public class Tabungan {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void tabungan(int saldo){
        this.saldo = saldo;
    }
    public int ambilUang(int jumlah){
       int hasil = jumlah;
        return hasil;
    }
}
