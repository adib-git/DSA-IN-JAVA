package Loops;

import java.util.Scanner;

public class sumofdigitsofanumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
