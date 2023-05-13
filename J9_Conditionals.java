public class J9_Conditionals {
    public static void main(String[] args) {

        // if-else
        // Relational operators
        // == > < >= =< !=

        String name="Rajesh";
        if(name=="Raj"){
            System.out.println("He is Capable for job");

        }
        else{
            System.out.println("No he is not capable for job");

        }
        int age=80;
        if (age>20){
            System.out.println("He is retired");

        }
        else {
            System.out.println("No he is not retired");
        }
        int numer=10;
        boolean name1=(numer<=11);
        if (name1){
            System.out.println("true");
        }
        else {
            System.out.println("false");

        }
        // logical operators
        //and
        int a= 8;
        int b=20;
        if(a>5 && b<100){
            System.out.println("true");

        }
        else{
            System.out.println(false);
        }
        //or
        if(a==8 || b==19){
            System.out.println("True");
        }
        else{
            System.out.println("Flase");
        }
        //
        boolean d=true;
        boolean e=false;
        System.out.println(!d);
        System.out.println(!e);
    }
}
