package week4.labs;

public class Person {
    private String nameOfperson;
    private String adressOfperson;
    private int age;
    private String country;

    public Person(String name, String adress){
        this.nameOfperson = name;
        this.adressOfperson = adress;
        this.age = age;
        this.country = country;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String ToString(){
        return this.getName() + "\n " + this.getAdressOfperson();
    }
}
