package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-06.
 */
public class Zajecia4 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

//        System.out.println("Day");
//        int dzien = scanner.nextInt();
//        System.out.println("Month");
//        int miesiac = scanner.nextInt();
//        System.out.println("Year");
//        int rok = scanner.nextInt();
//
//        displayDate(dzien, miesiac, rok);
//        int[] array = {10, 0, -4, 1, -2, 7};
//        int minValue = minFromArray(array);

//        minFromArray(array);
//        maxFromArray(array);
//
//        int sum = sum(array);
////        System.out.println("suma= "+sum);
//
//        double average = avg(array);
////        System.out.println("srednia to "+average);
//
//        int rozpietosc = span(array);
//        System.out.println(rozpietosc);
//        revers(array);
        int[] array = getArrayFromUser();
        displayArray(getArrayFromUser());
        displayReversedArray(array);
//        statistics(array);
    }

    public static void displayDate(int day, int month, int year) {
        if (day > 0 && day < 32 && month > 0 && month < 13 && year > 0) {
            System.out.println("The date is " + day + "-" + month + "-" + year);
        } else {
            System.out.println("Format daty jest niepoprawny");
        }
    }

    public static int minFromArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maxFromArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];

        }
        return max;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double avg(int[] array) {
        int suma = sum(array);
        double srednia = suma / (double) array.length;
        return srednia;
    }

    public static int abs(int number) {
        if (number < 0) {
            number = number * (-1);
        }
        return number;
    }

    public static int span(int[] array) {
        int roznica = maxFromArray(array) - minFromArray(array);
        return abs(roznica);
    }

    public static void statistics(int[] array) {
        System.out.println("Sum = " + sum(array));
        System.out.println("Min = " + minFromArray(array));
        System.out.println("Max = " + maxFromArray(array));
        System.out.println("Avg = " + avg(array));
        System.out.println("Span = " + span(array));
    }

    public static void revers(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static int[] getArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj " + (i + 1) + ". liczbe");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public static int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[array.length - 1 - i];
            newArray[array.length-i-1] = array[i];
        }
        return (newArray);
    }

    public static void displayReversedArray(int[] array)
    {
        displayArray(reverseArray(array));
        for(int i =0;i<array.length;i++)
        {
            System.out.print(array[i]+", ");
        }
    }
}

