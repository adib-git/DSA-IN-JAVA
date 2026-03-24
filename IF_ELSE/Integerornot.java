package If_Else;

import java.util.Scanner;

// Q . take real number input and check if it is integer or not
public class Integerornot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        /* written by myself
        if (n % 1.0 == 0.0) System.out.println("Integer");
        else System.out.println("Not an Integer"); */

       /* int x = (int)n;
        if (n-x > 0) System.out.println("Not an Integer");
        else System.out.println("Is an Integer");
       */
        if (n == (int)n) System.out.println("Not an Integer");
        else System.out.println("Is an Integer");

    }


}
