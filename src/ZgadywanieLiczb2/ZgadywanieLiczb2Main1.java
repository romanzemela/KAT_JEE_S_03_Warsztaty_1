package ZgadywanieLiczb2;


import java.util.Scanner;

public class ZgadywanieLiczb2Main1 {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        zgadywanie();
        scanner.close();
    }

    public static void zgadywanie() {
        int max = 1000;
        int min = 0;
        while (true) {

            System.out.println("Zgadłem " + (((max - min) / 2) + min) + " :D?");
            System.out.println("Wpisz jedno z poniższych: ");
            System.out.println("więcej");
            System.out.println("mniej");
            System.out.println("trafione");
            String newstring = scanner.nextLine();

            switch (newstring) {
                case "więcej":
                    min = (((max - min) / 2) + min);
                    continue;
                case "mniej":
                    max = (((max - min) / 2) + min);
                    continue;
                case "trafione":
                    System.out.println("Za pierwszym razem ^^ ");
                    break;
                default:
                    System.out.println("Podaj poprawną wartość");
                    continue;
            }
            break;
        }
    }
}
