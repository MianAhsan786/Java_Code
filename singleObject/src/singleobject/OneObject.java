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
public class OneObject {
    
    private static OneObject oneObj = null;
    
    public String s;
    
    private OneObject(){
    
        // create object of the is class
        s= "helo";
    }
    
    public static OneObject getInstance(){
        
        if(oneObj == null){
            
            oneObj = new OneObject();
           
        }
        
        return oneObj;
    }
}
