/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myorders;

/**
 *
 * @author Yasser
 */
public class Utility {
    private final String _Seperator = ",,";
    private final String _Extension = ".txt";
    private final String _CustomerDB ="customer";
    private final String _EmployeeDB="employee";
    private final String _ProductDB="product";
    private final String _OrderDB="order";
    
    private static Utility Instance = null;
    
    private Utility(){}
    
    public static Utility getInstance()
    {
        synchronized(Utility.class){
            if(Instance==null)
            {
                Instance=new Utility();
            }      
        }
        return Instance;
    }
    
    public static String Separator()
    {
        return getInstance()._Seperator;
    }
    
    public static String CustomerDB()
    {
        return getInstance()._CustomerDB+Instance._Extension;
    }
     
    public static String EmployeeDB()
    {
        return getInstance()._EmployeeDB+Instance._Extension;
    }
    
    public static String ProductDB()
    {
        return getInstance()._ProductDB+Instance._Extension;
    }
    
    public static String OrderDB()
    {
        return getInstance()._OrderDB+Instance._Extension;
    }
}
