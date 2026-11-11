# 🏫 School Management & Automation System (Okul Yönetim ve Otomasyon Sistemi)

Bu proje, Java programlama dili ve **Nesne Yönelimli Programlama (OOP)** prensipleri (`Inheritance`, `Polymorphism`, `Encapsulation`) kullanılarak geliştirilmiş konsol tabanlı bir **Okul Personel ve Öğrenci Otomasyon Sistemi**dir.

## 🚀 Projenin Öne Çıkan Özellikleri ve OOP Mimarisi
* **Kalıtım (Inheritance):** Ortak kimlik bilgileri `Person` (Ata sınıf) içinde toplanmış; `Student` ve `Teacher` sınıfları bu sınıftan türetilmiştir (`extends`).
* **Çok Biçimlilik (Polymorphism):** Tek bir `Person` listesi içerisinde hem öğrenciler hem de öğretmenler saklanmış, nesnelerin kendi türüne özgü `getInfo()` metotları (`Method Overriding`) dinamik olarak çalıştırılmıştır.
* **Modüler Servis Yapısı (`SchoolService`):** Kayıt ekleme, ID'ye göre arama ve listeleme gibi iş mantıkları arayüzden ayrı bir servis katmanında yönetilmiştir.
* **İnteraktif Konsol Menüsü:** Kullanıcı dostu `Scanner` döngüsü ile kolay veri girişi sağlar.

## 🛠️ Kullanılan Teknolojiler
* **Java** (JDK 17+)
* **Maven** (Proje ve bağımlılık yönetimi)
* **IntelliJ IDEA** (Geliştirme ortamı)

## 📦 Proje Mimarisi (Package Structure)
```text
src/main/java/org/ezample/
├── Person.java         # Temel ortak özellikleri barındıran ata sınıf
├── Student.java        # Person'dan türeyen ve öğrenci özellikleri ekleyen sınıf
├── Teacher.java        # Person'dan türeyen ve öğretmen özellikleri ekleyen sınıf
├── SchoolService.java  # Polimorfik liste yönetimi ve iş mantığı servisi
└── Main.java           # Konsol arayüzü ve kullanıcı etkileşim döngüsü
