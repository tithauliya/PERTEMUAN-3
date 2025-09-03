/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverrideOverload;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Overload (beliKue) ===");
        TokoKue toko = new TokoKue();
        toko.beliKue("Brownies");
        toko.beliKue("Donat", 3);
        toko.beliKue("Bolu", 2, "Coklat");

        System.out.println("\n=== Override (bekerja) ===");
        KaryawanToko k1 = new Kasir();
        KaryawanToko k2 = new PembuatKue();

        k1.bekerja();
        k2.bekerja();
    }
}
