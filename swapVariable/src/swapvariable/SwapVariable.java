/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapvariable;

/**
 *
 * @author Mian Ahsan
 */
import java.util.Scanner;
public class SwapVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
//        int a = 1 ,b=2,c=3;
//        c = a;
//        a = b;
//        
//        System.out.println(a+"\n "+ c );
//        
//        //swap numbbers
/**
 now reverse a string
 */
    Scanner objInput = new Scanner(System.in);
    System.out.println("enter a string = ");
    String str = objInput.nextLine();
        
   
        char print = str.charAt(1);
        
        System.out.println(print );
        
    }

 }
    
