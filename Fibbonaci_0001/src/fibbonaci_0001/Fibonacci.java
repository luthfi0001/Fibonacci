
package fibbonaci_0001;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args) {
        Scanner show = new Scanner(System.in);
        System.out.println("LuthfI Hafiyyan N");
        System.out.print("Input :  ");
        int n = show.nextInt();
        long bil[] = new long[n];
         
        bil[0] = 0;
        bil[1] = 1;
         
        for(int i = 2; i < n; i++) {
            bil[i] = bil[i-1] + bil[i-2];
        }
         
        System.out.println();
        System.out.println("Output :");
        for (int i = 0; i < n; i++) {           
            System.out.print(bil[i] +  " ");
        }
    }
 
}
