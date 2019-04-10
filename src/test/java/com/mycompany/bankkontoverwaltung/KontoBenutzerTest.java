/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankkontoverwaltung;

import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jörg
 */
public class KontoBenutzerTest {

    public KontoBenutzerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @org.junit.Test
    public void testUser() throws Exception {
        Transaction trans = new Transaction();
        KontoGUI gui = new KontoGUI();
        Konto k = new Konto();
        k.onAdd("name");
        ActiveTransaction money = new ActiveTransaction(new JLabel(), 50, trans);
        System.out.println("TestRandomUser");
        KontoBenutzer instance = new KontoBenutzer(money, k, gui, 0, trans);

        if (!instance.getUser().equals("name")) {
            fail("Nicht erwarteter name");
        } else {
            System.out.println(instance.getUser());
        }
    }

}
