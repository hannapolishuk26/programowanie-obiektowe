import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //zad1
        System.out.println("Ania");
        System.out.println("Bartek");
        System.out.println("Kasia");

        //zad2
        String imie = "Hanna";
        int rokurodzenia = 2010;
        double liczba = 0.66;
        //zad3
        //zad3
        int obecnyRok = 2026;
        int wiek = (obecnyRok - rokurodzenia);
        System.out.println("Mam na imię " + imie + " mam " + wiek + " lat i będę pisać maturę za " + liczba + " roku.");

        //zad4
        double stopnie;
        System.out.println("Podaj temperature na dworze w stopniach Cel");
        stopnie = scanner.nextDouble();
        double fahrenheit = 1.8 * stopnie + 32.0;
        System.out.println("Temperatura w stopniach Fahrenheita: " + fahrenheit);
    }
}
