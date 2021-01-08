package com.design.observer;

public class StockObserver implements Observer{
    private double oraclePrice;
    private double applePrice;
    private double atosPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New observer: "+ this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double oraclePrice, double applePrice, double atosPrice) {
        this.oraclePrice = oraclePrice;
        this.applePrice = applePrice;
        this.atosPrice = atosPrice;
        printThePrices();
    }

    public void printThePrices(){
        System.out.println(observerID + "\nOracle: "+ oraclePrice+
                "\nApplePrice: "+ applePrice+ "\nAtosPrice: "+ atosPrice);
    }
}
