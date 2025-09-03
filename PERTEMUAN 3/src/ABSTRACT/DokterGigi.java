/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABSTRACT;

/**
 *
 * @author HP
 */
class DokterGigi extends Dokter implements Pemeriksaan, Operasi {
    public DokterGigi(String nama, String jenisKelamin) {
        super(nama, jenisKelamin);
    }

    @Override
    void spesialisasi() {
        System.out.println("Spesialisasi: Dokter Gigi");
    }

    public void memeriksaPasien() {
        System.out.println(nama + " memeriksa kondisi gigi pasien.");
    }

    public void melakukanOperasi() {
        System.out.println(nama + " melakukan pencabutan gigi.");
    }
}