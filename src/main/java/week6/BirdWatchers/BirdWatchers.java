package week6.BirdWatchers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirdWatchers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        HashMap<String, String> birds = new HashMap<>();
        HashMap<String, Integer> observations = new HashMap<>();

        boolean running = true;

        while(running) {
            System.out.print("? ");
            String input = reader.nextLine();

            switch(input) {
                case "Quit":
                    running = false;
                    break;

                case "Add":
                    System.out.print("Name: ");
                    String name = reader.nextLine();
                    System.out.print("Latin name: ");
                    String latinName = reader.nextLine();
                    birds.put(latinName, name);
                    break;

                case "Observation":
                    System.out.print("What was observed: ? ");
                    String observation = reader.nextLine();

                    if(observations.containsKey(observation)) {
                        observations.put(observation, observations.get(observation) + 1);
                    }

                    else if(birds.containsValue(observation)) {
                        observations.put(observation, 1);
                    } else {
                        System.out.println("Not a bird!");
                    }
                    break;

                case "Statistics":
                    for(Map.Entry<String, String> bird : birds.entrySet()) {
                        if(observations.get(bird.getValue()) == null) {
                            observations.put(bird.getValue(), 0);
                        }
                        System.out.println(bird.getValue() + " (" + bird.getKey() + "): " + observations.get(bird.getValue()) + " observations");
                    }
                    break;

                case "Show":
                    System.out.print("What? ");
                    String show = reader.nextLine();
                    for(Map.Entry<String, String> bird : birds.entrySet()) {
                        if(bird.getValue().equals(show)) {
                            System.out.println(bird.getValue() + " (" + bird.getKey() + "): " + observations.get(bird.getValue()) + " observations");
                        }
                    }
                    break;
            }
        }
    }
}
