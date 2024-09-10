import java.util.Scanner;

/**
 * My Solutions to Problem Set 1-1
 * @author Len Pelletier
 * Sept 10, 2024
 */

public class MySolutions {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Q1: Celsius --> Fahrenheit
        System.out.println("Celsius --> Fahrenheit");
        System.out.print("Enter a temperature in Celsius: ");
        double ctemp = input.nextDouble();
        double ftemp = ctemp * 9.0/5 + 32;
        System.out.println(ctemp + "° Celsius = " + ftemp + "° Fahrenheit");
        System.out.println("");
        
        //Q2: 
        System.out.println("BMI Calculator");
        
        System.out.print("Enter a weight in kg: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter a height in m: ");
        double height = input.nextDouble();
        
        double BMI    = weight / (height*height);
        System.out.println("A " + height + "m tall adult who weighs " +
                           weight + "kg has a BMI of " + BMI);
        System.out.println("");
                           
        //Q3: Days to Weeks and Days
        System.out.println("Days to Weeks and Days");
        
        System.out.print("Enter a number of days: ");
        int totalDays = input.nextInt();
        int weeks = totalDays / 7;
        int days  = totalDays % 7;
        System.out.println(totalDays + " days is equal to " + weeks + " weeks, " +
                           days + " days.");
        System.out.println("");
                           
        //Q4: Receipt generator
        System.out.println("Recipt Generator");
        
        System.out.print("Number of units you're buying: ");
        int units = input.nextInt();
        
        System.out.print("Price per unit: ");
        double price = input.nextDouble();
        
        System.out.print("Tax rate: ");
        double tax = input.nextDouble();
        
        double totalCost = (units * price) * (1+tax/100);
        System.out.println("Q4: Purchasing " + units + " units at $" + price + 
                           " with " + tax + "% tax will cost $" + totalCost); 
        System.out.println("");
        
        //Q5: Sum of digits (3-digit number)
        System.out.println("Sum of digits");
        
        System.out.print("Enter a positive, 3 digit number: ");
        int num = input.nextInt();

        int digit1   = num / 1   % 10; 
        int digit10  = num / 10  % 10;
        int digit100 = num / 100 % 10;
        System.out.println("Q5: The sum of the digits of " + num + " is " + (digit1 + digit10 + digit100));
    }
}
