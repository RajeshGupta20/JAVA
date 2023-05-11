import java.util.Scanner;
public class J5_Practise_Set2 {
    public static void main(String[] args) {
        float a= 7/4.0f*9/2.0f;
        System.out.println(a);

        //2
        char grade ='B';
        grade = (char) (grade+8);
        System.out.println(grade);
        grade = (char)(grade-8);
        System.out.println(grade);

        //3
        Scanner raj= new Scanner (System.in);
        System.out.println("enter");
        int c= raj.nextInt();
        System.out.println(c>8);


        //4
        int v =2;
        int u=4;
        int h=1;
        int s=3;
        int k= (v*v-u*u)/2*h*s;
        System.out.println(k);

        //5
        System.out.println(7*49/7+32/7);
    }
}
