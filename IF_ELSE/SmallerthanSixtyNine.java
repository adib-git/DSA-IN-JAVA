package If_Else;

import java.util.Scanner;

public class SmallerthanSixtyNine {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n<69) System.out.println("Smaller than 69");
        else System.out.println("Not Smaller than 69");

    }
}
