package com.company;

public class NumberTest {
    public static void main(String[] args) {
        //wie komme ich zu meiner 10er stelle in einer zahl zwischen 0-99 (zwiter punkt wie komm ich zum jahrzehnt eines alters)

        int age = 25;
        int jahtzehnt = age / 10;

        System.out.println(jahtzehnt);

        //in einem japanischen dorf werden aber alle älter als 100 (wie komme ich zur zehnerstelle -> 137 ...3)

        //zuerst durch 10 damit die 7 verschwindet und dann modulo 10

        int zehnerStelle = (137 / 10) % 10;            //eine int division da beide zahlen ohne kommastelle, nach komma erscheint nicht
        System.out.println(zehnerStelle);

    }
}
