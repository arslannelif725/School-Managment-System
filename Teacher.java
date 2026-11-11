package org.example;

public class Teacher extends Person {
    private String branch;
    private double salary;

    public Teacher(String id, String name, String email, String branch, double salary){
        super(id,name,email);
        this.branch = branch;
        this.salary = salary;
    }
    public String getBranch(){
        return branch;
    }
    public double salary(){
        return salary;
    }
    @Override
    public void getInfo(){
        System.out.println("👨‍🏫 [Öğretmen] ID: " + getId() + " | Ad: " + getName() +
                " | Branş: " + branch + " | Maaş: " + salary + " TL | E-posta: " + getEmail());
    }
}
