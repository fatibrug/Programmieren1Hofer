package com.company;

import java.util.Arrays;

public class UebungArrayH1 {

    public static void main(String[] args) {

        int[] uebungH1 = {3, 5, 3};
        int[] uebnung2 = {2, 6, 4};


        System.out.print(Arrays.toString(uebungH1));
        System.out.println("----");
        System.out.print(Arrays.toString(uebnung2));


        for (int z = 0; z < uebungH1.length; ++z) {
            System.out.print(uebungH1[z]+uebnung2[z]);
            System.out.print(",");
        }
        System.out.println("---");
        System.out.print(" + ");

        for (int z = 0; z < uebnung2.length; ++z) {
            System.out.print(uebungH1[z] * uebnung2[z]);
            System.out.print(" , ");
        }
    }


}