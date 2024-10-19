package com;

public class Commision extends Hourly {
    protected double totalSales;
    protected double commisionRate;

    public Commision(String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate, double commisionRate) 
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commisionRate = commisionRate;
        this.totalSales = 0;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales; 
    }

    @Override // Kelas Commision
    public double pay() {
        double payment = super.pay() + (totalSales * commisionRate);
        totalSales = 0;
        return payment;
    }
}
