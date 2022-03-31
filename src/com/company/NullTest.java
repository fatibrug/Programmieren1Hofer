package com.company;

import java.util.Locale;

public class NullTest {
    public static void main(String[] args) {

        String hansisLieblingsPizza = null;    //zeigt nirgendwohin - können nichts damit tun weil dahinter kein string objekt steht

        //hansisLieblingsPizza.indexOf();

        //sobald wir ein objekt zuweisen ist es kein problem mehr und geht ganz normal
        hansisLieblingsPizza = " Margaritha (mit 1-2 kleinen Ananas unter dem Käse versteckt)";

        System.out.println(hansisLieblingsPizza);
        System.out.println(hansisLieblingsPizza.toUpperCase());

        String donau = "Donaudampfschifffahrgesellschaft";
        System.out.println(donau.indexOf("dampf"));

    }
}
