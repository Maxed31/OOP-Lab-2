package week4.labs;

public class Person {
    private String nameOfperson;
    private String adressOfperson;

    public Person(String name, String adress){
        this.nameOfperson = name;
        this.adressOfperson = adress;
    }
    public void setName(String name){
        this.nameOfperson = name;
    }
    public String getName(){
        return this.nameOfperson;
    }

    public void setAdressOfperson(String adressOfperson) {
        this.adressOfperson = adressOfperson;
    }

    public String getAdressOfperson() {
        return adressOfperson;
    }
    public String ToString(){
        return this.getName() + "\n " + this.getAdressOfperson();
    }
}
