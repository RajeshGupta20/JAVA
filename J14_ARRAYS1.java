public class J14_ARRAYS1 {
    public static void main(String[] args) {
        //there are 3 methods to PRINT N ARRAY
        //1. Declaration and memory allocation
        int [] ipl;
        ipl= new int [5];
        ipl [0]=200;
        ipl [1]=400;
        ipl [2]=500;
        ipl [3]=700;
        ipl [4]=900;
        System.out.println(ipl[4]);

        //2. declaration  +   memory allocation
        int [] marks;
        marks= new int [1];


        // 3. declare  +  intialize

        String [] car={"BMW","skoda", "Benz", "MS", "KIA"};
        System.out.println(car[3]);
    }
}
