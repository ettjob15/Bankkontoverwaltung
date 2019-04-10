package com.mycompany.bankkontoverwaltung;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Transaction extends AbstractTableModel {

    private ArrayList<TransactionDatabase> db2 = new ArrayList<>();

    @Override
    public int getRowCount() {
        return db2.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return db2.get(rowIndex).getUser();
            case 1:
                return db2.get(rowIndex).getHat();
            case 2:
                return db2.get(rowIndex).getMoney();
            case 3:
                return db2.get(rowIndex).getEingezahlt();
            default:
                return "error";
        }
    }

    public void add(TransactionDatabase db) {
        db2.add(db);
        this.fireTableDataChanged();
    }
    public void del()
    {
        db2.clear();
    }
}
