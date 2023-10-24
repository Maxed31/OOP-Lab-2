package week4.labs;

import week4.labs.Person;
public class Teacher extends Person{
    private int salaryofperson;
    public Teacher (String nameOfperson, String adressOfperson, int salary){
        super(nameOfperson, adressOfperson);
        this.salaryofperson = salary;
    }

    public int getSalary() {
        return this.salaryofperson;
    }

    public void setSalary(int salary) {
        this.salaryofperson = salary;
    }
    @Override
    public String ToString(){
        return this.getName() + "\n " + this.getAdressOfperson() + this.getSalary();
}
}
