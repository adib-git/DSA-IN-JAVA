package If_Else;

import java.util.Scanner;

public class AreaandPerimeterofRectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of Rectangle: ");
        int l = sc.nextInt();

        System.out.println("Enter breath of Rectangle: ");
        int b = sc.nextInt();

        if(l*b>l+b) System.out.println("Area is Greater");
        else System.out.println("Perimeter is Greater");

    }
}
