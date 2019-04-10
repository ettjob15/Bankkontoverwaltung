package com.mycompany.bankkontoverwaltung;

public class TransactionDatabase {

    private String User;
    private double money;
    private String hat;
    private String eingezahlt;

    public TransactionDatabase(String User, String hat, double money, String eingezahlt) {
        this.User = User;
        this.hat = hat;
        this.money = money;
        this.eingezahlt = eingezahlt;

    }

    public String getHat() {
        return hat;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public String getEingezahlt() {
        return eingezahlt;
    }

    public void setEingezahlt(String eingezahlt) {
        this.eingezahlt = eingezahlt;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public double getMoney() {
        return money;
    }

}
