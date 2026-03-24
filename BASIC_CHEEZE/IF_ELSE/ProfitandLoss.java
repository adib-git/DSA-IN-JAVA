package If_Else;

import java.util.Scanner;

public class ProfitandLoss {
    static void main () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CP: ");
        int cp = sc.nextInt();
        System.out.println("Enter SP: ");
        int sp = sc.nextInt();

//        if(sp>cp) System.out.println("Profit is "+ (sp-cp));
//        if(cp>sp) System.out.println("Loss is "+ (sp-cp));
//        if(sp==cp) System.out.println("No Profit No Loss");


        if(sp>cp) System.out.println("Profit is "+ (sp-cp));
       else if(cp>sp) System.out.println("Loss is "+ (sp-cp));
        else System.out.println("No Profit No Loss");
    }
}
