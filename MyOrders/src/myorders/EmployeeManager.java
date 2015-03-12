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
public class EmployeeManager extends ObjectManager {
    
    LinkedList<Emp> xList = new LinkedList<>();
    
    EmployeeManager(){
        xList = xBusinessLogic.getEmployees();               
    }

    public void RefreshTable(DefaultTableModel aEmpModel, JTable tblProducts) {
        aEmpModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Object[] tableReportColumnNames = new Object[6];
        tableReportColumnNames[0] = "ID";
        tableReportColumnNames[1] = "Name";
        tableReportColumnNames[2] = "Email";
        tableReportColumnNames[3] = "Contact";
        tableReportColumnNames[4] = "Salary";
        tableReportColumnNames[5] = "Type";

        aEmpModel.setColumnIdentifiers(tableReportColumnNames);
        Object[] objects = new Object[6];
        ListIterator<Emp> xItem = xList.listIterator();
        while (xItem.hasNext()) {
            Emp xEmployee = xItem.next();
            objects[0] = xEmployee.ID;
            objects[1] = xEmployee.Name;
            objects[2] = xEmployee.Email;
            objects[3] = xEmployee.Contact;
            objects[4] = xEmployee.Salary;
            String string = xEmployee.getClass().getName();
            String[] parts = string.split("\\.");
            String part1 = parts[1];
            objects[5] = part1 ;
            aEmpModel.addRow(objects);
        }
        tblProducts.setModel(aEmpModel);
    }

    public void Insert(Emp xEmp) {
        xEmp.ID = xList.get(xList.size()-1).ID+3;
        xList.add(xEmp);
    }

    public String Delete(int EmpID) {
        String xResult = "";
        for(Emp objEmp : xList){
            if(objEmp.ID == EmpID){
                xList.remove(objEmp);
                xResult = "The selected employee is deleted.";
                break;
            } else {
                xResult = "The selected employee is not deleted.";            
            }        
        }
        return xResult;
    }

    public String Update(Emp xEmployee) {
        String xResult = "";
        for(Emp objEmployee : xList){
            if(objEmployee.ID == xEmployee.ID){
                objEmployee.Benefit = xEmployee.Benefit;
                objEmployee.Contact = xEmployee.Contact;
                objEmployee.Name = xEmployee.Name;
                objEmployee.Leave = xEmployee.Leave;
                objEmployee.Salary = xEmployee.Salary;                
                xResult = "The selected employee is updated.";
                break;
            } else {
                xResult = "The selected employee is not updated.";            
            }        
        }
        return xResult;
    }

    public Emp getEmployee(int EmployeeID) {
         for(Emp objEmployee : xList){
            if(objEmployee.ID == EmployeeID){
                return objEmployee;                
            }        
        }
         return new Staff();
    }
    
}
