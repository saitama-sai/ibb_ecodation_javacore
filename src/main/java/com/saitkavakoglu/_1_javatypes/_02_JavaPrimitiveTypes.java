package com.saitkavakoglu._1_javatypes;

public class _02_JavaPrimitiveTypes
{
    public static void main(String[] args) {
        //Primitive Types 8 tanedir.null değer alamazsınız.
        //tam sayılar(4)
        byte b1=127;
        System.out.println("byte:"+b1);
        short s1=32767;
        System.out.println("short:"+s1);
        int i1=2147483640;
        System.out.println("int:"+i1);
        long l1=92343534556456L;
        System.out.println("long:"+l1);

        //virgüllü(floating point)sayılar
        float f1=3.14f;
        System.out.println("float:"+f1);
        double d1=3.14;
        System.out.println("double:"+d1);

        //boolean
        boolean b3=true;
        System.out.println("boolean:"+b3);
       //char
       char c1='a';
        System.out.println("char:"+c1);
        char c2='\u0041'; //UniCode karakter.
        System.out.println("char:"+c2);
    }

}
