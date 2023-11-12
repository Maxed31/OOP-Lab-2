package week6;

public class SixthTask {
    public static void printElegantly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}