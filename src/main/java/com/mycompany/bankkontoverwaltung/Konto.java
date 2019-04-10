package com.mycompany.bankkontoverwaltung;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class Konto extends AbstractListModel {

    private ArrayList<Datenbank> db = new ArrayList<>();

    public void onAdd(String usrName) {
        db.add(new Datenbank(usrName));
    }

    @Override
    public int getSize() {
        return db.size();
    }

    @Override
    public Object getElementAt(int index) {
        return db.get(index).getName();
    }
    public void removeAll()
    {
        db.clear();
    }
}
