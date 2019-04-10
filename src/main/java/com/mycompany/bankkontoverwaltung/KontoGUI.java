package com.mycompany.bankkontoverwaltung;

import com.mycompany.bankkontoverwaltung.ActiveTransaction;
import com.mycompany.bankkontoverwaltung.Konto;
import com.mycompany.bankkontoverwaltung.KontoBenutzer;
import com.mycompany.bankkontoverwaltung.Transaction;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KontoGUI extends JFrame {

    JTextArea infortainment = new JTextArea();
    private final JList testen = new JList();
    private final double money = 50;
    private final JLabel lbMoney = new JLabel();
    private final Transaction vw2 = new Transaction();
    private final ActiveTransaction moneyClass = new ActiveTransaction(lbMoney, money, vw2);
    private final Konto vw = new Konto();
    private JLabel labelUsr;
   
    public static void main(String[] args) {
        KontoGUI bv = new KontoGUI();
        bv.setVisible(true);

    }

    public KontoGUI() {
        Container content = new Container();
        initComponents();
        content.setLayout(new BorderLayout());
        this.setSize(500, 400);
        this.setTitle("Bankkontoverwaltung");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setName("Bank");
        lbMoney.setText("Money:" + money);
    }

    public void testen() {
        if (vw.getSize() != 0) {
           
            KontoBenutzer t1 = new KontoBenutzer(moneyClass, vw,this,0,vw2);
            KontoBenutzer t2 = new KontoBenutzer(moneyClass, vw,this,1,vw2);
            KontoBenutzer t3 = new KontoBenutzer(moneyClass, vw,this,2,vw2);
            KontoBenutzer t4 = new KontoBenutzer(moneyClass, vw,this,3,vw2);
            KontoBenutzer t5 = new KontoBenutzer(moneyClass, vw,this,4,vw2);
            KontoBenutzer t6 = new KontoBenutzer(moneyClass, vw,this,5,vw2);
            KontoBenutzer t7 = new KontoBenutzer(moneyClass, vw,this,6,vw2);
            KontoBenutzer t8 = new KontoBenutzer(moneyClass, vw,this,7,vw2);
            KontoBenutzer t9 = new KontoBenutzer(moneyClass, vw,this,8,vw2);
            KontoBenutzer t10 = new KontoBenutzer(moneyClass, vw,this,9,vw2);
            t1.setPriority(10);
            t2.setPriority(10);
            t3.setPriority(10);
            t4.setPriority(10);
            t5.setPriority(10);
            t6.setPriority(10);
            t7.setPriority(10);
            t8.setPriority(10);
            t9.setPriority(10);
            t10.setPriority(10);
            
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            t6.start();
            t7.start();
            t8.start();
            t9.start();
            t10.start();
        } else {
            vw.onAdd(JOptionPane.showInputDialog("Bitte einen Namen eingeben!!!"));
            testen.updateUI();
        }

    }

    public void initComponents() {
        this.getContentPane().setLayout(new GridLayout(2, 2));
        this.getContentPane().add(lableUser());
        this.getContentPane().add(lableLog());
        this.getContentPane().add(lbMoney);
        this.getContentPane().add(new JLabel());

    }

    public JLabel lableUser() {
        labelUsr = new JLabel();
        labelUsr.setLayout(new BorderLayout());
        labelUsr.setText("User");
        JScrollPane scroll = new JScrollPane(labelUsr);
        testen.setModel(vw);
        labelUsr.add(new JLabel("User"), BorderLayout.NORTH);
        labelUsr.add(testen, BorderLayout.CENTER);
        JPopupMenu pop = new JPopupMenu();
        JMenuItem item = new JMenuItem("add user");
        pop.add(item);
        JMenuItem item2 = new JMenuItem("perform account test");
        pop.add(item2);
        testen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pop.setLocation(getPosition());
                pop.setVisible(true);
            }
        });
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                namenHinzufuegen();
                pop.setVisible(false);
            }
        });
        item2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vw2.del();
                testen();
                pop.setVisible(false);
            }
        });
        return labelUsr;
    }

    public JLabel lableLog() {
        JLabel labelLog = new JLabel();
        labelLog.setLayout(new BorderLayout());
        labelLog.add(new JLabel("Log"), BorderLayout.NORTH);
        labelLog.add(infortainment, BorderLayout.CENTER);
        return labelLog;
    }

    public void namenHinzufuegen() {
        String s = JOptionPane.showInputDialog("Bitte Namen Eingeben!!!");
        if (!s.isEmpty()) {
            vw.onAdd(s);
        } else {
            JOptionPane.showMessageDialog(null, "Keine Eingabe");
        }
        testen.updateUI();
    }

    public Point getPosition() {
        Point pos = this.getMousePosition();
        pos.translate(this.getLocation().x, this.getLocation().y);
        return pos;
    }
}
