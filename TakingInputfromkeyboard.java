import java.util.Scanner;

public class TakingInputfromkeyboard {
    public static void main(String[] args) {
        Scanner raj =new Scanner(System.in);
        System.out.println("Enter The Number 1:");
        int a= raj.nextInt();
        System.out.println("Enter The Number 2:");
        int b=raj.nextInt();
        System.out.println("sum:"+(a+b));
        System.out.println("Enter name:");
        String name=raj.next();

    }
}