package week6;

public class thirdTask {
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int min = array[index];
        int save = 0;
        for (int i = index; i < array.length; i++){
            if(array[i]< min){
                min = array[i];
                save = i;
            }
        }
        return save;
    }
}
