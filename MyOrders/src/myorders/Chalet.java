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
public class Chalet extends Product{

    public Chalet(int ID, String Name, double Price, double Discount, boolean Availability, String PurchaseDate, double Purchase) {
        super(ID, Name, Price, Discount, Availability, PurchaseDate, Purchase);
    }
    
       public Chalet( String Name, double Price, double Discount, boolean Availability, String PurchaseDate, double Purchase) {
        super(Name, Price, Discount, Availability, PurchaseDate, Purchase);
    }
    
}
