/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverrideOverload;

/**
 *
 * @author HP
 */

class TokoKue {
    // beli kue dengan nama saja
    void beliKue(String namaKue) {
        System.out.println("Membeli 1 " + namaKue);
    }

    // beli kue dengan jumlah
    void beliKue(String namaKue, int jumlah) {
        System.out.println("Membeli " + jumlah + " " + namaKue);
    }

    // beli kue dengan jumlah + topping
    void beliKue(String namaKue, int jumlah, String topping) {
        System.out.println("Membeli " + jumlah + " " + namaKue + " dengan topping " + topping);
    }
}
