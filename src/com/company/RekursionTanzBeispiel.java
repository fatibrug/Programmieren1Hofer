package com.company;

public class RekursionTanzBeispiel {
    public static void main(String[] args) {

        walk(5, 0);

    }
    public static void walk(int countSteps, int currentStepp){
        if(countSteps > currentStepp){
            System.out.println("Step foward: " + (currentStepp + 1));
            walk(countSteps, ++currentStepp);
        }
        if (currentStepp < countSteps){
            System.out.println("Step beckward: " + currentStepp);
        }
    }
}
