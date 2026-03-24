package If_Else;

import java.util.Scanner;

public class SidesofTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of triangle a: ");
        int a = sc.nextInt();
        System.out.print("Enter side of triangle b: ");
        int b = sc.nextInt();
        System.out.print("Enter side of triangle c: ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b) System.out.println("Valid Triangle");
        else System.out.println("Invalid Triangle");
    }
}
