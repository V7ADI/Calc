package com.company;

public class Calculator {
    public static int Calc (int a1, int a2, String d) {
        int s = 0;
        if (a1 <= 10 && a2 <= 10 && a1 > 0 && a2 > 0) {
            if (d.equals("/")) {
                s = a1 / a2;
            }
            else if (d.equals("*")) {
                s = a1 * a2;
            }
            else if (d.equals("-")) {
                s = a1 - a2;
            }
            else if (d.equals("+")) {
                s = a1 + a2;
            }
        }
        return s;
    }
}