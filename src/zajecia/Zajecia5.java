package zajecia;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-10.
 */
public class Zajecia5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Insert size");
//        int size = scanner.nextInt();
//        System.out.println("Insert bound");
//        int bound = scanner.nextInt();
//        System.out.println("Insert offset");
//        int offset = scanner.nextInt();

//        Zajecia4.displayArray(getRandomArray(size, bound, offset));
//        Zajecia4.statistics(getRandomArray(size, bound, offset));
//        Zajecia4.displayArray(getArray(9));
//        printSquare(5);
//        printRectangle(5, 2);
//        printTriangle(6);
//        printMatrixOfNumbers(5);
//        printOneMatrix(6);
//        printEmptySquare(6);
//        chessBoard(5);
//        tree(4);
//        homework();
        lineOfNumbers(5);
    }

    public static int[] getArray(int value) {
        int size = value / 2;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + value % 2;
        }
//        for (int i = 0; i < array.length; i++) {
//            if (i != array.length - 1) {
//                System.out.print(array[i] + ", ");
//            } else {
//                System.out.println(array[i]);
//            }
//        }
        return array;
    }

    public static void randomTest() {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10) - 5);
        System.out.println(random.nextInt(10) + 5);
    }

    public static int[] getRandomArray(int size, int bound) {
        return getRandomArray(size, bound, 0);
    }

    public static int[] getRandomArray(int size, int bound, int offset) {
        Random random = new Random();
        int[] randomArray = new int[size];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(bound) + offset;
        }
        return randomArray;
    }

    public static void printSquare(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void printRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void printTriangle(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printMatrixOfNumbers(int a) {
//        int number = 1;
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < a; j++) {
//                System.out.print(number + " ");
//                number++;
//            }
//            System.out.println();
//        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print((i * a) + (j + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void printOneMatrix(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || i == a - 1 || j == 0 || j == a - 1) {
                    System.out.print("1");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void chessBoard(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    public static void tree(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

    }

    public static void homework() {
        Random random = new Random();
        int a = random.nextInt(10) + 15;
        Zajecia4.statistics(getRandomArray(a, 10, 15));
        tree(a - 12);
    }

    public static void lineOfNumbers(int value) {
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(i+1);
        }
    }
}
