/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author Shamili
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][]={{1,3,4},{2,4,3},{3,4,5}}; 
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};   
    
 //Addition
int c[][]=new int[3][3];   
System.out.println("Addition of Matrixes:");

for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];   
System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}    
//Multiplication
int d[][]=new int[3][3];   
System.out.println("Multiplication of Matrixes:");
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
d[i][j]=a[i][j]*b[i][j];   
System.out.print(d[i][j]+" ");    
}    

System.out.println();//new line    
}    
}}  
    
    

