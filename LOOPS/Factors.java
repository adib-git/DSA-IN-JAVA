package Loops;

import java.util.Scanner;

public class Factors {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        for(int i=1; i<=Math.sqrt(n); i++) {
            if(n%i==0){
                System.out.println(i);
                System.out.println(n/i);
            }
        }
    }
}
