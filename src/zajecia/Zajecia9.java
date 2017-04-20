package zajecia;

/**
 * Created by RENT on 2017-04-14.
 */
public class Zajecia9 {
    public static void main(String[] args) {
        System.out.println(cesarCode("abgh"));
    }

    public static String cesarCode(String messageToCode) {
        return cezarCoder(messageToCode, true);
    }

    public static String cesarDecode(String coddedMessage) {
       return cezarCoder(coddedMessage, false);
    }

    private static String cezarCoder(String message, boolean code){
        char[] charArray = message.toCharArray();
        int offset = code ? 1: -1;
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] += offset;
        }
        return new String(charArray);  // return String.valueOf(charArray);
    }




}
