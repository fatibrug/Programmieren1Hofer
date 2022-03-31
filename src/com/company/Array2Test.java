package com.company;

public class Array2Test {

    public static void main(String[] args) {

        String[] smartphoneNamen = {"Samsung A 51", "iPhone 13", "Huawei 15", "Nokia 3210", "Xiaomi 7T"};

        //eine zeile steht für ein smartphone
        //jede spalte in der zeile steht für verkaufszahlen in den jeweiligen quartelen

        int[][] smatrPhoneVerkaufszahlen = {
                {2000, 3000, 4000, 5000},
                {1000, 2999, 4000, 3000},
                {1000, 3000, 2000, 5000},
                {3000, 4000, 5000, 7000},
                {1800, 3000, 5000, 3700}
        };
        System.out.println(" - -- - --- ---");
        System.out.println(jahresVerkaufszahlen(smatrPhoneVerkaufszahlen, 2));
        System.out.println(jahresVerkaufszahlen(smatrPhoneVerkaufszahlen, -1));
        System.out.println("$$$$$$$$$$$$$$$$$");
        String sName = erfolgreichstesSmartphoneQuartal(smatrPhoneVerkaufszahlen, smartphoneNamen, 4);
        System.out.println(sName);
        sName = erfolgreichstesSmartphoneQuartal(smatrPhoneVerkaufszahlen, smartphoneNamen, 42);
        System.out.println(sName);

        for (int sNr = 0; sNr < smartphoneNamen.length; ++sNr) {
            System.out.println(smartphoneNamen[sNr]);

        }
        //schon wieder für faule :) (wir möchten den Inhalt nicht verändern --for each loop)
        //for each loop - schnellschreibweiße
        //rechts vom: steht das array (oder sonstwas was mehr date beinhaltet)
        //links daneben meine laufvariable die den typ des inhalts des arrays hat
        //(kann einen beliebten namen haben - eine sogenannte "hansi" variablen)

        for (String smartphone : smartphoneNamen) {
            System.out.println(smartphone);
        }
        // alle smartPhoneVerkaufszahle inklusive namen ausgeben

        for (int sIndex = 0; sIndex < smatrPhoneVerkaufszahlen.length; ++sIndex) {
            System.out.print(smartphoneNamen[sIndex] + ": ");

            for (int qIndex = 0; qIndex < smatrPhoneVerkaufszahlen[sIndex].length; ++qIndex) {
                System.out.print(smatrPhoneVerkaufszahlen[sIndex][qIndex] + " ");

            }
            //nach ausgabe aller quartalszahlen möchte ich einen zeilenumbruch bitte
            System.out.println();
        }
    }

        //zwite methoden: eine soll die über das jahr verkauften zahlen eines smartphones zurückliefern:
        //zahlen sind unsere verkaufszahlen
        //welchensSmartphone: Index der angibt an welchenm Smartphone wir ineressiert in (0 basiert)
        //weitere Anforderungen: wenn ungültiger wert auf welchesSmartphone angegeben wird bitte -1 zurückliefern

        public static int jahresVerkaufszahlen ( int[][] zahlen, int welchesSmartphone){
            if (welchesSmartphone < 0 || welchesSmartphone >= zahlen.length) {
                return -1;
            }
            int summe = 0;
            for (int q = 0; q < zahlen[welchesSmartphone].length; ++q) {
                summe += zahlen[welchesSmartphone][q];
            }
            return summe;                  //todo: durch korrekten code bitte erstezen

        }
        //die folgende methode soll uns den Namen des smartphones liefern, das in einem bestimmten quartal am erfollgreichsten war
        //zahlen: unsere Verkaufszahlen
        //namen: unser samartphon namen
        //quartalnr: für welches quartal soll berechtet werden (zwischen 1 und 4) - sonst rückgabewert leerer String

        public static String erfolgreichstesSmartphoneQuartal ( int[][] zahlen, String[] name,int quartalNr){

            if (quartalNr < 1 || quartalNr > 4) {
                return "";
            }
            //spalten bleiben immer gleich
            //zahlen[][quartalNr - 1]
            //nehmen wir an erste zahl ist die größte zahl (zugleich gehen wir davon aus, dass es immer zumindest eine zahl im array gibt)

            int idxGr = 0;
            int zaehlerGr = zahlen[0][quartalNr - 1];
            //z = 1 weil wir es nicht mit der ersten zahl vergleichen mussen weil sie selbst die zahl ist
            for (int z = 1; z < zahlen.length; ++z) {
                if (zahlen[z][quartalNr - 1] > zaehlerGr) {
                    zaehlerGr = zahlen[z][quartalNr - 1];
                    idxGr = z;

                    //wie kann man jetzt noch den richtigen smartphonnamen ausliefern


                }
            }
            return name[idxGr];

    }

}
