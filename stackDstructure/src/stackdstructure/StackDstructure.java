/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdstructure;

/**
 *
 * @author Mian Ahsan
 */
import java.util.Stack;
public class StackDstructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Stack<Integer> stack =new Stack()<>;
        
        Stack<Integer> stackOfCards = new Stack<>();
    
        stackOfCards.push(1);
        stackOfCards.push(2);
        stackOfCards.push(3);
        
        System.out.println(stackOfCards.pop());
        System.out.println(stackOfCards.pop());
        
          System.out.println(stackOfCards.pop());
    }
    
}
