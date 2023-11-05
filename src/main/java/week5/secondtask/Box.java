package week5.secondtask;
import week5.secondtask.*;

import java.util.ArrayList;

public class Box implements TobeStored {
    private double maxWeight;
    private ArrayList<Double> totalWeight = new ArrayList<>();
    private ArrayList<TobeStored> objects = new ArrayList<>();

    public Box() {

    }

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(TobeStored object) {
        this.objects.add(object);
        double currentWeight = weight();
        if(currentWeight + object.weight() < maxWeight) {
            totalWeight.add(object.weight());
        } else {
            System.out.println("Can't add item, too much weight!");
        }
    }

    public double weight() {
        double tWeight = 0;
        for(TobeStored w : this.objects) {
            tWeight += w.weight();
        }
        return tWeight;
    }

    public String toString() {
        return "Box: " + this.objects.size() + " things, total weight: " + weight();
    }
}