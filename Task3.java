/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;
import java.util.Scanner;
/**
 *
 * @author Shamili
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int marks[]=new int [10];
        int i;
        float total=0,avg;
        Scanner scanner = new Scanner(System.in);
        for(i=0;i<6;i++)
        {
            System.out.println("enter marks of subject"+(i+1)+":");
            marks[i]=scanner.nextInt();
            total=total+marks[i];
        }
         System.out.println(  "The total marks is" + total); 
            avg=total/6;
            
                 System.out.println("The student grade is:");
                 if(avg>=80)
                 {
                     System.out.println("A");
                 }
                 else  if(avg>=60&&avg<80)
                 {
                     System.out.println("B");
                 }
                  else  if(avg>=50&&avg<60)
                 {
                     System.out.println("C");
                 }
                  else  if(avg>=40&&avg<50)
                 {
                     System.out.println("D");
                 }
                 else
                  {
                      System.out.println("F");
                  }
        }
    }
    

