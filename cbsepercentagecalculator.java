import java.util.Scanner;
public class cbsepercentagecalculator {
    public static void main(String[] args) {
        Scanner raj=new Scanner(System.in);
        System.out.println("Enter Telugu Marks:");
        int a=raj.nextInt();
        System.out.println("Enter Sanskrit Marks:");
        int b=raj.nextInt();
        System.out.println("Enter English Marks:");
        int c=raj.nextInt();
        System.out.println("Enter Maths Marks:");
        int d=raj.nextInt();
        System.out.println("Enter Science Marks:");
        int e=raj.nextInt();
       int scored=a+b+c+d+e;
        System.out.println("Enter Total Marks:");
       int total_marks= raj.nextInt();


      double percentage = ((scored*100)/(total_marks));
        System.out.println("percentage::"+percentage);
    }
}

