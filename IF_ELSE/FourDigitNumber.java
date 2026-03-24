package If_Else;

import java.util.Scanner;

public class FourDigitNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        if(n>999 && n<10000) System.out.println("4 Digit Number");
        else System.out.println("Not a 4 Digit Number");
    }
}
