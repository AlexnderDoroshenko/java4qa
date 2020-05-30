package HomeWork;
import java.util.ArrayList;
public abstract class ArraylistsWH {

/*Для разработчиков:
        Реализовать методы для списка типа String
        1. Реализовать возможность удаления всех элементов списка с данным значением, возможность задать значение.
        2. Сделать список симетричным
        3. Определение, сколько уникальных значений содержится в списке.
        4. Удаление из списка элементов, значения которых уже встречались в предыдущих элементах.
        5. Для упорядоченного по алфавиту списка добавить новый элемент, сохранив упорядоченность списка.
        Для тестировщика:
        1. Реализовать тесты для методов разработчика
        2.* Реализовать возможность вызова тестов с разными значениями.*/


    public static void main(String[] args) {
        ArrayList<String> arList = new ArrayList<String>();
        arList.add("Test1");
        System.out.println(arList);
        arList.add("Test2");
        System.out.println(arList);
        arList.add("Test1");
        System.out.println(arList);

        arList = delListValue(arList, "Test1");
        System.out.println(arList);

        setListValue(arList, "Test3");
        System.out.println(arList);

        setListValue(arList, "Test4", 1);
        System.out.println(arList);

        arList = mirrorList(arList);
        System.out.println(arList);


    }

    //    1. Реализовать возможность:
//    1.1 удаления всех элементов списка с данным значением.
    public static ArrayList<String> delListValue(ArrayList<String> aL, String value) {
        ArrayList<String> aLTemp = aL;
        while (aLTemp.contains(value)) {
            aLTemp.remove(value);
        }
        return aLTemp;
    }

    //  1.2 Возможность задать значение.
    public static ArrayList<String> setListValue(ArrayList<String> aL, String value) {
        ArrayList<String> aLTemp = aL;
        aLTemp.add(value);
        return aLTemp;
    }

    public static ArrayList<String> setListValue(ArrayList<String> aL, String value, int index) {
        ArrayList<String> aLTemp = aL;
        if (index > aLTemp.size()) {
            System.out.println("Index " + index + " to set up is absent");
        } else if (index == aLTemp.size()) {
            aLTemp.add(index, value);
        } else {
            if (index < 0) {
                System.out.println("Index " + index + " doesn't exist");
            } else {
                aLTemp.set(index, value);
            }
        }
        return aLTemp;

    }

    //    2. Сделать список симетричным
    public static ArrayList<String> mirrorList(ArrayList<String> aL) {
        ArrayList<String> aLTemp = aL;
        ArrayList<String> aLTemp2 = new ArrayList<String>();
        for (int i = aLTemp.size() - 1; i >= 0; i--) {
            aLTemp2.add(aLTemp.get(i));
        }
        aLTemp.addAll(aLTemp2);
        return aLTemp;

    }

    public static boolean testDellistValueFromEmptyList(ArrayList<String> aL, String value) {
        delListValue(aL, value);
        if (aL.contains(value)) {
            return false;
        }
        return true;

    }

    public static boolean testSetListValue(ArrayList<String> aL, String value) {
        setListValue(aL, value);
        if (aL.get(0)!=value) {
            return false;
        }
        return true;
    }

    public static boolean testSetListValue(ArrayList<String> aL, String value, int index) {
        setListValue(aL, value);
        if (aL.get(index)!=value) {
            return false;
        }
        return true;
    }

    public static boolean testMirrorList(ArrayList<String> aL) {
        int counter = 0;
        if(aL.size()%2!=0)
            return false;
        for(int i=0;i<aL.size()/2;i++){
            if(aL.get(i)==aL.get(i-1)){
                counter++;
            }
        }
        if(aL.size()/2==counter)
            return true;
        return false;
    }
}
