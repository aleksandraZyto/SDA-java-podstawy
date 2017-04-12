package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-11.
 */
public class Zajecia6 {
    public static void main(String[] args) {
//        int number = 10;
//        int counter = 0;
//        Random random = new Random();
//        while (number > 0) {
//            System.out.println("Hello World");
//            counter++;
//            number -= random.nextInt(3); //number = number-random.nextInt(3)
//        System.out.println("counter");
//        printPowersOf2(32);
//
        int[] array = {1, 5, 2, 3, 5};
//        sumUntil(array, 10);
//        game();
//        numberOfDigits(1000);
//        numberToArray(123);
        arrayToNumber(array);
    }

    public static void printPowersOf2(int number) {
        int value = 1;
        System.out.println(value);
        while (value < number / 2) {
            value = value * 2;
            System.out.println(value);
        }
    }

    public static boolean sumUntil(int[] array, int sum) {
        int sumOfElem = 0;
        int i = 0;
        while (sumOfElem < sum && i < array.length) {
            sumOfElem += array[i];
            i++;
            System.out.println(sumOfElem);
        }
        return sumOfElem < sum;
    }

    public static boolean avgUntil(int[] array, int avg) {
        double arraySum = 0;
        int i = 1;
        while (arraySum / i < avg && i < array.length) {
            arraySum += array[i];
            i++;
        }
        return arraySum / i >= avg;
    }

    public static int game() {
        Random random = new Random();
        int answer = random.nextInt(100);
        int counter = 0;
        int bound = 100;
        int offset = 0;
        int hit = -1;
        while (hit != answer) {
            hit = (random.nextInt(bound) + offset);
            if (hit > answer) {
                bound = hit;
            } else if (hit < answer) {
                offset = hit;
                bound = bound - hit;
            }
            counter++;
        }
        System.out.println("Wygrales po " + counter + " krokach");
        return counter;
    }

    public static int numberOfDigits(int number) {
        int iloscZnakow = 0;
        while (number > 0) {
            number /= 10;
            iloscZnakow++;
        }
        System.out.println(iloscZnakow);
        return iloscZnakow;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int[] numberToArray(int number) {
        int size = numberOfDigits(number);
        int[] array = new int[size];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }
        Zajecia4.displayArray(array);
        return array;
    }

    public static int arrayToNumber(int[] array) {
        int number = 0;
        int mn = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            number = number + (array[i] * mn);
            mn *= 10;
        }
        System.out.println(number);
        return number;
    }
}