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
public interface IDatabase {
    public void Connection();
    public void Disconnection();
    public void Write(String xOutput, String xFilename);
    public <T> void Write( T xObject, String xTableName);
    public <T> void Write( LinkedList<T> xObject, String xTableName);
    public <T> void Update( LinkedList<T> xObject, String xTableName);
    public <T> void Read( T xObject, String xTableName);
    public <T> LinkedList<T> Read(String xTableName,int xColumnNumber);
}
