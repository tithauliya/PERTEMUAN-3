/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ABSTRACT;

/**
 *
 * @author HP
 */
class Manusia {
    String nama;
    String jenisKelamin;

    public Manusia(String nama, String jenisKelamin) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    void identitas() {
        System.out.println("Nama: " + nama + ", Jenis Kelamin: " + jenisKelamin);
    }
}