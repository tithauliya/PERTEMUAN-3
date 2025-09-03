/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABSTRACT;

/**
 *
 * @author HP
 */
abstract class Pekerjaan extends Manusia {
    public Pekerjaan(String nama, String jenisKelamin) {
        super(nama, jenisKelamin);
    }

    abstract void jenisPekerjaan();
}