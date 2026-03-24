package If_Else;

import java.util.Scanner;

public class EvenOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();


//        if(n%2==0) {
//            System.out.println("Even Number");
//        }
//        else {
//            System.out.println("Odd Number");
//        }

        //Using Ternary Operator
        System.out.println((n%2==0)?"Even":"Odd");
    }
}

