/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumnterms;

/**
 *
 * @author Mian Ahsan
 * 
 * 
 */
import java.util.Scanner;
public class SumNterms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objInput = new Scanner(System.in);
        System.out.println("enter a number = ");
        int num = objInput.nextInt();
        
//       int answer = nSum(num);
//        System.out.println("n sum is = " + answer);
           nCube(num);
        }
    
//    public static int nSum(int num){
//        int count = 0;
//        for(int i = num; i>=0; i--){
//        
//            count = count + i;
//        }
//        
//        return count;
//    }
    
    public static void nCube(int num){
    
        for (int j=0; j<=num; j++){
            
            System.out.println("cube of = " + (j*j*j));
        }
    }
    
}
