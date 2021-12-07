package com.company;

public class Check {
    public static int flag(String f1, String f2) {
        int flag = 0;
        String[] x = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] y = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals(f1) || x[i].equals(f2)) {
                flag = 1;
            }
        }
        for (int i = 0; i < y.length; i++) {
            if (y[i].equals(f1) || y[i].equals(f2)) {
                flag = 2;
            }
        }
        return flag;
    }

    public static void ArabCheck (String f1,String f2) {
        String [] x = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int flag1 = 0;
        int flag2 = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals(f1)) {
                flag1 = 1;
            }
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals(f2)) {
                flag2 = 1;
            }
        }
        int flag3 = flag1+flag2;
        if (flag3 != 2) {
            System.out.println("Output: ");
            throw new IllegalArgumentException();
        }
    }

    public static void RomCheck (String f1,String f2) {
        String [] y = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int flag1 = 0;
        int flag2 = 0;
        for (int i = 0; i < y.length; i++) {
            if (y[i].equals(f1)) {
                flag1 = 1;
            }
        }
        for (int i = 0; i < y.length; i++) {
            if (y[i].equals(f2)) {
                flag2 = 1;
            }
        }
        int flag3 = flag1+flag2;
        if (flag3 != 2) {
            System.out.println("Output: ");
            throw new IllegalArgumentException();
        }
    }
}