package com.design.observer;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setOraclePrice(1000);
        stockGrabber.setApplePrice(1500);
        stockGrabber.setAtosPrice(800);
    }
}
