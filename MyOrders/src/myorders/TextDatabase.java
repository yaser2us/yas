/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myorders;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author Yasser
 */
public class TextDatabase implements IDatabase {
    
    @Override
    public void Connection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Disconnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> void Write(T xObject, String xTableName) {
         try{    		
    		
             File file =new File(xTableName.toString());
                
             if(!file.exists()){
    			file.createNewFile();}

             FileWriter fileWritter = new FileWriter(file.getName(),true);
            
             try (BufferedWriter bufferWritter = new BufferedWriter(fileWritter)) {
                bufferWritter.write(xObject.toString()+"\r\n");
            }
 
             System.out.println("Writing at " + xTableName  + "Done");
 
    	}catch(IOException e){
            e.printStackTrace();
    	}
    }

    @Override
    public <T> void Write(LinkedList<T> xObject, String xTableName) {
        
         try{    		
    		
            File file =new File(xTableName.toString());
                
            if(!file.exists()){
    			file.createNewFile();}
 
            FileWriter fileWritter = new FileWriter(file.getName(),true);
 
            try (BufferedWriter bufferWritter = new BufferedWriter(fileWritter)) {
                
                for (Object x : xObject){
                    bufferWritter.write(x.toString()+"\r\n");
                }
                            
            }
 
	    System.out.println("Writing at " + xTableName  + "Done");
 
    	}catch(IOException e){
            e.printStackTrace();
    	}
        
    }

    @Override
    public <T> void Read(T xObject, String xTableName) {
          
    }

    @Override
    public <T> LinkedList<T> Read(String xTableName, int xColumnNumber) {

        LinkedList<T> xList = new LinkedList();

        try {
            switch (xTableName) {
                case "customer.txt":
                    xList.add((T) new Customer("Ali Hesham", "ali@yahoo.com", 10));
                    xList.add((T) new Customer("Hesham Rahman", "rahman@yahoo.com", 11));
                    xList.add((T) new Customer("Alex Lee", "alex@yahoo.com", 13));
                    xList.add((T) new Customer("Maria", "maria@yahoo.com", 14));
                    xList.add((T) new Customer("Ralf Wee", "ralf.wee@yahoo.com", 15));
                    break;
                case "employee.txt":
                    xList.add((T) new Manager(10, "Ali Nori Zadeh", "ali@yahoo.com", "0176159404", 7000, 500, true));
                    xList.add((T) new Cashier(12, "Hesham Aslan Mohd", "rahman@yahoo.com", "0176152532", 2000, 100, false));
                    xList.add((T) new Staff(14, "Alex Tom", "alex@yahoo.com", "0176151245", 3000, 200, true));
                    xList.add((T) new Staff(16, "Sara Lee", "maria@yahoo.com", "0112457851", 3000, 200, true));
                    xList.add((T) new Chief(18, "Amir Ahmad Sadat", "ralf.wee@yahoo.com", "012451223", 5000, 700, true));
                    break;
                case "order.txt":
                    xList.add((T) new OrderItem(1, 700, new SingleRoom(10, "Single Room 001", 700, 0, true, "01-01-2015", 800)));
                    xList.add((T) new OrderItem(2, 500, new SingleRoom(11, "Single Room 001", 200, 0, true, "01-03-2015", 800)));
                    xList.add((T) new OrderItem(3, 1700, new SingleRoom(12, "Single Room 001", 1700, 0, true, "01-04-2015", 800)));
                    xList.add((T) new OrderItem(4, 200, new SingleRoom(13, "Single Room 001", 700, 0, true, "01-05-2015", 800)));
                    xList.add((T) new OrderItem(5, 200, new DoubleRoom(14, "Double Room 011", 700, 0, true, "01-03-2015", 800)));
                    break;
                case "product.txt":
                    xList.add((T) new SingleRoom(10, "Single Room 001", 700, 0, true, "01-01-2015", 800));
                    xList.add((T) new SingleRoom(11, "Single Room 002", 800, 0, true, "01-01-2015", 900));
                    xList.add((T) new SingleRoom(12, "Single Room 003", 900, 0, true, "02-01-2015", 1000));
                    xList.add((T) new SingleRoom(13, "Single Room 004", 1100, 0, false, "02-01-2015", 1200));
                    xList.add((T) new DoubleRoom(14, "Double Room 011", 100, 0, true, "02-01-2015", 200));
                    xList.add((T) new DoubleRoom(15, "Double Room 012", 100, 0, true, "02-01-2015", 200));
                    break;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        return xList;
    }

    @Override
    public <T> void Update(LinkedList<T> xObject, String xTableName) {
        try{    		
    		
            File file =new File(xTableName.toString());
            file.createNewFile();

            FileWriter fileWritter = new FileWriter(file.getName(),false);
            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);

            for (Object x : xObject){
                bufferWritter.write(x.toString()+"\r\n");
            }
            
            bufferWritter.close();
	    System.out.println("Writing at " + xTableName  + "Done");
 
    	}catch(IOException e){
            e.printStackTrace();
    	}
    }

    @Override
    public void Write(String xOutput, String xFilename) {
        try{    		
    		
             File file =new File(xFilename.toString());
                
             file.createNewFile();

             FileWriter fileWritter = new FileWriter(file.getName(),false);
            
             try (BufferedWriter bufferWritter = new BufferedWriter(fileWritter)) {
                bufferWritter.write(xOutput.toString()+"\r\n");
            }
 
             System.out.println("Writing at " + xFilename  + "Done");
 
    	}catch(IOException e){
            e.printStackTrace();
    	}
    }
    
    
}
