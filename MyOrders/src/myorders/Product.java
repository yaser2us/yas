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
public class Product {

    public int ID;
    public String Name;
    public double Price;
    public double Discount;
    public boolean Availability;
    public String PurchaseDate;
    public double Purchase;
    public String Cleaning;

    public Product(){}
    
    public Product(int ID, String Name, double Price, double Discount, boolean Availability, String PurchaseDate, double Purchase) {
        this.ID = ID;
        this.Name = Name;
        this.Price = Price;
        this.Discount = Discount;
        this.Availability = Availability;
        this.PurchaseDate = PurchaseDate;
        this.Purchase = Purchase;
    }

    public Product(String Name, double Price, double Discount, boolean Availability, String PurchaseDate, double Purchase) {
        this.Name = Name;
        this.Price = Price;
        this.Discount = Discount;
        this.Availability = Availability;
        this.PurchaseDate = PurchaseDate;
        this.Purchase = Purchase;
    }
}
