package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject{
    private List<Observer> observers;
    private double oraclePrice;
    private double applePrice;
    private double atosPrice;

    public StockGrabber(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        observers.remove(observerIndex);
        System.out.println("Observer index: "+ observerIndex+ " deleted");
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers){
            observer.update(oraclePrice,applePrice,atosPrice);
        }
    }

    public void setOraclePrice(double newOraclePrice){
        this.oraclePrice = newOraclePrice;
        notifyObserver();
    }

    public void setApplePrice(double newApplePrice){
        this.applePrice = newApplePrice;
        notifyObserver();
    }

    public void setAtosPrice(double newAtosPrice){
        this.atosPrice = newAtosPrice;
        notifyObserver();
    }
}
