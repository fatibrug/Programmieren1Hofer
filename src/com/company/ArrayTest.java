package com.company;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        String [] quartale = {"Frühling", "Sommer", "Herbst", "Winter"};

        String qu1 = quartale [0];

        //arrays.toString erlaubt uns schöne ausgabe - sonst wird objektreferenz ausgegeben
        System.out.println(Arrays.toString(quartale));

        System.out.println(qu1);
        quartale[0] = "Frühling";

        System.out.println(Arrays.toString(quartale));
        quartale[1] = "Sommer";

    }
}
