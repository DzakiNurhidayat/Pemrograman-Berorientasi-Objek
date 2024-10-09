package com;

public abstract class PesepakBola extends Atlet {
    private int NoPunggung;


    public PesepakBola(String nama, int umur, int NoPunggung) {
        super(nama, umur);
        this.NoPunggung = NoPunggung;
    }

    public int getNoPunggung() {
        return this.NoPunggung;
    }

    public void setNoPunggung(int NoPunggung) {
        this.NoPunggung = NoPunggung;
    }

    public void displayPlayerInfo() {
        super.displayAtletInfo();
        System.out.println("Bernomor Punggung " + NoPunggung);
    }
}
