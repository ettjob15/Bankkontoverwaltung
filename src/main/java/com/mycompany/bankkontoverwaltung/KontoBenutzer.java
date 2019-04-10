package com.mycompany.bankkontoverwaltung;

import com.mycompany.bankkontoverwaltung.KontoGUI;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KontoBenutzer extends Thread {

    private ActiveTransaction money;
    private int user;
    private String userAuswahl;
    private Konto verWaltung;
    private KontoGUI gui;
    private int numberOfThread;
    private Transaction vw2;

    public KontoBenutzer(ActiveTransaction money, Konto verWaltung, KontoGUI gui, int numberOfThread, Transaction vw2) {
        this.money = money;
        this.verWaltung = verWaltung;
        this.gui = gui;
        this.numberOfThread = numberOfThread;
        this.vw2 = vw2;
    }

    @Override
    public void run() {
        try {
            Randomer();
        } catch (InterruptedException ex) {
            Logger.getLogger(KontoBenutzer.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (vw2.getRowCount() == 10) {
            for (int i = 0; i < vw2.getRowCount(); i++) {
                gui.infortainment.append((String) vw2.getValueAt(i, 0)
                        + (String) vw2.getValueAt(i, 1) + vw2.getValueAt(i, 2)
                        + (String) vw2.getValueAt(i, 3) + "\n");
                
            }
            vw2.del();
        }
    }

    public void Randomer() throws InterruptedException {
        if (money.returnwert()) {
            money.waitingFor();
        } else {

            Random rand = new Random();
            int auswahl = rand.nextInt(2 - 1 + 1) + 1;
            int abheben = rand.nextInt(50 - 10 + 1) + 10;
            userAuswahl = getUser();
            if (auswahl == 1) {
                money.hinzufuegen(abheben, userAuswahl);
                sleep((long) rand.nextInt(1000 - 1 + 1) + 1);
            } else if (auswahl == 2) {

                if (money.returnMoney() - abheben >= 0) {
                    money.entfernen(abheben, userAuswahl);
                    sleep((long) rand.nextInt(1000 - 1 + 1) + 1);
                } else {
                    money.waitingForMoney();
                }
            } else {
                money.hinzufuegen(abheben, userAuswahl);
                sleep((long) rand.nextInt(1000 - 1 + 1) + 1);
            }
        }

    }

    public String getUser() {
        int i = verWaltung.getSize();
        user = new Random().nextInt(i - 0) + 0;
        String usr = (String) verWaltung.getElementAt(user);
        if(verWaltung.getSize()==1)
        {
            usr = verWaltung.getElementAt(0).toString();
        }
        
        return usr;
    }

}
