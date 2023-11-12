package week6;
import week6.Firsttask;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Smallest is " +
                Firsttask.smallest(values));

        System.out.println("Smallest is " +
                SecondTask.indexOfTheSmallest(values));
        System.out.println("Smallest is " +
                thirdTask.indexOfTheSmallestStartingFrom(values, 2));


        int[] value = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(value));
        fourthTask.swap(value, 1, 0);
        System.out.println(Arrays.toString(value));
        fourthTask.swap(value, 0, 3);
        System.out.println(Arrays.toString(value));


        int array[] = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter the searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = FifthTask.search(array, Integer.parseInt(searchedValue));
        if (result) {
            System.out.println("Value " + searchedValue + " is in the array");
        } else {
            System.out.println("Value " + searchedValue + " is not in the array");
            int[] array1 = {5, 1, 3, 4, 2};
            SixthTask.printElegantly(array1);

//        NightSky nightSky = new NightSky(0.2);
//        nightSky.printLine();

//        NightSky nightSky = new NightSky(8, 4);
//        nightSky.print();
//        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
//        System.out.println("");
//
//        nightSky.print();
//        System.out.println("Number of stars: " + nightSky.starsInLastPrint());

            NightSky NightSky = new NightSky(0.1, 40, 10);
            NightSky.print();
            System.out.println("Number of stars: " + NightSky.starsInLastPrint());
            System.out.println("");
            NightSky = new NightSky(0.2, 15, 6);
            NightSky.print();
            System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        }
    }
}
