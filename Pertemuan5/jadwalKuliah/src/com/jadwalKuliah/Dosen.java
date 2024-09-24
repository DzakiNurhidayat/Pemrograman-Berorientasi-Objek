package com.jadwalKuliah;

public class Dosen extends Person {
    private String nip;

    public Dosen (String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void display(){
        System.out.println("Nama : " + getNama());
        System.out.println("NIP  : " + getNip());
    }
}
