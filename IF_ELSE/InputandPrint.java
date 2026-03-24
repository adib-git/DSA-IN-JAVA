package If_Else;

import java.util.Scanner;

public class InputandPrint {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        if(n%3==0 && n%5==0) System.out.println("Isha");
        else if(n%3==0) System.out.println("Riya");
        else if(n%5==0) System.out.println("Adib");
        else System.out.println("Apurva");


    }
}





