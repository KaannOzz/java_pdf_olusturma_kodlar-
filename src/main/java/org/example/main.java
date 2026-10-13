package org.example;

public class main {
    public static void main(String[] args) {
        // PDF oluşturma işlemini ayrı sınıftaki nesne üzerinden çağırıyoruz
        cvgenerator cv = new cvgenerator();
        cv.pdfOlustur("Ozgecmis.pdf");
    }
}