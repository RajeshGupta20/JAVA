import java.sql.SQLOutput;

public class J7_String_operations {
    public static void main(String[] args) {
        //String operations
        String name="Rajesh";
        System.out.println("String Methods");
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String name1 = "Rajesh";
        System.out.println(name1);
        System.out.println(name1.trim());
        System.out.println(name.substring(1));
        System.out.println(name.substring(3 , 5));
        System.out.println(name1.replace('j','k'));
        System.out.println(name1.replace("Raj","Ram"));
        System.out.println(name.startsWith("Raj"));
        System.out.println(name.endsWith("h"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('j'));
        System.out.println(name.indexOf('h',3));
        System.out.println(name.lastIndexOf('h'));
        System.out.println(name.equals("Rajesh"));
        System.out.println(name.equalsIgnoreCase("RajESH"));


   //Escape Sequence Character
        System.out.println("hi Rajesh \n gupta");
        System.out.println("hi Rajesh \t gupta");
        System.out.println("hi Rajesh \' gupta");
        System.out.println("hi Rajesh \\ gupta");

    }

}
