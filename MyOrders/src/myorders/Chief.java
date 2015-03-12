/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myorders;

/**
 *
 * @author danialnabizadeh
 */
public class Chief extends Emp implements IEmpAction{

    public Chief(){}
    
    public Chief(int ID, String Name, String Email, String Contact, int Salary, double Benefit, boolean Leave){
        this.ID = ID;
        this.Name=Name;
        this.Email = Email;
        this.Contact = Contact;
        this.Salary = Salary;
        this.Benefit = Benefit;
        this.Leave = Leave;    
    }
    
    public Chief(String Name, String Email, String Contact, int Salary, double Benefit, boolean Leave){
        this.Name=Name;
        this.Email = Email;
        this.Contact = Contact;
        this.Salary = Salary;
        this.Benefit = Benefit;
        this.Leave = Leave;
    }
    
    @Override
    public void AddOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AddCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EditOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order ViewOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RemoveOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
