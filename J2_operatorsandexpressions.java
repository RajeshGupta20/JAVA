public class J2_operatorsandexpressions {
    public static void main(String[] args) {
 //1. Arthimetic operators (+ - * / % ++ --)
//        int a=1;
//        int b=1;
//        int c =a+b;
//        System.out.println(c);
//        System.out.println(++c);
//      System.out.println(--c);
//
//        int d=4;
//        int e= 6 % d;
//        System.out.println(e);
        //2. Assingnment operators (=  +=)

//        int n=1;
//        n+= 4;
//        System.out.println(n);
        //3.comparison operator ( == <= >=)
//        System.out.println(2==2);
//        System.out.println(2==3);
//        System.out.println(2>=3);
//        System.out.println(2<=4);
        //4. logical operator
        System.out.println(1>2 && 1>0);
        System.out.println(1>2 || 1>0);
        System.out.println(10 & 2);
        int x=3 | 10;
        System.out.println(x);
//5. Bitwise
        System.out.println(!(1>5 && 2>5 )); // !returns opposite result
        System.out.println(6>5 & 6>5);
    }
}
