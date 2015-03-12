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
public class CustomerManager extends ObjectManager {
    LinkedList<Customer> xList = new LinkedList<>();
    
    CustomerManager(){
        xList = xBusinessLogic.getCustomers();              
    }

    public void RefreshTable(DefaultTableModel aCustomerModel, JTable tblCustomer) {
        aCustomerModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Object[] tableReportColumnNames = new Object[3];
        tableReportColumnNames[0] = "ID";
        tableReportColumnNames[1] = "Name";
        tableReportColumnNames[2] = "Email";
        
        aCustomerModel.setColumnIdentifiers(tableReportColumnNames);
        Object[] objects = new Object[3];
        ListIterator<Customer> xItem = xList.listIterator();
        while (xItem.hasNext()) {
            Customer xCustomer = xItem.next();
            objects[0] = xCustomer.ID;
            objects[1] = xCustomer.Fullname;
            objects[2] = xCustomer.Email;
            aCustomerModel.addRow(objects);
        }
        tblCustomer.setModel(aCustomerModel);
    }

    public void Insert(Customer xCustomer) {
        xCustomer.ID = xList.get(xList.size()-1).ID+3;
        xList.add(xCustomer);
    }

    public String Delete(int EmpID) {
        String xResult = "";
        for(Customer objCustomer : xList){
            if(objCustomer.ID == EmpID){
                xList.remove(objCustomer);
                xResult = "The selected Customer is deleted.";
                break;
            } else {
                xResult = "The selected Customer is not deleted.";            
            }        
        }
        return xResult;
    }

    public String Update(Customer xCustomer) {
        String xResult = "";
        for(Customer objCustomer : xList){
            if(objCustomer.ID == objCustomer.ID){
                objCustomer.Fullname  = xCustomer.Fullname;
                objCustomer.Email = xCustomer.Email;                
                xResult = "The selected Customer is updated.";
                break;
            } else {
                xResult = "The selected Customer is not updated.";            
            }        
        }
        return xResult;
    }

    public Customer getCustomer(int CustomerID) {
         for(Customer objCustomer : xList){
            if(objCustomer.ID == CustomerID){
                return objCustomer;                
            }        
        }
         return new Customer();
    }
    
}
