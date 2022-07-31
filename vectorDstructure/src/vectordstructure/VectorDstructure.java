/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectordstructure;

/**
 *
 * @author Mian Ahsan
 */
import java.util.Vector;

public class VectorDstructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Vector <Integer> vect = new Vector<>();
        
        System.out.println("initial size " + vect.size());
        System.out.println("initial size " + vect.capacity() + "\n");
        
        vect.add(1);
        vect.add(2);
        vect.add(3);
        
        
        System.out.println("initial size " + vect.size());
         System.out.println("initial size " + vect.capacity());
        
    }
    
}
