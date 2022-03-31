package com.company;

public class Wiederholung1 {

    public static void main(String[] args) {

        int a = 1, b = 6;
        String s = "Hansi";


        System.out.println(a);
        System.out.println(b);

          //suchen im string nach dem ersten vorkommen der position a
        int position = s.indexOf("a");
        System.out.println(position);


        //hier wollten wir zeigen dass double nicht immer ganz genau rechnet!
        double f1 = 100.0f;
        double d = 0.1;
        double d3 = 0.00000001;
        double d4 = 1000000.0;
        System.out.println(f1 + d + d3 + d4);


        // unterschied post- und preinkrement bzw. dekrement
        a = 1;
        int c;

        ++a;  // wir erwarten 2
        System.out.println(a);

        c = ++a; // wir erwarten überall 3
        System.out.println("a" + a + "c: " +c);

        c = a++; //wir erwarten ???
        System.out.println("a:" + a + "c: " +c);

       myLittleHelper("santa clause");
       myLittleHelper("s");
       // das hat nichts damit zu tun kann irgendwie heißen
        String helper = "Batman";
        myLittleHelper(helper);
    }

    public static void myLittleHelper(String helper)  {
        System.out.println("i am the little helper " + helper);
    }
}
