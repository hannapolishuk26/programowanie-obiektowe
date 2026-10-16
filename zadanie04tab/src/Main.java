
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // zad1 - Co drugi element z tablic
        int[] tablicaParzysta = {10, 20, 30, 40, 50, 60};
        String[] tablicaNieparzysta = {"Banan", "Jabłko", "Brzoskwinia"};
        System.out.println("Co drugi element z tablicy liczb:");
        for (int i = 0; i < tablicaParzysta.length; i += 2) {
            System.out.println(tablicaParzysta[i]);
        }
        System.out.println("Co drugi element z tablicy tekstowej:");
        for (int i = 0; i < tablicaNieparzysta.length; i += 2) {
            System.out.println(tablicaNieparzysta[i]);
        }
        // zad2 - Znajdowanie największego elementu
        int[] tablicaNajwieksza = {2, 6, 8, 1, 0, 5, 7, 11};
        int max = tablicaNajwieksza[0];

        for (int i = 1; i < tablicaNajwieksza.length; i++) {
            if (tablicaNajwieksza[i] > max) {
                max = tablicaNajwieksza[i];
            }
        }
        System.out.println("Największy element tablicy: " + max);

        // zad3 - Wyświetlanie produktów wielkimi literami
        String[] produkty = {"Mleko", "Chleb", "Pomidory", "Cukierki"};
        for (String produkt : produkty) {
            System.out.println(produkt.toUpperCase());
        }
        // zad4 - Wczytywanie 5 słów i odwracanie ich kolejności
        // oraz liter w każdym słowie
        System.out.println("Podaj 5 słów, a program zapisze je w tablicy:");
        String[] slowa = new String[5];
        for (int i = 0; i < slowa.length; i++) {
            System.out.print("Słowo " + (i + 1) + ": ");
            slowa[i] = scanner.next();
        }
        System.out.println("Słowa w odwrotnej kolejności, z odwróconymi literami:");
        for (int i = slowa.length - 1; i >= 0; i--) {
            String odwroconeSlowo =
                    new StringBuilder(slowa[i]).reverse().toString();
            System.out.print(odwroconeSlowo + " ");
        }
        //zad5
        System.out.println("Podaj 8 liczb, a program zapisze je w tablicy: ");
        int[] liczbysort = new int[8];
        System.out.println("Podaj 8 liczb całkowitych:");
        for (int i = 0; i < liczbysort.length; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            liczbysort[i] = scanner.nextInt();
        }
        for (int i = 0; i < liczbysort.length - 1; i++) {
            for (int j = 0; j < liczbysort.length - 1 - i; j++) {
                if (liczbysort[j] > liczbysort[j + 1]) {
                    int temp = liczbysort[j];
                    liczbysort[j] = liczbysort[j + 1];
                    liczbysort[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < liczbysort.length; i++) {
            System.out.println(liczbysort[i]);
        }
        //zad6
        scanner.close();
    }
}
