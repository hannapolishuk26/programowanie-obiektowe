import static com.sun.tools.javac.util.StringUtils.toUpperCase;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //zad1
        int[] tablicaParzysta = {10, 20, 30, 40, 50, 60};

        String[] tablicaNieparzysta = {"Banan", "Jabłko", "Brzoskwinia"};
        System.out.println("Co drugi element z tablicy parzystej (liczby):");
        for (int i = 0; i < tablicaParzysta.length; i += 2) {
            System.out.println(tablicaParzysta[i]);
        }
        System.out.println("Co drugi element z tablicy nieparzystej (teksty):");
        for (int i = 0; i < tablicaNieparzysta.length; i += 2) {
            System.out.println(tablicaNieparzysta[i]);
        }
        //zad2
        int[] tablicaNajwiekszuel = {2, 6, 8, 1, 0, 5, 7, 11};
        int max = tablicaNajwiekszuel[0];

        for(int i = 0; i < tablicaNajwiekszuel.length; i++ ){
            if(tablicaNajwiekszuel[i] > max){
                max = tablicaNajwiekszuel[i];
            }
            System.out.println("Największy element tablicy: " + max);
        }
        //zad3
        String[] produkty = {"Mleko", "Chleb", "Pomodory", "Cukierki"};
        for(String produkt : produkty){
            System.out.println(produkt.toUpperCase());
        }
        //zad4
        System.out.println("Podaj 5 słów i progra zapisze ich w tablicy");
        String[] slowauzut = new String[5];
        for(int i = 0; i < 5; i++ ){
            System.out.print("Słowo " + (i + 1) + ": ");
            slowauzut[i] = scanner.next();
        }

        for (int i = 4; i >= 0; i--) {
            String odwróconeSlowa = new StringBuilder(slowauzut[i]).reverse().toString();
            System.out.print(odwróconeSlowa + " ");
        }
    scanner.close();
    }
}
