package com.saitkavakoglu._1_javatypes;

public class _06_Math {
    public static void main(String[] args) {

        System.out.println("En küçük :" + Math.min(-300, 10));
        System.out.println("En büyük :" + Math.max(-300, 10));
        System.out.println("Mutlak   :" + Math.abs(-7));

        System.out.println("Karakok  :" + Math.sqrt(25));
        System.out.println("Karakok  :" + Math.sqrt(Math.abs(-25)));

        System.out.println("Üslü     :" +Math.pow(2,5));

        System.out.println("Alta yuvarla   :"+Math.floor(2.9));
        System.out.println("Üste yuvarla   :"+Math.ceil(2.1));
        System.out.println("Üste yuvarla   :"+Math.ceil(2.00001));
        System.out.println("Ortalama yuvarla   :"+Math.round(3.4));//5 in altını aşağı yuvarla
        System.out.println("Ortalama yuvarla   :"+Math.round(3.5));//5 ve üstü yukarı yuvarla


        System.out.println("PI Sayısı :"+Math.PI);
        System.out.println("E :" +Math.E);
    }
}