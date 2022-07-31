/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleobject;

/**
 *
 * @author Mian Ahsan
 */
public class SingleObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OneObject obj = OneObject.getInstance();
        
        OneObject obj1 = OneObject.getInstance();
        
        //obj.s;
        System.out.println("String from obj is " + obj.s);
        System.out.println("String from obj1 is " + obj1.s);
    }   
    
}
