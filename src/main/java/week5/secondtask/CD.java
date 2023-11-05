package week5.secondtask;
import week5.secondtask.TobeStored;
public class CD implements TobeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private double weight = 0.1;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }
}