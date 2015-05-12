/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsum;

/**
 *
 * @author brianhester
 */
public class MaxSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int N = 10;
        int M = 3;
        long max = Long.MIN_VALUE;
        long current = 0;

        long[] a = new long[N];
        a[0] = 10;
        a[1] = 2;
        a[2] = 3;
        a[3] = 7;
        a[4] = 5;
        a[5] = 9;
        a[6] = 2;
        a[7] = 8;
        a[8] = 5;
        a[9] = 1;
        
        int start = 0;
        int end = 0;
        int tempStart = 0;
        int tempEnd = 0;
        boolean tooLong = false;
        
        for(int i = 0; i < N; i++) {
            tempEnd = i;
            if(tempEnd - tempStart >= M) {
                tooLong = true;
                tempStart++;
            }
            current += a[i];
            if(tooLong == true) {
                current = current - a[i-M];
            }
            if(current > max) {
                max = current;
                end = tempEnd;
                start = tempStart;
            }
        }
        System.out.println("Max: " + max);
        System.out.print("Values: ");
        for(int i = start; i <= end; i++) {
            System.out.print(a[i]);
            if(i != end) {
                System.out.print(" + ");
            } else {
                System.out.print("\n");
            }
        }
    }
}
