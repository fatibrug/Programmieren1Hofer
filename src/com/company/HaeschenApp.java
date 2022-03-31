package com.company;

public class HaeschenApp {

    public static void main(String[] args) {
        //statisches Attribut/Methode kann auch ohme Objekt oder Instanz verwendet werden
        // mit dem Namen der Klasse!!!

        System.out.println(Haeschen.spezies);

        //jetz legen wir uns einen Rogger an!

        Haeschen rogger = new Haeschen();

        // zugreifen auf Attribut

        rogger.name = "Rogger Rabbit";
        rogger.farbe = "weiß";
        System.out.println(rogger.name + " " + rogger.farbe);

        Haeschen bugs = null;      //nur um zu zeigen dass ich irgendwann später die instanz erzeugen kann
        // irgendwann später

        bugs = new Haeschen();
        bugs.name = "Bugs Bunny";
        bugs.farbe = "grau";

        //was geht auch noch aber ist unueblich

        //wir testen unsere hoppel methode - ohne haeschen geht nix!!!
        //Haeschen....geht nicht
        bugs.hoppel("nach hinten");
        rogger.hoppel("in the woods");

        //Aufrug statische Methode
        Haeschen.ausgabeSpezies();
    }
}
