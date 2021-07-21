/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;
import java.util.Scanner;
/**
 *
 * @author Shamili
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
   
    System.out.println("Enter the number of minutes:");
    int minutes = input.nextInt();

    
    int year = minutes / 525600;
    
    int remainingMinutes = minutes % 525600;
int day = remainingMinutes / 1440;

   
      System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");  
        
    }
    
}
