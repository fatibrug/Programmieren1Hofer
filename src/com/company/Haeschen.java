package com.company;

public class Haeschen {
    String name;
    String farbe;
    static String spezies = "Leporidae";

    public void hoppel(String wohin){
        System.out.println(name + " hoppelt " + wohin);
    }
    //in statischen Methoden könne wir nur auf statische Attribute zugreifen
    //java weiß bei nicht statischen attributen ja nich von welchem objekt oder instanz wir
    //es haben wollen bzw. ob es überhaupt eine gibt
    public static void ausgabeSpezies (){
        spezies = "Lateinischer Name:" + spezies;
        System.out.println(spezies);

    }
}
