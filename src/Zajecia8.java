/**
 * Created by RENT on 2017-04-13.
 */
public class Zajecia8 {
    public static void main(String[] args) {
//        String message = "Alal ma kota";
//        char znak = 'a';
//        for (int i = 0; i < 26; i++) {
//            System.out.println(znak+", ");
//            znak++;
//        }
//        char[] charArray = message.toCharArray();
//        System.out.println(message.length());
//        countCharakters(message, 'a');
//        countCharakters(a, 'a');
//        System.out.println(countSmallLetters("Ala Ma Kota"));
//        System.out.println(countWords("Ala ma kota i"));
//        System.out.println(switchCase("Ala Ma Kota"));
//        System.out.println(ananimOf("abcd"));
//        System.out.println(isPalindrome("mamutatumam"));
//        System.out.println(startsWith("Ala ma kota", "Ala"));
//        System.out.println(sumOfNumbers("ooo "));
//        System.out.println(subString("Ala ma kota"));
        System.out.println(sumOfNumbers("A 93 jkd7"));
    }



    public static int countCharakters(String message, char charakter) {
        int counter = 0;
        char[] charArray = message.toCharArray();
        for (int i = 0; i < message.length(); i++) {
            if (charArray[i] == charakter) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }

    public static int countCapitalLetters(String message) {
        int counter = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) >= 65 && message.charAt(i) <= 90)
                counter++;
        }
        return counter;
    }

    public static int countSmallLetters(String message) {
        int counter = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) >= 97 && message.charAt(i) <= 122)
                counter++;
        }
        return counter;
    }

    public static int countWords(String message) {
        int counter = 1;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == 32) {
                counter++;
            }
        }
        return counter;
    }

    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            } else if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        return new String(charArray);
    }

    public static String ananimOf(String message) {
//        char[] charArray = message.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            charArray[i] = charArray[message.length()-(i+1)];
//        }
//        return new String(charArray);

        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
//            int a = charArray[i];
//            int b = charArray[charArray.length-i-1];
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = tmp;

        }
        return String.valueOf(charArray);
    }

    //
    public static boolean isPalindrome(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charArray[charArray.length - 1 - i]) {
                counter++;
            }
        }
        boolean wynik;

        if (counter == charArray.length) {
            wynik = true;
        } else {
            wynik = false;
        }
        return wynik;
    }

    public static boolean startsWith(String message, String someValue) {
        char[] charMessage = message.toCharArray();
        char[] charValue = someValue.toCharArray();
        boolean flag = true;
        int i = 0;
        while (flag == true && i < someValue.length()) {
            flag = (charMessage[i] == charValue[i]);
            i++;
        }
        return flag;
    }

    public static String toUpperCase(String message) {
        char[] charArray = message.toCharArray();
        charArray[0] -= (charArray[0] >= 97 && charArray[0] <= 122) ? 32 : 0;
        return String.valueOf(charArray);
    }

    public static String toLowerCase(String message) {
        char[] charArray = message.toCharArray();
        charArray[0] += (charArray[0] >= 65 && charArray[0] <= 90) ? 32 : 0;
        return String.valueOf(charArray);
    }

    public static int sumOfNumbers(String message) {
        char[] charArray = message.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 48 && charArray[i] <= 57) {
                sum += charArray[i] - 48;
            }
        }
        return sum;
    }

    // "Ala ma kota" 4,6 -> " ma"

    public static String subString(String message) {
        char[] charArray = message.toCharArray();
        int downLimit = 4;
        int upperLimit = 6;
        int size = upperLimit - downLimit + 1;
        char[] charAnswer = new char[size];
        for (int i = (downLimit - 1); i < upperLimit; i++) {
            for (int j = 0; j < charAnswer.length; j++) {
                charAnswer[j] = charArray[i];
            }
        }
        return charAnswer.toString();
    }
    //return new String(charArray);
    // return charArray.toString();
}
