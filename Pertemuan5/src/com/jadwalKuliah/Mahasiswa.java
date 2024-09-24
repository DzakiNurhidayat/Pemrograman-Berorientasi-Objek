package com.jadwalKuliah;

public class Mahasiswa extends Person {
    private String nim;

    public Mahasiswa (String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void display(){
        System.out.println("Nama : " + getNama());
        System.out.println("NIM  : " + getNim());
    }
    
}