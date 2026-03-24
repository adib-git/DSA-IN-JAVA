package If_Else;

import java.util.Scanner;

public class GreatestInThreeNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = sc.nextInt();

        System.out.print("Enter number b : ");
        int b = sc.nextInt();

        System.out.print("Enter number c : ");
        int c = sc.nextInt();

        //M1

//        if(a>=b && a>=c) System.out.println("a is the Greatest");
//
//        else {
//            if(b>= && b>=c) System.out.println("b is the Greatest");
//            else System.out.println("c is the Greatest");
//
//        }

        //M2

//        if(a>=b && a>c) System.out.println(a);
//        else if(b>=a && b>=c) System.out.println(b);
//        else System.out.println(c);

        //Nested if else

//        if(a>=b) { //b to max nhi hai
//            if(a>=c) System.out.println(a);
//            else System.out.println(c);
//        }
//
//        else { // b>a iska matlab a to max nhi hai
//            if(b>=a) System.out.println(b);
//            else System.out.println(c);
//        }

        //Through Ternary Operator
        int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Greatest: " + greatest);






        }

    }
