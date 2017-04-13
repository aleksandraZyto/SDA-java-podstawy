package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-12.
 */
public class Zajecia7 {
    public static void main(String[] args) {
//        saveToMatrixExample();
//        displayMatrix(fillWithRandomNumbers(3,5));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert row number");
//        int rows = scanner.nextInt();
//        System.out.println("Insert column number");
//        int columns = scanner.nextInt();
//        displayMatrix(multiplyMatrixElementsByNumber(fillWithNubersFromUser(rows,columns),2));
//        sumOfMatrixElements(fillWithNubersFromUser(rows, columns));
//        int[][] matrix = {{1, 1, 1}, {3, 3, 3}, {2, 2, 2}};
//        displayMatrix(matrix);
//        indexOfHighestSum(matrix);
//        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
//        int[][] matrix2 = {{10, -2, 30}, {-4, 55, 16}};
//        displayMatrix(matrix1);
//        displayMatrix(matrix2);
//        displayMatrix(biggerValues(matrix1, matrix2));
//        flip(oldMatrix);

        int[][] matrix = fillWithRandomNumbers(3,3);
        for (int i = 0; i < 100; i++) {
            matrix = biggerValues(matrix, fillWithRandomNumbers(3,3));
            if(i%10==0){
                displayMatrix(matrix);
            }
        }

    }

    public static int[][] saveToMatrixExample() {
        int rows = 2;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i + j;
            }
        }
        return matrix;
    }
//        
//        for (int i = 0; i < rows; i++) {
//            System.out.print("|");
//            for (int j = 0; j < columns; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println("|");
//        }


    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public static int[][] fillWithRandomNumbers(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(30) - 15;
            }
        }
        return matrix;
    }

    public static int[][] fillWithNubersFromUser(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Number[" + i + "]{" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
        return matrix;
    }

    public static int[][] addTwoMatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix;
    }

    public static int[][] multiplyMatrixElementsByNumber(int[][] matrix, int value) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] newMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newMatrix[i][j] = matrix[i][j] * value;
            }
        }
        return newMatrix;
    }

    public static int sumOfMatrixElements(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static int indexOfHighestSum(int[][] matrix) {
        int indexOfHighestRow = 0;
        for (int i = 1; i < matrix.length; i++) {
            if (Zajecia4.sum(matrix[indexOfHighestRow]) < Zajecia4.sum(matrix[i])) {
                indexOfHighestRow = i;
            }
        }
        return indexOfHighestRow;
    }

    public static int[][] flip(int[][] oldMatrix) {
        int oldRows = oldMatrix.length;
        int oldColumns = oldMatrix[0].length;
        int[][] matrix = new int[oldColumns][oldRows];
        for (int i = 0; i < oldRows; i++) {
            for (int j = 0; j < oldColumns; j++) {
                matrix[j][i] = oldMatrix[i][j];
            }
        }
        return matrix;
    }

    public static int[][] biggerValues(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
//                 if(matrix1[i][j]>matrix2[i][j]){
//                     matrix[i][j]=matrix1[i][j];
//                 }else{
//                     matrix[i][j]=matrix2[i][j];
//                 }
                matrix[i][j] = (matrix1[i][j] > matrix[i][j]) ? matrix1[i][j] : matrix2[i][j];
            }
        }
        return matrix;
    }

    public static int maxValue(int[][] matrix) {
        int max = Zajecia4.maxFromArray(matrix[0]);
        for (int i = 0; i < matrix.length; i++) {
            int maxCandidate = Zajecia4.maxFromArray(matrix[i]);
            if (max < maxCandidate) {
                max = maxCandidate;
            }
        }
        return max;
    }

    public static int[][] produkt(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix;
    }

}