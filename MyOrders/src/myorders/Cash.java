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
public class Cash extends Payment{

    public Cash(int ID, String Date, int Amount) {
        super(ID, Date, Amount);
    }
    
    public Cash( String Date, int Amount) {
        super( Date, Amount);
    } 
}
