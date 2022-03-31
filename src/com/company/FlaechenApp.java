package com.company;

public class FlaechenApp {

    public static void main(String[] args) {

        Punkt a = new Punkt();
        Punkt b = new Punkt();
        Punkt c = a;

        System.out.println(a.x + " " + a.y);

        a.aenderePosition(2,5);

        System.out.println(a.x + " " + a.y);

        System.out.println(c.x + " " + c.y); // da a und c beides Referenzen sind und auf das gleiche Punkt Pbjekt zeigen

        if (a == c) {
            System.out.println("a und c zeigen auf gleiche Punkt Instanz");
        }

        //system.out.println(b);

    }
}
