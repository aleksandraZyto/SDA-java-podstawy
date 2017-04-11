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
//        int[] array = {1, 5, 2, 3, 5};
//        sumUntil(array, 10);
        game();
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
                bound = bound -hit;
            }
            counter++;
        }
        System.out.println("Wygrales po " + counter + " krokach");
        return counter;
    }

//    public static int numberOfDigits(int number){
//        return;
//    }
}