/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.Scanner;

/**
 *
 * @author brianhester
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {    
        int number = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        while(number != -1) {
            number = reader.nextInt();
            boolean isPrime = isPrime(number);
            if (isPrime == false)
            {
                System.out.println("Number: " + number + " is not prime.");
            }
            else
            {
                System.out.println("Number: " + number + " is prime. ");
            }
        }
    }

    public static boolean isPrime(double num) {
        boolean isPrime = true;
        double i = 2;
        while (i <= Math.sqrt(num))
        {
            if (num % i == 0)
            {
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }
}
