/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABSTRACT;

/**
 *
 * @author HP
 */

class DokterUmum extends Dokter implements Pemeriksaan, ResepObat {
    public DokterUmum(String nama, String jenisKelamin) {
        super(nama, jenisKelamin);
    }

    @Override
    void spesialisasi() {
        System.out.println("Spesialisasi: Dokter Umum");
    }

    public void memeriksaPasien() {
        System.out.println(nama + " memeriksa pasien dengan pemeriksaan dasar.");
    }

    public void menulisResep() {
        System.out.println(nama + " menulis resep obat standar.");
    }
}
