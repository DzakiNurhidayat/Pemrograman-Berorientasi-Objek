package com.jadwalKuliah;

public class Ruang {
    private String nama_ruangan;

    public Ruang(String nama_ruangan) {
        this.nama_ruangan = nama_ruangan;
    }

    public String getNama_ruangan() {
        return this.nama_ruangan;
    }

    public void setNama_ruangan(String nama_ruangan) {
        this.nama_ruangan = nama_ruangan;
    }

    public void display(){
        System.out.println(getNama_ruangan());
    }
}