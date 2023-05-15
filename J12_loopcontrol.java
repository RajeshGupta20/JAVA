public class J12_loopcontrol {
    public static void main(String[] args) {
        //while loop
        int i = 100;
        while (i <= 200) {
            System.out.println(i);
            i++;
        }
        System.out.println("while loop ends here");

        // do while loop
        int a = 0;
        do {
            System.out.println(a);
            a++;
        }
        while (a < 10);
        System.out.println("do while loop ends here");

        // for loop
        for (int b = 0; b < 10; b++) {
            System.out.println(b);
        }
        System.out.println("for loop ends here");
// to print odd numbers using for loop
        int p = 3;
        for (int n = 0; n < p; n++) {
            System.out.println(2 * n + 1);
        }
        System.out.println("odd numbers generated");

        // decrementing  for  loop
        for (int l = 10; l >= 0; l--) {
            System.out.println(l);

        } System.out.println("decremneting");
        // print numbers in reversal order
        for(int o=10; o>=0 ; o--){
            System.out.println(o);
        }
        // break statement
        System.out.println("break");
        for(int m=0 ;m<=10 ; m++){
            System.out.println(m);


     if(m==9) {
         System.out.println("end");
         break;
     }
     }
// continue
        for(int v=0;v<=10; v++){
            if(v==5){
                System.out.println("Start Caluculating");
                continue;
            }
            System.out.println(v);
        }
        System.out.println("rj");
        int r= 20;
    while(r>15)  {
//        System.out.println(r);
//        r--;
//        if(r==16){
//            break;
//        }
        System.out.println(r);
        r--;
        if(r==17){
            System.out.println("br");
            continue;
        }



    }

    }
    }

