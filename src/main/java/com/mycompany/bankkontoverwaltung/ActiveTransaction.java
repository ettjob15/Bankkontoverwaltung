package com.mycompany.bankkontoverwaltung;

import javax.swing.JLabel;

public class ActiveTransaction {

    private boolean stop;
    private double money;
    private JLabel lbMoney;
    private Transaction vw2;

    public boolean returnwert() {
        return stop;
    }

    public ActiveTransaction(JLabel lbMoney, double money, Transaction vw2) {
        this.money = money;
        this.lbMoney = lbMoney;
        this.vw2 = vw2;
    }

    synchronized void hinzufuegen(double money, String user) {
        this.money = this.money + money;
        lbMoney.setText("Money: " + this.money);
        vw2.add(new TransactionDatabase(user, " hat ", money, " eingezahlt"));
    }

    synchronized void entfernen(double money, String user) {
        this.money = this.money - money;
        lbMoney.setText("Money: " + this.money);
        vw2.add(new TransactionDatabase(user, " hat ", money, " abgehoben"));
    }

    synchronized void waitingFor() throws InterruptedException {
        while (stop) {
            wait();
        }
    }

    synchronized void waitingForMoney() throws InterruptedException {
        while (stop) {
            wait();
            if (money >= 0) {
                break;
            }
        }
    }

    public double returnMoney() {
        return this.money;
    }
}
