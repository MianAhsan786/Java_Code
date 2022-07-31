/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transposematrix;

/**
 *
 * @author Mian Ahsan
 * square matrix problems
 * square matrix problems
 * square matrix problems
 * square matrix problems
 * square matrix problems
 * square matrix problems
 * square matrix problems
 * 
 */
public class SquareMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rows,cols;
        
        boolean flag = true;
        
        int a[][] = {
            {1,0,0},
            {0,1,0},
            {0,0,1},
            };  
        
            rows = a.length;
            cols = a[1].length; 
            
            //System.out.println("rows = " + rows);
            // cols = {1,0,0} one inner arraty ???
            //System.out.println("cols = " + cols);
            if(rows != cols){
                System.out.println("martix must be square");
            }
            else{
                //Checks if diagonal elements are equal to 1 and rest of elements are 0
                
                for(int i=0; i<rows; i++){
                    
                    for(int j=0; j<cols; j++){
                        
                       if(i == j && a[i][j] !=0){
                           flag = false;
                           break;
                       }
                       if(i!=j && a[i][j]!= 0 ){
                       
                        flag = false;
                        break;
                       }
                    }
                    
                }
                if(flag){
                    System.out.println("Matrix is square");
                }else{
                    System.out.println("Matrix is square");
                }
            }
    }
    
}
