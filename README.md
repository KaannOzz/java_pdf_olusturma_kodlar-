# Java ile Nesne Yönelimli PDF Özgeçmiş (CV) Oluşturucu

Bu proje, Java programlama dili ve iText 7 kütüphanesi kullanılarak nesne yönelimli programlama (OOP) prensiplerine uygun şekilde PDF formatında dinamik bir özgeçmiş (CV) oluşturmak amacıyla geliştirilmiştir.

## Kullanılan Teknolojiler, Bileşenler ve Nedenleri

* **Java:** Projenin temel programlama dili olarak kullanılmıştır. Nesne yönelimli yapısı sayesinde kodun modüler, okunabilir ve yönetilebilir olması sağlanmıştır.
* **Maven:** Proje bağımlılıklarını (dependencies) yönetmek için kullanılmıştır. Harici kütüphanelerin projeye manuel olarak eklenmesinin getirdiği karmaşıklığı önlemek amacıyla tercih edilmiştir.
* **iText 7 (Core & Layout):** PDF belgelerini programatik olarak oluşturmak, metin mizanpajlarını ayarlamak ve belgeye görsel işlemek için kullanılmıştır. iText, Java ekosistemindeki en stabil ve kapsamlı PDF üretim kütüphanesi olduğu için tercih edilmiştir.

## Proje Mimarisi ve Sınıf Yapısı

Proje yönergeleri doğrultusunda, PDF oluşturma işlemi doğrudan `main` metodu içinde yapılmamış, "Sorumlulukların Ayrılığı" (Separation of Concerns) prensibi gereği yapı ikiye bölünmüştür:

1. `main.java`: Uygulamanın giriş noktasıdır. Sadece tetikleyici görevi görür ve PDF işlemlerini yönetecek sınıftan bir nesne üreterek süreci başlatır.
2. `cvgenerator.java`: Tüm PDF üretim algoritmasının, mizanpaj kurallarının, görsel işleme bloklarının ve veri tanımlamalarının bulunduğu ana iş sınıfıdır.
