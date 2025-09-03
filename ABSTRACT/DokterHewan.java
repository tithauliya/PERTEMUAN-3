/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABSTRACT;

/**
 *
 * @author HP
 */
class DokterHewan extends Dokter implements Pemeriksaan, ResepObat, Operasi {
    public DokterHewan(String nama, String jenisKelamin) {
        super(nama, jenisKelamin);
    }

    @Override
    void spesialisasi() {
        System.out.println("Spesialisasi: Dokter Hewan");
    }

    public void memeriksaPasien() {
        System.out.println(nama + " memeriksa kesehatan hewan.");
    }

    public void menulisResep() {
        System.out.println(nama + " menulis resep obat untuk hewan.");
    }

    public void melakukanOperasi() {
        System.out.println(nama + " melakukan operasi sederhana pada hewan.");
    }
}
