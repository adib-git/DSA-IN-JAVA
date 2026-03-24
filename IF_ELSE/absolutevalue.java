package If_Else;

import java.util.Scanner;

/*absolute value means -ve ko +ve bana do aur +ve ko +ve rehne do*/

public class absolutevalue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        if(n>=0) System.out.println(n);
        else System.out.println(-n);
        /* if(n<0) n = -n;
        sout(n);
         */
    }
}
