public class J15_FOREACHLOOP_ARRAYS2 {
    public static void main(String[] args) {
         int[] marks={10,8,7,9,10,8};
        System.out.println("printing an array using loop");
         for(int i=0; i< marks.length;i++){

             System.out.println(marks[i]);
         }
     //   String[] cars={"BMW","skoda", "Benz", "MS", "KIA"};
//        System.out.println("printing an array usuing for each loop");
//        for(int o=0;o<cars.length;o++){
//            System.out.println(cars[o]);



        int[] marks1={10,8,7,9,10,8};
        System.out.println("printing an array in reverse order");
        for(int k=marks1.length-1; k>=0 ;k--){
            System.out.println(marks1[k]);
        }

        //for each loop in java

            String[] cars={"BMW","skoda", "Benz", "MS", "KIA"};
            System.out.println("printing an array usuing for each loop");
            for(String element:cars){
                System.out.println(element);
            }
        }
    }

