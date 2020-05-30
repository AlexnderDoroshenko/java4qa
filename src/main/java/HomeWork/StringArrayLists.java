package HomeWork;

/*Реализовать методы для списка типа String
        1. Реализовать возможность удаления всех элементов списка с данным значением, возможность задать значение.
        2. Сделать список симетричным
        3. Определение, сколько уникальных значений содержится в списке.
        4. Удаление из списка элементов, значения которых уже встречались в предыдущих элементах.
        5. Для упорядоченного по алфавиту списка добавить новый элемент, сохранив упорядоченность списка.
        Для тестировщика:
        1. Реализовать тесты для методов разработчика
        2.* Реализовать возможность вызова тестов с разными значениями.*/

import java.util.ArrayList;
import java.util.Collections;

public abstract class StringArrayLists<list> {

    public static ArrayList<String> generateList(int number){
        ArrayList<String> newOne = new ArrayList<String>();
        for(int i=0; i<number; i++){
            String s=String.valueOf(i);
            newOne.add(s);
        }return newOne;
    }
    public static ArrayList<String> removeValue(ArrayList<String> list, String value) {
        ArrayList<String> result = list;
        if (result.contains(value)){
            result.remove(value);
            removeValue(result, value);
        }
        return result;
    }
    public static ArrayList<String> symmetricList(ArrayList<String> list){
        int counter = 0;
        ArrayList<String> invertion = new ArrayList<String>();
        for(String s: list){
            invertion.add(0, list.get(counter));
            counter++;
        }invertion.addAll(0, list);
        return invertion;
    }
    public static int uniqueValuesCount(ArrayList<String> list){
        int counter = 0;
        ArrayList<String> jertva = list;
        for(int i = 0; i<list.size(); i++){
            String v = list.get(i);
            int match = 0;
            for(int j = 0; j<list.size(); j++){
                if(i == j)
                    continue;
                if(jertva.get(i)==jertva.get(j)){
                    match++;
                    break;
                }
            }if(match!=0){
                match = 0;
                continue;
            }counter++;
        }return counter;
    }
    public static ArrayList<String> removeAllMatches(ArrayList<String> list) {
        ArrayList<String> result = list;
        for(int i = 0; i<list.size(); i++) {
            String v = list.get(i);
            int match = 0;
            for (int j = 0; j < list.size(); j++) {
                if (i != j && result.get(i) == result.get(j))
                    result.remove(j);
            }
        }return result;

    }
    public static ArrayList<String> addToSortedList(ArrayList<String> list, String element){
        list.add(element);
        Collections.sort(list);
        return list;
    }
}
