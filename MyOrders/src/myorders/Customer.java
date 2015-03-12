/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myorders;

import java.util.LinkedList;

/**
 *
 * @author danialnabizadeh
 */
public class Customer {
    
    public int ID;
    public String Fullname;
    public String Email;
    public String DOB;
    public LinkedList<Order> Orders;
    
    public Customer(){}
    
    public Customer(String Fullname, String Email){
        Orders = new LinkedList<>();
        this.Fullname=Fullname;
        this.Email = Email;
    }
    
    public Customer(String Fullname, String Email,int ID){
        Orders = new LinkedList<>();
        this.Fullname=Fullname;
        this.Email = Email;
        this.ID=ID;
    }
    
}
