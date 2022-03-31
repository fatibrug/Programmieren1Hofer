package com.company;

public class TamagotchiApp {

    public static void main(String[] args) {
         Tamagochi neon = new Tamagochi();

         neon.x = 6;
         neon.y = 4;
         neon.futter = 5;

         neon.moveTamagotchi(6, "links");  //wir hoffen darauf dass es 6 geht aber wird wohl nur 5 schritte gehen
        neon.futterTrog(5);
        neon.moveTamagotchi(1, "rechts");
        neon.moveTamagotchi(4, "oben");
        System.out.println(neon.x + " " + neon.y);
    }

}
