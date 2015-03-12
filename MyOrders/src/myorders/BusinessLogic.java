/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myorders;

import java.util.LinkedList;

/**
 *
 * @author Yasser
 */
public class BusinessLogic {
    
    IDatabase DataProvider;
    
    BusinessLogic(IDatabase xDataProvider)
    {
        this.DataProvider = xDataProvider; 
    }
      
    public LinkedList<Customer> getCustomers()
    {
        LinkedList<Customer> xList = DataProvider.Read(Utility.CustomerDB(),8);        
        return xList;
    }
    
    public LinkedList<Product> getProducts() 
    {
        LinkedList<Product> xList = DataProvider.Read(Utility.ProductDB(), 8);
        return xList;
    }
    
    public LinkedList<OrderItem> getOrders() 
    {
        LinkedList<OrderItem> xList = DataProvider.Read(Utility.OrderDB(), 8);
        return xList;
    }
    
    public LinkedList<Emp> getEmployees() 
    {
        LinkedList<Emp> xList = DataProvider.Read(Utility.EmployeeDB(), 8);
        return xList;
    }
    
    public Customer getCustomer(String ID)
    {
        LinkedList<Customer> xList = this.getCustomers();       
        for(Customer xObj:xList)
        {
            if (xObj.Email.equals(ID))
            {
                return xObj;
            }
        }        
        return null;
    }
    
    public Product getProduct(int ID)
    {
        LinkedList<Product> xList = this.getProducts();               
        for(Product xObj:xList)
        {
            if (xObj.ID == ID)
            {
                return xObj;
            }
        }        
        return null;
    }
    
    public OrderItem getOrder(int ID)
    {
        LinkedList<OrderItem> xList = this.getOrders();               
        for(OrderItem xObj:xList)
        {
            if (xObj.ID == ID)
            {
                return xObj;
            }
        }        
        return null;
    }
    
    public Emp getEmployee(int ID)
    {
        LinkedList<Emp> xList = this.getEmployees();               
        for(Emp xObj:xList)
        {
            if (xObj.ID == ID)
            {
                return xObj;
            }
        }        
        return null;
    }
}
