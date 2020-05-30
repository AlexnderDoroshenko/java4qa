package DzArrays;

/*
1. (ИСПОЛЬЗОВАТЬ РАНДОМ)Дана ровная матрица вещественных чисел 5х5.
 Вывести сумму значений её каждой из её диагоналей с 2 знаками после запятой.

2.(ИСПОЛЬЗОВАТЬ РАНДОМ)Дана не ровная матрица целых чисел, вывести наименьшее число из наибольших чисел в строках.

3.(ИСПОЛЬЗОВАТЬ РАНДОМ)Дана не ровная матрица целых чисел, посчитать и вывести сумму каждого столбца.
4.Дана строка: "Солнце сильно сопротивлялось,но Силы Природы несомненно сильнее.Ему пришлось зайти за горизонт и Серп Луны сменил его на небосводе."
        Посчитать количество слов. Слова меньше 3 букв не считаются.

5.Написать программу "Анализ характера". Пользователь должен ввести своё имя и пол. После чего ответить на ряд вопросов. В зависомости от его ответов должен появится результат. Ответ может быть формата да\нет, остальные форматы не принимаются. После ответа на вопросы должна появится его характеристика с именем вначале.
        Список характеристик:

        "никому никогда не врет или он умеет мастерски скрывать ложь."
        "всегда приходит вовремя. Возможно, он - повелитель времени!"
        "всегда при деньгах. Наверное, он леприкон с горшочком золота."
        "всегда такой стильный. Возможно, его предком был знаменитый дизайнер."
        "очень ленивый. Благодаря этой способности, он всегда делает всё на 100% хорошо."
        "очень веселый. Он знает анегдот на любую тему."

        В зависимости от пола, характеристика должна менятся.
        Пример:
        Для мужчины:
        "Артем очень веселый. Он знает анегдот на любую тему."
        Для женщины:
        "Юля очень веселая. Она знает анегдот на любую тему."
*/
public class DzArrays {
    public static void main(String[]args){

    }
// 1)
    public double[] diagonalsMatrixSum(int rows, int columns, int bound) {
        Randomizer matrix = new Randomizer(rows, columns, bound);
        int[][] localMatrix = matrix.matrixIntWrongSize();
        double[] result = new double[2];
        for (int i = 0; i < localMatrix.length; i++) {
            for (int j = 0; j < localMatrix[i].length; j++) {
                if (i == j);
                result[0] += localMatrix[i][j];
                result[1] += localMatrix[i][-j];
            }
        }return result;
    }
    // 2)
    public int matrixSum(int rows, int columns, int bound) {
        Randomizer matrix = new Randomizer(rows, columns, bound);
        int[][] localMatrix = matrix.matrixIntWrongSize();
        int summ = 0;
        for (int i = 0; i < localMatrix.length; i++) {
            for (int j = 0; j < localMatrix[i].length; j++) {
                summ += localMatrix[i][j];
            }
        }return summ;
    }
//3)
    public int smallestFromBig(int rows, int columns, int bound) {
        Randomizer matrix = new Randomizer(rows, columns, bound);
        int[][] localMatrix = matrix.matrixIntWrongSize();
        int result = 0;
        for (int i = 0; i < localMatrix.length; i++) {
            int biggest = 0;
            for (int j = 0; j < localMatrix[i].length; j++) {
                if(biggest < localMatrix[i][j])
                    biggest=localMatrix[i][j];
            }
            if(i == 0){
                result = biggest;
            }else{if(biggest<result) result = biggest;}
        }return result;
    }
    //4)
    public int wordsCount(String str){
        int count = 0;
        String[] textArray = str.split("\\p{P}|\\s");
        for(int i = 0; i < textArray.length; i++){
            if(textArray[i].length()<3)
                continue;
            else {count++;}
        }return count;
    }
}
