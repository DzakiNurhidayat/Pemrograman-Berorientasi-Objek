package com.jadwalKuliah;

public class Jadwal {
    private String hari;
    private String tanggal;
    private int jam_ke;
    private MataKuliah mk;
    private Dosen dosen_pengampu;
    private Ruang ruang;

    // Constructor sesuai dengan yang dipanggil di App
    public Jadwal(String hari, String tanggal, int jam_ke, MataKuliah mk, Dosen dosen_pengampu, Ruang ruang) {
        this.hari = hari;
        this.tanggal = tanggal;
        this.jam_ke = jam_ke;
        this.mk = mk;
        this.dosen_pengampu = dosen_pengampu;
        this.ruang = ruang;
    }

    // Getter methods
    public String getHari() {
        return hari;
    }

    public String getTanggal() {
        return tanggal;
    }

    public int getJam_ke() {
        return jam_ke;
    }

    public MataKuliah getMk() {
        return mk;
    }

    public Dosen getDosen_pengampu() {
        return dosen_pengampu;
    }

    public Ruang getRuang() {
        return ruang;
    }

    // Display method for output
    public void display() {
        System.out.println("Hari: " + hari);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Jam ke: " + jam_ke);
        System.out.println("Mata Kuliah: " + mk.getNama_mk());
        System.out.println("Dosen Pengampu: " + dosen_pengampu.getNama());
        System.out.println("Ruangan: " + ruang.getNama_ruangan());
    }
}
