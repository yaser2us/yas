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
public abstract class ObjectManager {
    
    BusinessLogic xBusinessLogic;
    
    public ObjectManager(){
        xBusinessLogic = new BusinessLogic(new TextDatabase());    
    }
    
}
