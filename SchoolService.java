package org.example;
import java.util.ArrayList;
import java.util.List;

public class SchoolService {
    //hem Student hemde Teacher nesnelerini tutabilen ortak Person listesi (Polimorfizim)
    private List<Person> people;

    public SchoolService(){
        people = new ArrayList<>();
    }
    //okula yeni bir kiş ekleme
    public void addPerson(Person person){
        people.add(person);
        System.out.println("sistem başarıyla kaydedildi: "+ person.getName());
    }
    //tüm kayıtlı kişileri listeleme
    public void listAllPeople(){
        if (people.isEmpty()){
            System.out.println("sistemde henüz kayıtlı kimse bulunmuyor");
            return;
        }
        System.out.println("\n---OKUL PERSONEL VE ÖĞRENCİ LİSTESİ---");
        for (Person p : people){
            //hangi nesne aitse onun override ettiği getInfo() metodu çalışır.
            p.getInfo();
        }
    }
    //ID ye göre arama yapma
    public void findPersonById(String id){
        boolean found = false;
        for (Person p : people){
            if(p.getId().equals(id)){
                System.out.println("\n ARAMA SONUCU BULUNDU: ");
                p.getInfo();
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Bu ID'ye ait bir kayıt bulunamadı: "+ id);
        }
    }
}
