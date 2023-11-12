package week6;

public class FifthTask {
    public static boolean search(int[] array, int searchedValue) {
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            int m = (i + j) / 2;

            if(searchedValue > array[m]) {
                i = m + 1;
            } else {
                j = m;
            }
        }

        if(searchedValue == array[i]) {
            return true;
        }
        return false;
    }
}
