package Loops;

import java.util.Scanner;

public class CompositeOrNot{

    static void main() {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        boolean isComposite = false;
        for(int i=2; i<n; i++){
            if(n%i==0){
                isComposite = true;
                break;
            }
        }
        if(isComposite) System.out.println("Composite Number");
        else System.out.println("Not a Composite Number");
    }
}
