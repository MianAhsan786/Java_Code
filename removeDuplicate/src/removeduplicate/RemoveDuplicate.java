/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeduplicate;

/**
 *
 * @author Mian Ahsan
 */
public class RemoveDuplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count= 0,j=0;
        int array_one[] ={2,4,5,5,2};
        int len  = array_one.length;
        int array_two[] = {len};
        
        for(int i=0; i<len-1; i++){
        
             if(array_one[i] != array_one[i+1]){
                 array_one[j] = array_one[i]; 
                 j++;
             }
            }
        array_one[j] = array_one[array_one.length-1];
        
//            for (int i = 0; i <array_one.length; i++) {
//                System.out.println("+ = " + array_one[i] );
//        }
        }
    
    }

