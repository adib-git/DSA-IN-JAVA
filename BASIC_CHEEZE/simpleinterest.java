package Basic_Cheeze;

import java.util.Scanner;

public class simpleinterest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.println(si);


    }
}
