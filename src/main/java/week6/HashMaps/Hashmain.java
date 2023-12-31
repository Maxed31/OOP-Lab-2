package week6.HashMaps;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Hashmain {
    public static void main(String[] args) {

        HashMap<String, String> people = new HashMap<>();

        people.put("matti", "mage");
        people.put("mikael", "mixu");
        people.put("arto", "arppa");

         System.out.println(people.get("matti"));


        PromissoryNote mattisNote = new PromissoryNote();

        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);
        mattisNote.setLoan("Arto", 10.5);

        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));


        Dictionary dictionary = new Dictionary();

        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        System.out.println(dictionary.amountOfWords());
        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));

        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }

        Scanner reader = new Scanner(System.in);
        Dictionary dictionary1 = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary1);
        ui.start();
    }
}
