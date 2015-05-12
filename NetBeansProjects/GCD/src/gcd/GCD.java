/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author brianhester
 */
public class GCD {
    
    public static int euclidean(int b, int a) {
        
        // Assumption: gcd(-a,b) = gcd(a,-b) = gcd(a,b)
        b = Math.abs(b);
        a = Math.abs(a);
        
        // Assumption: gcd(b,a) = gcd(a,b)
        if(a > b) {
            int t = a;
            a = b;
            b = t;
        }
        
        if(b == 0 && a == 0) {
            System.err.println("a and b cannot both be zero.");
            return 0;
        }
        
        if(b == 0 || a == 0) {
            return b;
        }
        
        int r = b % a;
        int q = b / a;
        
        if(r <= 0) {
            return a;
        } else {
            return euclidean(a,r);
        }
    }
    
    public static int identity(int b, int a) {
        if(b == 0 && a == 0) {
            System.err.println("a and b cannot both be zero.");
            return 0;
        }
        
        // Assumption: gcd(-a,b) = gcd(a,-b) = gcd(a,b)
        b = Math.abs(b);
        a = Math.abs(a);
        
        // Assumption: gcd(b,a) = gcd(a,b)
        if(a > b) {
            int t = a;
            a = b;
            b = t;
        }
        
        int temp = 0;
        int least = Integer.MAX_VALUE;
        
        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                temp = (a * j) + (b * i * -1);
                if(temp < least && temp > 0) {
                    least = temp;
                }
                temp = (a * j * -1) + (b * i);
                if(temp < least && temp > 0) {
                    least = temp;
                }
            }
        }
        
        return least;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result1 = euclidean(1323, 0);
        System.out.println(result1);
        
        int result2 = euclidean(0, -561);
        System.out.println("The GCD for 0 and -561 is " + result2);
        
        int result3 = euclidean(8, 36);
        System.out.println("The GCD for 8 and 36 is " + result3);
        
        int result4 = euclidean(41204, 52308);
        System.out.println("The GCD for 41204 and 52308 is " + result4);
        
        int result1b = identity(55, 99);
        System.out.println(result1b);
        
        int result2b = identity(357, -561);
        System.out.println("The GCD for 357 and -561 is " + result2b);
        
        int result3b = identity(8, 36);
        System.out.println("The GCD for 8 and 36 is " + result3b);
        
        int result4b = identity(41204, 52308);
        System.out.println("The GCD for 41204 and 52308 is " + result4b);
    }
}
