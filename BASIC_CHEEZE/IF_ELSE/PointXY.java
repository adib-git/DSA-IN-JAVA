package If_Else;

import java.util.Scanner;

public class PointXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        System.out.print("Enter Y: ");
        int y = sc.nextInt();

        //my way

//        if(x>0 && y>0) System.out.println("1st Quadrant");
//        else if(x>0 && y==0) System.out.println("X Axis");
//
//        else if(x<0 && y>0) System.out.println("2nd Quadrant");
//        else if(x<0 && y==0) System.out.println("X Axis");
//
//
//        else if(x<0 && y<0) System.out.println("3rd Quadrant");
//        else if(x==0 && y<0) System.out.println("Y Axis");
//
//        else if(x>0 && y<0) System.out.println("4th Quadrant");
//        else if(x==0 && y>0) System.out.println("Y Axis");
//
//        else if(x==0 && y==0) System.out.println("Origin");



        // written by AI
        if      (x == 0 && y == 0) System.out.println("Origin");

        else if (x > 0 && y > 0)   System.out.println("1st Quadrant");
        else if (x < 0 && y > 0)   System.out.println("2nd Quadrant");
        else if (x < 0 && y < 0)   System.out.println("3rd Quadrant");
        else if (x > 0 && y < 0)   System.out.println("4th Quadrant");

        else if (y == 0)            System.out.println("X Axis");
        else if (x == 0)            System.out.println("Y Axis");


    }
}
