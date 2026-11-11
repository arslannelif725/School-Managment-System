package org.example;

public class Student extends Person {
    private String department;
    private double gpa;

    public Student(String id, String name, String email, String department, double gpa){
        // supe(...) ana sınıfın (Person) constructorını çağırır.
        super(id, name, email);
        this.department = department;
        this.gpa = gpa;
    }
    public String getDepartment(){
        return department;
    }
    public double gpa(){
        return gpa;
    }
    //ana sınıftaki getInfo metodunu (override)
    @Override
    public void getInfo(){
        System.out.println("🎓 [Öğrenci] ID: " + getId() + " | Ad: " + getName() +
                " | Bölüm: " + department + " | AGNO: " + gpa + " | E-posta: " + getEmail());
    }
}
