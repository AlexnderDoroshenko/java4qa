package HomeWork;

import java.awt.datatransfer.StringSelection;

public class MethodsFunctions {
    public static void main(String[] args){
        int sInt1 = 5;
        int sInt2 = 6;
        double sDouble = 13.5;
        int[] array = {1,2,3,4,5,6,7,8};

        printLineString("sum" + sum(sInt1, sInt2));




    }

    public static void printLineString(String i) {

        System.out.println("variable" + i);
    }

    public static void printArray (int[] array){

        for (int index = 0; index < array.length; index++){
            System.out.print( " " + array[index] + "\n" );
        }
    }
    public static int sum(int a, int b){
        int summ = a + b;
        return summ;
    }
}
