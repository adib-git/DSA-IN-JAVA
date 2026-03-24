package Loops;

import java.util.Scanner;

public class PrimeOrNot {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Not a Prime Number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;         // Found a divisor — no need to keep checking
            }
            // Do NOT print or conclude anything here mid-loop
        }

        // Only print AFTER the loop has finished checking all divisors
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
