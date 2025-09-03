/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABSTRACT;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        
        DokterUmum d1 = new DokterUmum("Dika", "Laki-laki");
        DokterHewan d2 = new DokterHewan("Muhammad", "Laki-laki");
        DokterGigi d3 = new DokterGigi("Putri", "Perempuan");

        d1.identitas();
        d1.jenisPekerjaan();
        d1.spesialisasi();
        d1.memeriksaPasien();
        d1.menulisResep();

        System.out.println("\n--------------------\n");

        d2.identitas();
        d2.jenisPekerjaan();
        d2.spesialisasi();
        d2.memeriksaPasien();
        d2.menulisResep();
        d2.melakukanOperasi();

        System.out.println("\n--------------------\n");

        d3.identitas();
        d3.jenisPekerjaan();
        d3.spesialisasi();
        d3.memeriksaPasien();
        d3.melakukanOperasi();
    }
}