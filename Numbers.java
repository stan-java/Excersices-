/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author stanislavhadji
 */
public class Numbers {

    /**i
     * @param args the command line arguments
     */
    public static void main(String[] arg) {
     
    Scanner sc = new Scanner(System.in);
     System.out.println("Input: ");
     double celsius, farenheit;
     farenheit = sc.nextDouble();
        celsius = ((farenheit-32)*5/9);
        System.out.println(celsius);
    }
    
}
