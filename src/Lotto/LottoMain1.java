package Lotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LottoMain1 {
    static Scanner scanner;

    public static void main(String[] args) {
        Integer[] arr = new Integer[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(arr));
        Integer[] lotto = new Integer[6];
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = arr[i];
        }
        scanner = new Scanner(System.in);
        lottoZgadywanie(lotto);
        scanner.close();
    }

    public static void lottoZgadywanie(Integer[] lotto) {
        Integer[] user = new Integer[6];
        int i = 0;
        while (true) {
            System.out.println("Podaj " + (i + 1) + " cyfrę: ");
            user[i] = pobIntOdUsera();
            for (int j = 0; j < i; j++) {
                if (user[i] == user[j]) {
                    System.out.println("Nie możesz się powtarzać");
                    i--;
                }
            }
            if (user[i] > 0 && user[i] < 50) {
                if (i == lotto.length - 1) {
                    break;
                }
                i++;
            } else {
                System.out.println("Tylko cyfry od 1 do 49");
            }

        }
        int counter = 0;
        for (int j = 0; j < lotto.length; j++) {
            for (int x = 0; x < lotto.length; x++) {
                if (user[i] == lotto[x]) {
                    counter++;
                    break;
                }
            }
        }
        if (counter >= 3) {
            System.out.println("Trafiłeś " + counter + " cyfr. No nieźle");
        }
    }

    static int pobIntOdUsera() {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Podej jeszcze roz");

        }
        return scanner.nextInt();
    }
}
