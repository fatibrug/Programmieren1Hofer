package com.company;

public class TeilerFinden {

    public static void main(String[] args) {


        istTeiler(12);
        System.out.println("-------");
        istTeiler(20);
        System.out.println("----");

    }

    public static void istTeiler(int z) {

        int teiler = 2;

        while (teiler < z) {
            if ((z % teiler) == 0) {
                System.out.println(teiler);
            }
        ++teiler;
        }
    }


}







