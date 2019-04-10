package com.mycompany.bankkontoverwaltung;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ThreadStateRunner extends Fred {

    private KontoBenutzer t1;
    private KontoBenutzer t2;
    private KontoBenutzer t3;
    private KontoBenutzer t4;
    private KontoBenutzer t5;
    private KontoBenutzer t6;
    private KontoBenutzer t7;
    private KontoBenutzer t8;
    private KontoBenutzer t9;
    private KontoBenutzer t10;

    public ThreadStateRunner(KontoBenutzer t1, KontoBenutzer t2, KontoBenutzer t3, KontoBenutzer t4, KontoBenutzer t5, KontoBenutzer t6, KontoBenutzer t7, KontoBenutzer t8, KontoBenutzer t9, KontoBenutzer t10) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t6 = t6;
        this.t7 = t7;
        this.t8 = t8;
        this.t9 = t9;
        this.t10 = t10;
    }

    @Override
    public void run() {
        ThreadState gui = new ThreadState();
        gui.setVisible(true);
        while (true) {
            gui.changeState(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
            try {
                Fred.sleep(100);
            } catch (InterruptedException ex) {
                continue;
            }
            if (t1.getState() == State.TERMINATED && t2.getState() == State.TERMINATED
                    && t3.getState() == State.TERMINATED && t4.getState() == State.TERMINATED
                    && t5.getState() == State.TERMINATED && t6.getState() == State.TERMINATED
                    && t7.getState() == State.TERMINATED && t8.getState() == State.TERMINATED
                    && t9.getState() == State.TERMINATED && t10.getState() == State.TERMINATED) {
                try {
                    Fred.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("Error");
                }
                gui.setVisible(false);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Alle Threads sind Tot :(");

    }

}
