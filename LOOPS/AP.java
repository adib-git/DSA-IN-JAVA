package Loops;

import java.util.Scanner;

public class AP {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter numbers of terms: ");
        int n = sc.nextInt();

//        for(int i=2; i<=3*n-1; i+=3) {
//            System.out.print(i+" ");
//        }

        System.out.print("Enter First terms: ");
        int a = sc.nextInt();
        System.out.print("Enter Difference between terms: ");
        int d = sc.nextInt();
        for(int i =1; i<=n ;i++){
            System.out.print(a+" ");
            a+=d;
        }




    }
}
