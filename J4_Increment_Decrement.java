import java.util.Scanner;
public class J4_Increment_Decrement {
    public static void main(String[] args) {
        // increment
        Scanner raj=new Scanner (System.in);
        System.out.println("Enter your Number");
        int a= raj.nextInt();
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);

        //Decrement
        System.out.println(a--);
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);

        int y=7;
        int x= ++y+8;
       System.out.println(x);

       char A='B';
        System.out.println(A++);
    }

}
