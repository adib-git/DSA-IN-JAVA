package Loops;

import java.util.Scanner;

public class TableofN {
    static void main() {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //10*n-n iterations hai
//        for(int i=1;i<=10*n;i++) {
//            if(i % n == 0) System.out.print(i+" ");
//        }

        //10 iterations hai loop me
//        for(int i=n; i<=10*n; i=i+n) {
//            System.out.println(i+" ");
//        }

        for(int i=1; i<=10;i=i+1) {
            System.out.print(i*n+" ");
        }
    }
}
