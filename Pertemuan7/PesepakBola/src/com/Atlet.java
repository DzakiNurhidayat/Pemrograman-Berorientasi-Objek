package com;

public abstract class Atlet {
    private String name;
    private int umur;


    public Atlet(String name, int umur) {
        this.name = name;
        this.umur = umur;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUmur() {
        return this.umur;
    }

    public void setuUmur(int umur) {
        this.umur = umur;
    }
    
    public void displayAtletInfo() {
        System.out.println("Atlet : " + name + " Berusia " + umur);
    }

    public abstract void play();
}
