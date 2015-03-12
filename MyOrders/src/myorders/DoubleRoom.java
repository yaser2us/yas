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
public class DoubleRoom extends Product {

    public boolean hasAirCondition;
    public boolean hasTV;
    
    public DoubleRoom(int ID, String Name, double Price, double Discount, boolean Availability, String PurchaseDate, double Purchase) {
        super(ID, Name, Price, Discount, Availability, PurchaseDate, Purchase);
    }
    
    public DoubleRoom( String Name, double Price, double Discount, boolean Availability, String PurchaseDate, double Purchase) {
        super( Name, Price, Discount, Availability, PurchaseDate, Purchase);
    }
   
    
}
