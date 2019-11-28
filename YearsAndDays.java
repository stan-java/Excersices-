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
public class YearsAndDays {
    public static void main (String ... arg){
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Input Minutes: ");
    double years, minutes, days;
    minutes = sc.nextDouble();
    years = minutes/525600;
    days = minutes/1440;
    System.out.println("Years:" + years);
        System.out.println("Days:" + days);
}
