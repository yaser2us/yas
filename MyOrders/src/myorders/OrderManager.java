/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myorders;

import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mahyar
 */
public class OrderManager extends ObjectManager {
    
     LinkedList<OrderItem> xList = new LinkedList<>();
    
    OrderManager(){
        xList = xBusinessLogic.getOrders();
    }
  
    public void RefreshReportTable(DefaultTableModel aOrderItemModel, JTable tblOrderItem) {
        aOrderItemModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Object[] tableReportColumnNames = new Object[4];
        tableReportColumnNames[0] = "QTY";
        tableReportColumnNames[1] = "Price";
        tableReportColumnNames[2] = "Product";
        tableReportColumnNames[3] = "Date";
        
        aOrderItemModel.setColumnIdentifiers(tableReportColumnNames);
        Object[] objects = new Object[4];
        ListIterator<OrderItem> xItem = xList.listIterator();
        while (xItem.hasNext()) {
            OrderItem xOrderItem = xItem.next();
            objects[0] = xOrderItem.Qty;
            objects[1] = xOrderItem.TotalPrice * xOrderItem.Qty;
            objects[2] = xOrderItem.Product.Name;
            objects[3] = xOrderItem.Product.PurchaseDate;
            aOrderItemModel.addRow(objects);
        }
        tblOrderItem.setModel(aOrderItemModel);
    }
    
    public void RefreshTable(DefaultTableModel aOrderItemModel, JTable tblOrderItem) {
        aOrderItemModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Object[] tableReportColumnNames = new Object[3];
        tableReportColumnNames[0] = "QTY";
        tableReportColumnNames[1] = "Price";
        tableReportColumnNames[2] = "Product";
        
        aOrderItemModel.setColumnIdentifiers(tableReportColumnNames);
        Object[] objects = new Object[3];
        ListIterator<OrderItem> xItem = xList.listIterator();
        while (xItem.hasNext()) {
            OrderItem xOrderItem = xItem.next();
            objects[0] = xOrderItem.Qty;
            objects[1] = xOrderItem.TotalPrice * xOrderItem.Qty;
            objects[2] = xOrderItem.Product.Name;
            aOrderItemModel.addRow(objects);
        }
        tblOrderItem.setModel(aOrderItemModel);
    }

    public void Insert(OrderItem xOrderItem) {
        if (xList.size() > 0) {
            xOrderItem.ID = 3;
            xList.add(xOrderItem);
        } else {
            xOrderItem.ID = 1;
            xList.add(xOrderItem);
        }
    }

    public String Delete(int OrderItemID) {
        String xResult = "";
        for(OrderItem objOrderItem : xList){
            if(objOrderItem.ID == OrderItemID){
                xList.remove(objOrderItem);
                xResult = "The selected OrderItem is deleted.";
                break;
            } else {
                xResult = "The selected OrderItem is not deleted.";            
            }        
        }
        return xResult;
    } 
    
     public double TotalOrder() {
        double xResult = 0;
        for(OrderItem objOrderItem : xList){
            xResult += objOrderItem.Qty * objOrderItem.TotalPrice; 
        }
        return xResult;
    } 
}
