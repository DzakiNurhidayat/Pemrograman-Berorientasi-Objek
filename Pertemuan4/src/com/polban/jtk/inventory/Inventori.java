package com.polban.jtk.inventory;

public class Inventori {
    Barang[] barangs;

    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }
    void pengadaan() {
        initBarang();
        System.out.println("Sebelum Stok Ditambakan");
        showBarang();
        barangs[0].setStok(barangs[0].getStok() + 20);
        System.out.println("Setelah Stok Ditambakan");
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
