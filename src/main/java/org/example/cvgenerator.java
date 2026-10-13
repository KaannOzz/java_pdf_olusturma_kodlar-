package org.example;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.HorizontalAlignment;
import com.itextpdf.layout.properties.TextAlignment;

public class cvgenerator {

    public void pdfOlustur(String dosyaYolu) {
        try {
            PdfWriter writer = new PdfWriter(dosyaYolu);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            //Pdf için Türkçe karakter ekleme kodları//
            PdfFont turkceFont = PdfFontFactory.createFont(StandardFonts.HELVETICA, "CP1254");
            document.setFont(turkceFont);

            Paragraph baslik = new Paragraph("Kaan Öz - Özgeçmiş")
                    .setTextAlignment(TextAlignment.CENTER)
                    .setFontSize(20)
                    .setBold();
            document.add(baslik);

            try {
                String fotoYolu = "src/photo.jpg";
                ImageData data = ImageDataFactory.create(fotoYolu);
                Image img = new Image(data);
                img.setWidth(120);
                img.setHeight(120);
                img.setHorizontalAlignment(HorizontalAlignment.CENTER);
                document.add(img);
            } catch (Exception e) {
                document.add(new Paragraph("\n[Fotoğraf bulunamadı veya yüklenemedi]\n")
                        .setTextAlignment(TextAlignment.CENTER));
            }

            document.add(new Paragraph("\nKİŞİSEL BİLGİLER").setBold().setFontSize(14));
            document.add(new Paragraph("Ad: Kaan Öz\nAdres: İstanbul\nTelefon: 0555 555 55 55\nE-posta: rastgele@email.com"));

            document.add(new Paragraph("\nİŞ DENEYİMLERİ").setBold().setFontSize(14));

            document.add(new Paragraph("\n1. Siber Güvenlik Stajyeri - InfoSec Bilişim (2024 - Günümüz)").setBold());
            document.add(new Paragraph("Ağ güvenliği protokolleri, sızma testleri (penetrasyon) ve veri koruma stratejileri üzerine analizler yapıldı. Siber güvenlik eğitimlerinden edinilen bilgilerle sistem açıkları raporlandı."));

            document.add(new Paragraph("\n2. Yazılım Mühendisi - Tech Solutions (2022 - 2024)").setBold());
            document.add(new Paragraph("Java, C# ve Python kullanılarak nesne yönelimli sistem mimarileri kodlandı, kalıtım ve sarmalama prensiplerine uygun algoritmalar geliştirildi."));

            document.add(new Paragraph("\n3. Bağımsız (Indie) Oyun Tasarımcısı - Freelance (2021 - 2022)").setBold());
            document.add(new Paragraph("Oyun mekanikleri, bölüm tasarımı (level design) ve hikaye akışı kurgulandı. Kullanıcı deneyimini (UX) merkeze alan yaratıcı oyun konseptleri ve etkileşimli senaryolar geliştirildi."));

            document.close();
            System.out.println("PDF başarıyla oluşturuldu: " + dosyaYolu);

        } catch (Exception e) {
            System.out.println("Dosya oluşturulurken bir hata oluştu: " + e.getMessage());
        }
    }
}