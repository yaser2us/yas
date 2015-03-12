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
public class Payment {

    public int ID;
    public String Date;
    public int Amount;

    public Payment(int ID, String Date, int Amount) {

        this.ID = ID;
        this.Date = Date;
        this.Amount = Amount;
    }

    public Payment(String Date, int Amount) {

        this.Date = Date;
        this.Amount = Amount;
    }

    public void Add() {

    }

    public boolean Check() {
        if (Amount == 100) {
            return false;
        } else {
            return true;
        }
    }
}
