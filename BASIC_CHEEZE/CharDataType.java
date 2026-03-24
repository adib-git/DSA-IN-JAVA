package Basic_Cheeze;

public class CharDataType {
    static void main() {
        //type casting - ek data type se doosre data type conversion
        char ch = 'A';
        int x = ch;//implicit typecasting
        System.out.println(x);

        char piyush = 'a';
        int y = (int)piyush;//explicit typecasting(dikha kar karna)
        System.out.println(y);

        char harsh = '3';
        System.out.println((int)harsh);
        
        /* char ch = 'b';
        System.out.println(ch); //b
        System.out.println(ch+0); //98
        System.out.println(ch+ch); //196
        System.out.println(ch*ch); //9604  */


//          //integer to character
//        int x = 32;// (space(32))
//        char ch =(char)x; //explicit type casting
//       char ch =x; //implicit type casting nahi hoga error ayega
//        System.out.println(ch);



    }
}
