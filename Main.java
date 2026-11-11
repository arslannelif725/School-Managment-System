package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SchoolService school = new SchoolService();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("OKUL YÖNETİM VE OTOMASYON SİSTEMİNE HOŞ GELDİNİZ ");

        while(!exit){
            System.out.println("\n---İŞLEM MENÜSÜ---");
            System.out.println("1. yeni öğrenci kaydet");
            System.out.println("2. yeni öğretmen kaydet");
            System.out.println("3. herkesi listele");
            System.out.println("4. ID ile kişi ara");
            System.out.println("5. çıkış");
            System.out.print("Seçiminiz (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Öğrenci ID: ");
                    String sId = scanner.nextLine();
                    System.out.print("Ad Soyad: ");
                    String sName = scanner.nextLine();
                    System.out.print("E-posta: ");
                    String sEmail = scanner.nextLine();
                    System.out.print("Bölüm: ");
                    String dept = scanner.nextLine();
                    System.out.print("AGNO (GPA): ");
                    double gpa = scanner.nextDouble();
                    scanner.nextLine();

                    Student student = new Student(sId, sName, sEmail, dept, gpa);
                    school.addPerson(student);
                    break;

                case 2:
                    System.out.print("Öğretmen ID: ");
                    String tId = scanner.nextLine();
                    System.out.print("Ad Soyad: ");
                    String tName = scanner.nextLine();
                    System.out.print("E-posta: ");
                    String tEmail = scanner.nextLine();
                    System.out.print("Branş: ");
                    String branch = scanner.nextLine();
                    System.out.print("Maaş: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();

                    Teacher teacher = new Teacher(tId, tName, tEmail, branch, salary);
                    school.addPerson(teacher);
                    break;

                case 3:
                    school.listAllPeople();
                    break;

                case 4:
                    System.out.print("aranacak ID: ");
                    String searchId = scanner.nextLine();
                    school.findPersonById(searchId);
                    break;

                case 5:
                    exit = true;
                    System.out.println("sistemden çıkılıyor");
                    break;

                default:
                    System.out.println("geçersiz seçim lütfen 1-5 arasında bir sayı seçin");
            }
        }
        scanner.close();
    }
}