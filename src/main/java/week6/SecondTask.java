package week6;

public class SecondTask {
    public static int indexOfTheSmallest(int []array){
        int min = array[0];
        int save = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]< min){
                min = array[i];
                save = i;
            }
        }
        return save;
    }
}
