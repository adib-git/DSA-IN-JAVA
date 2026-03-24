package If_Else;

import java.util.Scanner;

public class DivisiblebyFiveorThree {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (n % 5 == 0 || n % 3 == 0) System.out.println("Number is Diviseble by 5 or 3");
        else System.out.println("Number is not Diviseble by 5 or 3");

    }
}
