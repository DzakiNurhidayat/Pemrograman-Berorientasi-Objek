package com.jadwalKuliah;

public class MataKuliah {
    private String nama_mk;
    private String kode_mk;

    public MataKuliah (String nama_mk, String kode_mk) {
        this.nama_mk = nama_mk;
        this.kode_mk = kode_mk;
    }

    public String getNama_mk() {
        return this.nama_mk;
    }

    public void setNama_mk(String nama_mk) {
        this.nama_mk = nama_mk;
    }

    public String getKode_mk() {
        return this.kode_mk;
    }

    public void setKode_mk(String kode_mk) {
        this.kode_mk = kode_mk;
    }

    public void display(){
        System.out.println(getNama_mk());
    }
    
}
