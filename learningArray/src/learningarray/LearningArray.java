/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningarray;

/**
 *
 * @author Mian Ahsan
 */
class MinValue{

    static void min(int arr[]){
        int mini = arr[0];
        
        for(int i = 0; i<arr.length; i++){
            
            if(mini > arr[i]){
                mini = arr[i];
            }
        }
        System.out.println("  = " + mini); 
}       
}
public class LearningArray {

   
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//        int []a = new int[5];
//        
//        a[0] = 10;
//        a[1] = 10;
//        a[2] = 10;
//        a[3] = 10;
//        a[4] = 50;
        
        int a[] = {11,2,3,4,1};
        MinValue m = new MinValue();
        m.min(a);
        
        
//        int len = a.length;
//        System.out.println("len =  " + len);
//            for(int i=0; i<a.length; i++){
//                System.out.println(" " + a[i]);
//            }
        // for each loop
        
//        for(int i : a){
//            System.out.println(" " + i);
//        }

        int arr[] = getArray();
            for(int i=0;i<arr.length;i++)  
            System.out.println(arr[i]); 
    }
       static int[] getArray(){
    
        return new int[]{11,22,33};
    }
    

       
    
}

