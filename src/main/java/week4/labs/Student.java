package week4.labs;
import week4.labs.Person;
public class Student extends Person {
    public int credits;

    public Student(String nameOfperson, String adressOfperson) {
        super(nameOfperson, adressOfperson);
        this.credits = 0;
    }

    public void study() {
        this.credits = this.credits + 1;
    }

    public int getCredit() {
        return this.credits;
    }

    public int credits() {
        return getCredit();
    }

    @Override
    public String ToString() {
        return this.getName() + "\n " + this.getAdressOfperson() + " " + this.credits();
    }
}
