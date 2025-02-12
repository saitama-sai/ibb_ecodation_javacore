package com.saitkavakoglu._1_javatypes;

public class _02_Variables {
    public static void main(String[] args) {
        // Veri değişken isimlerini yazarken;
        /*
        veri isimlendirmeleri
        1-) isim veya sıfat, zamir kullanmamız lazım.
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

        int $schoolNumber=101;
        System.out.println("$schoolNumber:"+$schoolNumber);

        // yazamazsınız
        //int schoolNumber=11; aynı isimde yazamayız.
        //int ~schoolNumber=11; //özel simgeyle yazamayız.
        //int ``schoolNumber=11;
        // int 342schoolNumber=11;// sayıyla başlayamazsın
    }
}
