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
public interface IEmpAction {
    
    public void AddOrder();
    public void AddCustomer();
    public void EditOrder();
    public Order ViewOrder();
    public void RemoveOrder();
    
    }
