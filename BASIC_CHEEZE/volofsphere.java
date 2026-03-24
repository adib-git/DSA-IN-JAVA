package Basic_Cheeze;

import java.util.Scanner;

public class volofsphere {
    static void main() {
        Scanner sc = new Scanner(System.in); // input lene ke liye
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        double v = 4/3*3.14*r*r*r;
        System.out.print("Area is: ");
        System.out.println(v);
    }
}
