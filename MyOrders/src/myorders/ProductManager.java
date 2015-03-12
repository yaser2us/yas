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
public class ProductManager extends ObjectManager {

    LinkedList<Product> xList = new LinkedList<>();
    
    ProductManager(){
        xList = this.xBusinessLogic.getProducts();
    }

    public void RefreshTable(DefaultTableModel aProductModel, JTable tblProducts) {
        aProductModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Object[] tableReportColumnNames = new Object[5];
        tableReportColumnNames[0] = "ID";
        tableReportColumnNames[1] = "Name";
        tableReportColumnNames[2] = "Price";
        tableReportColumnNames[3] = "Discount";
        tableReportColumnNames[4] = "Purchase";

        aProductModel.setColumnIdentifiers(tableReportColumnNames);
        Object[] objects = new Object[5];
        ListIterator<Product> xItem = xList.listIterator();
        while (xItem.hasNext()) {
            Product xProduct = xItem.next();
            objects[0] = xProduct.ID;
            objects[1] = xProduct.Name;
            objects[2] = xProduct.Price;
            objects[3] = xProduct.Discount;
            objects[4] = xProduct.Purchase;
            aProductModel.addRow(objects);
        }
        tblProducts.setModel(aProductModel);
    }

    public void Insert(Product xProduct) {
        xProduct.ID = xList.get(xList.size()-1).ID+3;
        xList.add(xProduct);
    }

    public String Delete(int ProductID) {
        String xResult = "";
        for(Product objProduct : xList){
            if(objProduct.ID == ProductID){
                xList.remove(objProduct);
                xResult = "The selected product is deleted.";
                break;
            } else {
                xResult = "The selected product is not deleted.";            
            }        
        }
        return xResult;
    }

    public String Update(Product xProduct) {
        String xResult = "";
        for(Product objProduct : xList){
            if(objProduct.ID == xProduct.ID){
                objProduct.Availability = xProduct.Availability;
                objProduct.Discount = xProduct.Discount;
                objProduct.Name = xProduct.Name;
                objProduct.Price = xProduct.Price;
                objProduct.Purchase = xProduct.Purchase;
                objProduct.PurchaseDate = xProduct.PurchaseDate;
                xResult = "The selected product is updated.";
                break;
            } else {
                xResult = "The selected product is not updated.";            
            }        
        }
        return xResult;
    }

    public Product getProduct(int ProductID) {
         for(Product objProduct : xList){
            if(objProduct.ID == ProductID){
                return objProduct;                
            }        
        }
         return new Product();
    }
    
}
