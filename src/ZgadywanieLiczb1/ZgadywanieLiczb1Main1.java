package ZgadywanieLiczb1;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class ZgadywanieLiczb1Main1 {
    static Scanner scanner;

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(99) + 1;
        scanner = new Scanner(System.in);
        zgadywanie(a);
        scanner.close();

    }

    public static void zgadywanie(int zgadywana) {
        while (true) {
            System.out.println("Zgaduj");
            int odusera = pobIntOdUsera();

            if(odusera!=-1) {
                if (odusera < zgadywana) {
                    System.out.println("za mało");
                } else if (odusera > zgadywana) {
                    System.out.println("Za dużo");
                } else {
                    System.out.println("Zgadłeś!");
                    break;
                }
            }
        }
    }

    static int pobIntOdUsera() {
        while (scanner.hasNextLine() && !scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Podej jeszcze roz");

        }
        return scanner.nextInt();

    }


}
