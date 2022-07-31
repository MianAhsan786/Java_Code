/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thiedlargest;

/**
 *
 * @author Mian Ahsan
 */
public class ThirdLargest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {1,4,2,3,5};
        int len = arr.length;
        int i,j,k,temp=0;
        for(i=0; i<arr.length; i++){
        
            for(j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                        
                    temp = arr[i];
                    
                    arr[i] = arr[j];
                    
                    arr[j] = temp;
                }
            }
        }
        System.out.println("" + arr[len-3]);
        for (int l = 0; l <arr.length; l++) {
            System.out.println("  " + arr[l]);
        }
        
        
    }
    
}
