package zajecia;

import java.util.Random;

/**
 * Created by RENT on 2017-04-20.
 */
public class Zajecia10 {
    public static void main(String[] args) {
//        stringStatistics("ala");
//        Zajecia4.displayArray(stringStatistics("Ala ma kota"));
//        multiplyDigits(123);
        int[][] ints = randomMatrix(3, 10, -5);
        System.out.println(avg(ints));

    }

    public static int find(String message, char sentence) {
        char[] charArray = message.toCharArray();
        int i = 0;
        while (charArray[i] != sentence && i <= charArray.length) {
            i++;
        }
        return (i == charArray.length) ? -1 : i;
    }

    public static int countAll(String message, char sentence) { //
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (toLowerCase(charArray[i]) == toLowerCase(sentence)) {
                counter++;
            }
        }
        return counter;
    }

    public static char toLowerCase(char a) {
        if (a >= 65 && a <= 90) {
            a += 32;
        }
        return a;
    }

//    public static int countAll(String message, String sentence) {
//        char[] charArray = message.toCharArray();
//        int i = 0;
//        while (i < charArray.length) {
//            while
//        }
//    }


//    //Ala ma kota, kota -> 7
//    public static int find(String message, String sentence){
//        return 0;
//    }

    public static int[] stringStatistics(String message) {
        char[] charArray = message.toCharArray();
        int[] array = new int[27];
        for (int i = 0; i < charArray.length; i++) {
            char charInLowerCase = toLowerCase(charArray[i]);
            if (charInLowerCase >= 97 && charInLowerCase <= 122) {
                array[charInLowerCase - 97]++;
            }
        }
        return array;
    }

    public static void printStringStatistics(int[] array) {
        //String message = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char) (i + 97));
                //message+= (char) (i+97);
            }
        }
//        int size = 0;
//        for (int i = 0; i < array.length; i++) {
//            size += array[i];
//        }
//
//        char[] charArray = new char[size];
//        for (int i = 0; i < array.length; i++) {
//            if(array[i]!=0){
//                for (int j = 0; j < array[i]; j++) {
//                    charArray[i]++;
//                }
//
//            }
//        }
//        System.out.println(charArray.toString());
    }

    //123 -> 1*2*3
    public static int multiplyDigits(int number) {
        int wynik = 1;
        while (number >= 1) {
            wynik *= (number % 10);
            number /= 10;
        }
//        System.out.println(wynik);
        return wynik;
    }

    public static int[][] randomMatrix(int size, int bounds, int offset) {
        Random random = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(bounds) + offset;
            }
        }
        return matrix;
    }

    public static int sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static double avg(int[][] matrix) {
        int sum = sum(matrix);
        double avg = sum / (matrix.length * matrix[0].length);
        return avg;
    }

    public static double[][] avg(int[][] matrix1, int[][] matrix2) {
        int rows;
        int columns;

        if (matrix1.length > matrix2.length) {
            rows = matrix2.length;
        } else {
            rows = matrix1.length;
        }

        if (matrix1[0].length > matrix2[0].length) {
            columns = matrix2[0].length;
        } else {
            columns = matrix1[0].length;
        }

        double[][] matrix = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (matrix1[i][j] + matrix2[i][j]) / 2;
            }
        }
        return matrix;
    }

}
