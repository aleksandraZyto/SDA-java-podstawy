package zajecia;

/**
 * Created by RENT on 2017-04-10.
 */
public class Zajecia5 {
    public static void main(String[] args) {
        HelloWorld.displayArray(getArray(9));
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
}
