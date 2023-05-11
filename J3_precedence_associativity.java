public class J3_precedence_associativity {
    public static void main(String[] args) {
        int a = 20/4-80*3;
        // precedene
        /*
        20/4=5
        80*3=240
        5-240=-235
         */
        System.out.println(a);

       double b= 35/2-20*8;
       /*
       associativity
       17.5-160=-143
        */
        System.out.println(b);

        //quiz
        int x=2;
        int y=4;
        System.out.println((x-y)/2);

        int d=1;
        int e=4;
        int f=5;
        int k = d*d - (4*f*e)/(2*d);
        System.out.println(k);
        int g=20/2-30*4;
        System.out.println(g);

        byte t=9;
        long h=1020202000333333l;
        System.out.println(t+h);


        int v=10;
        int q=25;
        int l= (v*v)-(q*q);
        System.out.println(l);
    }

}
