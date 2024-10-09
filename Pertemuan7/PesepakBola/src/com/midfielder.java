package com;

public class midfielder extends PesepakBola implements Berlatih {
    private int assistDiberikan;

    public midfielder(String nama, int umur, int noPunggung, int assistDiberikan) {
        super(nama, umur, noPunggung);
        this.assistDiberikan = assistDiberikan;
    }

    public int getAssistDiberikan() {
        return this.assistDiberikan;
    }

    public void setAssistDiberikan(int assistDiberikan) {
        this.assistDiberikan = assistDiberikan;
    }
    
    @Override
    public void play() {
        System.out.println("Penyerang Sedang Mencoba Memasukkan Bola!");
    }

    @Override
    public void train() {
        System.out.println("Penyerang Berlatih untuk Menajamkan Insting Mencetak Gol.");
    }

}
