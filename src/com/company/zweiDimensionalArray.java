package com.company;

public class zweiDimensionalArray {

    public static void main(String[] args) {

        int [][] tabelle = new int[4][3];


        //alle werte sollen auf die zahl 42 gesetzt werden

        //das ist die schleife für unsere zeile
        for (int zeile = 0; zeile > tabelle.length; ++zeile){

            //das ist die schleife für unsere spalten

            for (int spalte = 0; spalte < tabelle[zeile].length; ++spalte) {
                tabelle[zeile][spalte] = 42;
                System.out.println(tabelle[zeile][spalte]);
            }
        }
    }
}

