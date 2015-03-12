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
public abstract class Emp {

    public int ID;
    public String Name;
    public String Email;
    public String Contact;
    public int Salary;
    public double Benefit;
    public boolean Leave;

    public Emp(){}
    
    public Emp(int ID, String Name, String Email, String Contact, int Salary, double Benefit, boolean Leave){
        this.ID = ID;
        this.Name=Name;
        this.Email = Email;
        this.Contact = Contact;
        this.Salary = Salary;
        this.Benefit = Benefit;
        this.Leave = Leave;    
    }
    
    public Emp(String Name, String Email, String Contact, int Salary, double Benefit, boolean Leave){
        this.Name=Name;
        this.Email = Email;
        this.Contact = Contact;
        this.Salary = Salary;
        this.Benefit = Benefit;
        this.Leave = Leave;
    }
}
