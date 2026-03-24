package Loops;

import java.util.Scanner;

public class GPuptoNterms {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of terms: ");
        int n = sc.nextInt();
        System.out.print("Enter First terms: ");
        int a = sc.nextInt();
        System.out.print("Enter Common Ratio between terms: ");
        int r = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a*=r;
        }

    }
}
