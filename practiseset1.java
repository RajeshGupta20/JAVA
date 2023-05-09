import java.util.Scanner;
public class practiseset1 {
    public static void main(String[] args) {
        System.out.println("Practise Set-1");
        //1 Sum of three numbers
        int a=1;
        int b=10;
        int c=89;
        System.out.println(a+b+c);

    //2. sum of 3 subjects]
        int english=90;
        int maths=85;
        int science=88;
        float cgpa=(english+maths+science);
        System.out.println(cgpa/3);

        //3.
        Scanner raj=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= raj.next();
        System.out.println("Hello!"+ name + "have a good day");

        //4.integer or not
        System.out.println("Enter number");
        System.out.println(raj.hasNextInt());
        }

}
