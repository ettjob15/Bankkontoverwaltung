/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankkontoverwaltung;

import java.awt.Color;

/**
 *
 * @author Jörg
 */
public class ThreadState extends javax.swing.JFrame {

    /**
     * Creates new form ThreadState
     */
    public ThreadState() {
        initComponents();
        thread1.setOpaque(true);
        thread2.setOpaque(true);
        thread3.setOpaque(true);
        thread4.setOpaque(true);
        thread5.setOpaque(true);
        thread6.setOpaque(true);
        thread7.setOpaque(true);
        Thread8.setOpaque(true);
        thread9.setOpaque(true);
        thread10.setOpaque(true);

    }

    public void changeState(KontoBenutzer t1, KontoBenutzer t2, KontoBenutzer t3, KontoBenutzer t4, KontoBenutzer t5, KontoBenutzer t6, KontoBenutzer t7, KontoBenutzer t8, KontoBenutzer t9, KontoBenutzer t10) {
        if (t1.getState() == Thread.State.WAITING || t1.getState() == Thread.State.TERMINATED) {
            thread1.setBackground(Color.red);
        } else {
            thread1.setBackground(Color.green);
        }
        if (t2.getState() == Thread.State.WAITING || t2.getState() == Thread.State.TERMINATED) {
            thread2.setBackground(Color.red);
        } else {
            thread2.setBackground(Color.green);
        }
        if (t3.getState() == Thread.State.WAITING || t3.getState() == Thread.State.TERMINATED) {
            thread3.setBackground(Color.red);
        } else {
            thread3.setBackground(Color.green);
        }
        if (t4.getState() == Thread.State.WAITING || t4.getState() == Thread.State.TERMINATED) {
            thread4.setBackground(Color.red);
        } else {
            thread4.setBackground(Color.green);
        }
        if (t5.getState() == Thread.State.WAITING || t5.getState() == Thread.State.TERMINATED) {
            thread5.setBackground(Color.red);
        } else {
            thread5.setBackground(Color.green);
        }
        if (t6.getState() == Thread.State.WAITING || t6.getState() == Thread.State.TERMINATED) {
            thread6.setBackground(Color.red);
        } else {
            thread6.setBackground(Color.green);
        }
        if (t7.getState() == Thread.State.WAITING || t7.getState() == Thread.State.TERMINATED) {
            thread7.setBackground(Color.red);
        } else {
            thread7.setBackground(Color.green);
        }
        if (t8.getState() == Thread.State.WAITING || t8.getState() == Thread.State.TERMINATED) {
            Thread8.setBackground(Color.red);
        } else {
            Thread8.setBackground(Color.green);
        }
        if (t9.getState() == Thread.State.WAITING || t9.getState() == Thread.State.TERMINATED) {
            thread9.setBackground(Color.red);
        } else {
            thread9.setBackground(Color.green);
        }
        if (t10.getState() == Thread.State.WAITING || t10.getState() == Thread.State.TERMINATED) {
            thread10.setBackground(Color.red);
        } else {
            thread10.setBackground(Color.green);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        thread1 = new javax.swing.JLabel();
        thread2 = new javax.swing.JLabel();
        thread3 = new javax.swing.JLabel();
        thread4 = new javax.swing.JLabel();
        thread5 = new javax.swing.JLabel();
        thread6 = new javax.swing.JLabel();
        thread7 = new javax.swing.JLabel();
        Thread8 = new javax.swing.JLabel();
        thread9 = new javax.swing.JLabel();
        thread10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(10, 1));

        thread1.setText("Thread-1");
        getContentPane().add(thread1);

        thread2.setText("Thread-2");
        getContentPane().add(thread2);

        thread3.setText("Thread-3");
        getContentPane().add(thread3);

        thread4.setText("Thread-4");
        getContentPane().add(thread4);

        thread5.setText("Thread-5");
        getContentPane().add(thread5);

        thread6.setText("Thread-6");
        getContentPane().add(thread6);

        thread7.setText("Thread-7");
        getContentPane().add(thread7);

        Thread8.setText("Thread-8");
        getContentPane().add(Thread8);

        thread9.setText("Thread-9");
        getContentPane().add(thread9);

        thread10.setText("Thread-10");
        getContentPane().add(thread10);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Thread8;
    private javax.swing.JLabel thread1;
    private javax.swing.JLabel thread10;
    private javax.swing.JLabel thread2;
    private javax.swing.JLabel thread3;
    private javax.swing.JLabel thread4;
    private javax.swing.JLabel thread5;
    private javax.swing.JLabel thread6;
    private javax.swing.JLabel thread7;
    private javax.swing.JLabel thread9;
    // End of variables declaration//GEN-END:variables
}