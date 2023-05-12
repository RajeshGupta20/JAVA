public class J8_Practise_Set3 {
    public static void main(String[] args) {
        String name= "Rajesh Gupta";
        //1
        System.out.println(name.replace(" ","_"));
        //2
        System.out.println(name.toLowerCase());

        String letter=" Dear name1   thanks  a lot";
        System.out.println(letter.replace("name1","Rajesh"));
        //4
        System.out.println(letter.indexOf("  "));
        System.out.println(letter.indexOf("   "));

        String name2=" Dear Rajesh \n\t You have courier \n\t for your addres";
        System.out.println(name2);


    }
}
