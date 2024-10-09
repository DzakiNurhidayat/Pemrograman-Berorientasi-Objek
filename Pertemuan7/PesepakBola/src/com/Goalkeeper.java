package com;

public class Goalkeeper extends PesepakBola implements Berlatih {
    private int cleanSheatDicatatkan;

    public Goalkeeper(String nama, int umur, int noPunggung, int cleanSheatDicatatkan) {
        super(nama, umur, noPunggung);
        this.cleanSheatDicatatkan = cleanSheatDicatatkan;
    }

    public int getCleanSheatDicatatkan() {
        return this.cleanSheatDicatatkan;
    }

    public void setCleanSheatDicatatkan(int cleanSheatDicatatkan) {
        this.cleanSheatDicatatkan = cleanSheatDicatatkan;
    }
    
    @Override
    public void play() {
        System.out.println("Kiper Mengamankan gawang dari tembakan berbahaya.");
    }

    @Override
    public void train() {
        System.out.println("Kiper berlatih menyelamatkan tembakan.");
    }
}
