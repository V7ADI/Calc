package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static String input;
    public static String b1;
    public static String b2;
    public static String b3;
    public static int result;
    public static String numb1;
    public static String numb2;
    public static String sign;

    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        checkSign(input);
        getNumb(input);
        getSymbol(input);

        b1 = numb1;
        b2 = numb2;
        b3 = sign;

        int flag = Check.flag(b1, b2);
        if (flag == 1) {
            int num1 = Integer.parseInt(b1);
            int num2 = Integer.parseInt(b2);
            Check.ArabCheck(b1, b2);
            int result1 = Calculator.Calc(num1, num2, b3);
            System.out.println("Output:");
            System.out.println(result1);
        } else if (flag == 2) {

            int x = RomanArab.Arab1(b1);
            int y = RomanArab.Arab2(b2);
            Check.RomCheck(b1, b2);
            result = Calculator.Calc(x, y, b3);
            if (result < 1) {
                System.out.println("Output:");
                throw new IllegalArgumentException();
            }
            System.out.println("Output:");
            System.out.println(RomanDigit.Rom());
        } else {
            System.out.println("Output:");
            throw new IllegalArgumentException();
        }
    }

    public static void checkSign(String x) {
        StringTokenizer tokenizer = new StringTokenizer(x, "1234567890XIV ");
        String[] y = new String[10];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            y[i] = token;
            i++;
        }
        String[] y1 = Arrays.copyOf(y, i);
        if (y1.length > 1) {
            System.out.println("Output:");
            throw new IllegalArgumentException();
        }
        if (y[0] == null) {
            System.out.println("Output:");
            throw new IllegalArgumentException();
        }
    }

    public static void getNumb(String x) {
        StringTokenizer tokenizer = new StringTokenizer(x, "*/+- ");

        int i = 0;
        while (i < 2) {
            String token = tokenizer.nextToken();
            if (i < 1)
                numb1 = token;
            else
                numb2 = token;
            i++;
        }
    }

    public static void getSymbol(String x) {
        StringTokenizer tokenizer = new StringTokenizer(x, "1234567890XIV ");
        while (tokenizer.hasMoreTokens()) {
            sign = tokenizer.nextToken();
        }
    }
}