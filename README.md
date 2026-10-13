# 📄 Java OOP - PDF Özgeçmiş (CV) Oluşturucu

Bu proje, **Java programlama dili** ve **iText 7** kütüphanesi kullanılarak, Nesne Yönelimli Programlama (OOP) prensiplerine uygun şekilde PDF formatında dinamik bir özgeçmiş (CV) kurgulamak ve üretmek amacıyla geliştirilmiştir. 

Proje, verilerin doğrudan main metodunda işlenmesi yerine kurumsal yazılım mimarilerinde sıkça kullanılan **"Separation of Concerns" (Sorumlulukların Ayrılığı)** prensibi ile inşa edilmiştir.

## ✨ Öne Çıkan Özellikler

* **Tam Türkçe Karakter Desteği:** iText kütüphanesine özel `CP1254` (Windows-1254) kodlaması entegre edilerek Ş, İ, Ğ, Ç, Ö, Ü gibi karakterlerin PDF üzerinde kusursuz render edilmesi sağlanmıştır.
* **Nesne Yönelimli Mimari:** Proje tetikleyici ve işleyici olmak üzere sınıflara ayrılmıştır.
* **Dinamik Görsel İşleme:** Yerel dizinde bulunan profil fotoğrafı (I/O) işlemleriyle okunarak otomatik olarak CV mizanpajına uygun ebatlarda PDF'e gömülmektedir.
* **Güvenli Hata Yönetimi (Exception Handling):** Dosya eksikliği veya format uyuşmazlığı gibi durumlarda programın çökmesini engellemek adına kapsamlı `try-catch` blokları kullanılmıştır.

## 🛠️ Kullanılan Teknolojiler ve Bağımlılıklar

* **Java (JDK):** Projenin temel programlama dilidir.
* **Maven:** Bağımlılık (Dependency) yönetimi ve projenin derlenmesi için kullanılmıştır.
* **iText 7 Core & Layout:** PDF belgesinin arka plan stream işlemlerini (PdfWriter, PdfDocument) ve ön yüz elemanlarını (Document, Paragraph, Image) programatik olarak oluşturmak için kullanılmıştır.

## 🏗️ Sınıf Yapısı ve Mimari Tasarım

Proje yönergelerine uygun olarak kod kalabalığı engellenmiş ve mimari iki temel sınıf üzerine inşa edilmiştir:

1. `main.java` **(Entry Point):** Uygulamanın giriş noktasıdır. PDF oluşturma süreçlerine hiçbir şekilde doğrudan müdahale etmez. Yalnızca iş sınıfından bir nesne (object) üreterek (instantiation) süreci tetikler.
2. `cvgenerator.java` **(Business Logic):** Tüm mizanpaj kurallarının, veri gömme algoritmalarının, font ayarlamalarının ve dosya yazdırma işlemlerinin barındırıldığı çekirdek sınıftır.

## 🚀 Kurulum ve Çalıştırma

Projeyi kendi yerel ortamınızda çalıştırmak için aşağıdaki adımları izleyebilirsiniz:

1. Bu repoyu bilgisayarınıza klonlayın veya `.zip` olarak indirin.
2. Projeyi IntelliJ IDEA, Eclipse veya VS Code gibi Maven destekli bir IDE'de açın.
3. IDE üzerinden `pom.xml` dosyasını senkronize ederek iText 7 kütüphanelerinin indirilmesini sağlayın.
4. `src/main/java/org/example/` dizini altındaki `main.java` sınıfını çalıştırın (Run).
5. İşlem başarıyla tamamlandığında konsolda `PDF başarıyla oluşturuldu` mesajını göreceksiniz. Oluşan PDF dosyası, projenin ana dizininde yer alacaktır.
