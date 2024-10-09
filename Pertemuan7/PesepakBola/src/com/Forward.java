package com;

public class Forward extends PesepakBola implements Berlatih, MemasukkanGol{
    private int golDicetak;

    public Forward(String nama, int umur, int NoPunggung, int golDicetak) {
        super(nama, umur, NoPunggung);
        this.golDicetak = golDicetak;
    }

    public int getGolDicetak() {
        return this.golDicetak;
    }

    public void setGolDicetak(int golDicetak) {
        this.golDicetak = golDicetak;
    }

    @Override
    public void play() {
        System.out.println("Penyerang Sedang Mencoba Memasukkan Bola!");
    }

    @Override
    public void train() {
        System.out.println("Penyerang Berlatih untuk Menajamkan Insting Mencetak Gol.");
    }

    @Override
    public void penalty() {
        System.out.println("Gol melalui penalti, " + super.getName() + " telah mencetak " + ++golDicetak + " gol");
    }

    @Override
    public void tapIn() {
        System.out.println("Golll, finishing yang baik dari " + super.getName() + " , total sudah mencetak " + ++golDicetak + " gol");
    }

    @Override
    public void bicycleKick() {
        System.out.println("Wow, gollll salto yang indah dari " + super.getName());
    }
}
