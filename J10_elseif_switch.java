import java.util.Scanner;
public class J10_elseif_switch {
    public static void main(String[] args) {
        // else-if
        Scanner rak = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = rak.nextInt();
//        if (age < 10) {
//            System.out.println(" Your a boy");
//        }
//        else if (age>23){
//            System.out.println("your a men");
//        }
//    else {
//            System.out.println("your a uncle");
//        }



    //switch
        switch (age){
            case 12:
                System.out.println("boy");
                break;
            case 18:
                System.out.println("men");
                break;
            default:
                System.out.println("Job");
        }
        System.out.println("thanks for learning conditionals");
    }
}
