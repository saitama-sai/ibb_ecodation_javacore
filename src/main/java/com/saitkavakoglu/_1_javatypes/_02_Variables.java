package com.saitkavakoglu._1_javatypes;

public class _02_Variables {
    public static void main(String[] args) {
        // Veri değişken isimlerini yazarken;
        /*
        veri isimlendirmeleri
        1-) isim veya sıfat, zamir kullanmamız lazım. Anlamlı ve açıklayıcı isimler olsun
        2-) _ veya $ ile başlayabilirsiniz.Bunlar dışında özel simgelerle başlanmaz
        3-) sayı ile başlanmaz.
        4-) sayı ile bitebilir.
        5-) camelCase kuralına göre yazılır.



         */
      int schoolNumber=23;
        System.out.println("schoolNumber:"+schoolNumber);
        schoolNumber=51;

        System.out.println("schoolNumber:"+schoolNumber);
        int _schoolNumber=99;
        System.out.println("_schoolNumber:"+_schoolNumber);

        int $schoolNumber123=101;
        System.out.println("$schoolNumber:"+$schoolNumber123);

        // yazamazsınız
        //int schoolNumber=11; aynı isimde yazamayız.
        //int ~schoolNumber=11; //özel simgeyle yazamayız.
        //int ``schoolNumber=11;
        // int 342schoolNumber=11;// sayıyla başlayamazsın
        // int school-Number=99; //kebab-case yazamazsınız.
        int school$Number=32;
        System.out.println("school$Number:"+school$Number);
        // özel karakter aralardada sadece $ ve _ kullanılabiliyor.
        int school1Number=8;
        System.out.println("school1Number:"+school1Number);
        //Shift + f6 : değişkenin isimini kodun her yerinde değiştirir zaman kazandırır.
        //float TotalSalary =3.14f; // camelCase e uygun değil yazma etik değil.
        float totalSalary= 3.14f;
        System.out.println("totalSalary:"+totalSalary);

        // SABIT
        final int MAX_STUDENTS=100;
        System.out.println("MAX_STUDENTS:"+MAX_STUDENTS);
        // MAX_STUDENT=134; //şeklinde bir şey yapmamıza izin vermez final keyi değişkeni sabitler.
    }
}
