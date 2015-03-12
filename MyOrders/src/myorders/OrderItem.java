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
public class OrderItem {

    public int ID;
    public int Qty;
    public Product Product;
    public String Comment;
    public Order Order;
    public double TotalPrice;

    public OrderItem(int Qty, double TotalPrice, Product Product) {
        this.Qty = Qty;
        this.TotalPrice = TotalPrice;
        this.Product = Product;
    }

    public OrderItem(int ID, Order Order, int Qty, double TotalPrice, Product Product) {
        this.ID = ID;
        this.Order = Order;
        this.Qty = Qty;
        this.TotalPrice = TotalPrice;
        this.Product = Product;
    }

    public OrderItem(Order Order, int Qty, double TotalPrice, Product Product) {

        this.Order = Order;
        this.Qty = Qty;
        this.TotalPrice = TotalPrice;
        this.Product = Product;
    }
    
}
