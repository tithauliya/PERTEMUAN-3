/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABSTRACT;

/**
 *
 * @author HP
 */
// Abstract class Dokter
abstract class Dokter extends Pekerjaan {
    public Dokter(String nama, String jenisKelamin) {
        super(nama, jenisKelamin);
    }

    abstract void spesialisasi();

    @Override
    void jenisPekerjaan() {
        System.out.println("Pekerjaan: Dokter");
    }
}
