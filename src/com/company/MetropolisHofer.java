package com.company;

public class MetropolisHofer {

    public static void main(String[] args) {

        boolean isCapital;
        int inhabitation;
        double texPerPersonAndMonth;

        isMetropolis(false, 3000000, 500000000);


        System.out.println(isMetropolis(true, 200000, 720000000));
        System.out.println(isMetropolis(false, 1600000, 73000000));



    }

    public static boolean isMetropolis(boolean isCapital, int inhabitation, double texPerPersonAndMonth) {

        if ((inhabitation > 200000) || (isCapital && inhabitation > 100000) && ((inhabitation*texPerPersonAndMonth*12) >= 720000000)){
            return true;

        }
           return false;
    }
}
