package Loops;

import java.util.Scanner;

public class ReverseofaNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int r =0;
        while(n!=0){
            r*=10;
            r+=(n%10);
            n/=10;
        }
        System.out.println(r);
    }
}
