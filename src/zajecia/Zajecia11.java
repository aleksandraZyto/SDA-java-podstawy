package zajecia;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-21.
 */
public class Zajecia11 {
    public static void main(String[] args) throws FileNotFoundException {
        File bla = new File("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-java-podstawy\\bla.txt");
//        readFromFileTest(bla);
        System.out.println(countWordsInFile(bla));
    }

    public static int countOddIntegers(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int counter = 0;
        while (scanner.hasNext()) {
            if (scanner.nextInt() % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static void readFromFileTest(File bla) throws FileNotFoundException {
        Scanner scanner = new Scanner(bla);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }

    public static void writeFromFileTest(File file, String message) throws IOException {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(message);
        }

    }

//    public static int[] readIntegersFromFile(File file){
//
//    }
//
//    public static void readFromFileTest(File file){
//
//    }

    public static int getLength(File file) throws FileNotFoundException{
        Scanner scanner = new Scanner(file);
        int counter = 0;
        while(scanner.hasNext()){
            counter++;
            scanner.nextLine();
        }
        return counter;
    }

    public static int countWordsInFile(File bla) throws FileNotFoundException {
        Scanner scanner = new Scanner(bla);
        int counter =0;
        while(scanner.hasNext()){
            scanner.next();
            counter++;
        }
        return counter;
    }
}
