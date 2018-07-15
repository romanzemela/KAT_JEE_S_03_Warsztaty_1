package Kostki;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Kostki {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        kostki();
        scanner.close();

    }

    public static void kostki() {
        while (true) {
            String newstring = "";
            System.out.println("Podaj jakimi kostami działamy");

            newstring = scanner.nextLine();

            String czym = "";
            String poprawka = "";
            String ile = "";
            switch (newstring) {
                case "quit":
                    System.out.println("Żegnam");
                    break;
                default:
                    newstring = newstring.trim();
                    try {
                        ile = newstring.substring(0, newstring.indexOf("D"));
                    } catch (StringIndexOutOfBoundsException e7) {
                        System.out.println("Źle to podałeś");
                        continue;
                    }
                    try {
                        czym = newstring.substring(newstring.indexOf("D") + 1, newstring.indexOf("+"));
                    } catch (StringIndexOutOfBoundsException e) {
                        try {
                            czym = newstring.substring(newstring.indexOf("D") + 1, newstring.indexOf("-"));
                        } catch (StringIndexOutOfBoundsException e2) {
                            czym = newstring.substring(newstring.indexOf("D") + 1);
                        }
                    }
                    try {
                        poprawka = newstring.substring(newstring.indexOf("+"));
                    } catch (StringIndexOutOfBoundsException e3) {
                        try {
                            poprawka = newstring.substring(newstring.indexOf("-"));
                        } catch (StringIndexOutOfBoundsException e4) {
                            poprawka = "0";
                        }
                    }
                    int result = 0;
                    try {
                        for (int x = Integer.valueOf(ile); x > 0; x--) {
                            Random r = new Random();
                            int a = r.nextInt(Integer.valueOf(czym) - 1) + 1;
                            result += a;
                        }
                    } catch (NumberFormatException e5) {
                        try {
                            Random r = new Random();
                            int a = r.nextInt(Integer.valueOf(czym) - 1) + 1;
                            result = a;
                        } catch (NumberFormatException e6) {
                            System.out.println("Niepoprawnościenna kostka");
                            continue;
                        }
                    }
                    result = result + Integer.parseInt(poprawka);
                    System.out.println(result);
                    continue;
            }
            break;
        }
    }
}
