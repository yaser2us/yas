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
public class Order {

    public int ID;
    public String Date;
    public double Total;
    public Customer Customer;
    public LinkedList<OrderItem> OrderItems;
    public Payment Payment;

    public Order(String Date, double Total) {
        this.Date = Date;
        this.Total = Total;
    }

    public Order(int ID, String Date, double Total) {

        this.ID = ID;
        this.Date = Date;
        this.Total = Total;

    }

    public void Add() {

    }

    public Order View() {
        return this;
    }

    public Customer getcustomer() {

        return Customer;

    }
}
