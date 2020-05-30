package DzArrays;

import java.util.Random;

public class Randomizer {
    private final int rows;
    private final int columns;
    private final int bound;
    private int[] array;
    private int[][] matrixInt;
    private double[][] matrixDouble;


    public Randomizer(int rows, int columns,int bound){
        this.rows = rows;
        this.columns = columns;
        this.bound = bound;
    }

    public int[] arrayInt(){
        Random randomObject = new Random();
        int[] array = new int[columns];
        for(int i = 0; i < columns; i++){
            array[i] = randomObject.nextInt(bound);
        }return this.array = array;

    }

    public int[][] matrixInt(){
        Random randomObject = new Random();
        int[][] matrix = new int[rows][columns];

        for(int i=0; i < rows;i++){
            for(int j=0; i < columns;j++){
                matrix[i][j] = randomObject.nextInt(bound);
                System.out.println();
            }
        }return this.matrixInt = matrix;

    }

    public double[][] matrixDouble(){
        Random randomObject = new Random();
        double[][] matrix = new double[rows][columns];

        for(int i=0; i < rows;i++){
            for(int j=0; i < columns;j++){
                matrix[i][j] = randomObject.nextDouble();
                System.out.println();
            }
        }return this.matrixDouble = matrix;

    }

    public int[][] matrixIntWrongSize(){
        Random randomObject = new Random();
        int[][] matrix = new int[rows][];
        for(int i=0; i < matrix.length;i++){
            matrix[i] = new int[randomObject.nextInt(columns)];
            for(int j=0; i < matrix[i].length;j++)
                matrix[i][j] = randomObject.nextInt(bound);
        }return this.matrixInt = matrix;
    }
}
