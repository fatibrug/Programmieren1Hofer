package com.company;

public class Tamagochi {

    int x;
    int y;
    int futter;




    public void moveTamagotchi (int schritte, String richtung) {

        while (futter > 0 && schritte > 0) {
            if (richtung.equals("oben")){
                ++y;}
            else if (richtung.equals("unten")) {
                --y;}
            else if (richtung.equals("links")) {
                --x;}
            else if (richtung.equals("rechts")) {
                ++x; }

            --schritte;
            --futter;
            }
        }


    //void fuetterung(int f) { futter = futter + f; }   -----Lösung vom Hofer

    public void futterTrog ( int energie) {

      futter = futter + energie;

        }
    }

