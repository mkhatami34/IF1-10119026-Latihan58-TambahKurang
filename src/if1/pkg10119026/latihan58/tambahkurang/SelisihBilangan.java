/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan58.tambahkurang;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menampilkan tambah kurang
 */
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih(){
        System.out.println("Hasil Selisih " + super.getX()+" - "+super.getY()+" = "+(super.getX() - super.getY()));
    }    
}
