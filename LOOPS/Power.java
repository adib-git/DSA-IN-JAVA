package Loops;

import java.util.Scanner;

public class Power {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= sc.nextInt();
        System.out.print("Enter the Power of the Number: ");
        int pow=sc.nextInt();
        int p=1;
        for(int i =1; i<=pow;i++){
            p *= n;
        }
        System.out.println(n+" raised to the power "+pow+" is "+p);
    }
}
