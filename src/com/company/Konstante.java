package com.company;

import org.w3c.dom.ls.LSOutput;

public class Konstante {

    public static void main(String[] args) {
        //das sind beide Konstanten - mit final können wir parameter und variablen als solche deklarieren - ihnne kann man max 1 mal einen wert zuweisen
        final int geburtsJahr = 1980;
        final int todesJahr;

        System.out.println(geburtsJahr);
        // geht nicht da noch nicht initialisiert!     System.out.println(todesJahr);

        todesJahr = 2222;
        System.out.println(todesJahr);

        //todesJahr = 1229;          kann nicht mehr initialisiert werden
        //System.out.println(todesJahr);
    }

}
