package HomeWork;

import java.util.ArrayList;

public class NewStringLesson {
    public static void main(String[] args){
        String example = "";
        String example1 = new String();

        String str = "Test";
        String str1 = "1";
        String sum = str + str1;
        System.out.println(sum);
        ArrayList<String> test;
        test = StringArrayLists.generateList(20);
        System.out.println(test);
        System.out.println(StringArrayLists.uniqueValuesCount(test));
        test = StringArrayLists.symmetricList(test);
        System.out.println(test);
        System.out.println(StringArrayLists.removeValue(test, "3"));
        System.out.println(StringArrayLists.removeAllMatches(test));
        System.out.println(StringArrayLists.uniqueValuesCount(test));
        System.out.println(StringArrayLists.addToSortedList(test, "a"));
        System.out.println(ArraylistsWH.testDellistValueFromEmptyList(test, "a"));

        System.out.println(ArraylistsWH.testDellistValueFromEmptyList(test, "ace"));


    }


}

