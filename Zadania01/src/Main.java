import java.util.Locale;
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
        //zad5
        System.out.println("Podaj pierwszy bok trójkąta");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugi bok trójkąta");
        double b = scanner.nextDouble();
        System.out.println("Podaj trzeci bok trójkąta");
        double c = scanner.nextDouble();
        double obwod = a + b + c;
        System.out.println("Obwod trojkata wynosi: " + obwod);
        //zad6
        System.out.println("Podaj pierwsze slowo");
        String slowo1 = scanner.nextLine();
        System.out.println("Podaj drugie slowo");
        String slowo2 = scanner.nextLine();
        System.out.println("Podaj trzecie slowo");
        String slowo3 = scanner.nextLine();
        System.out.println(slowo3 + " , " + slowo2 + " , " + slowo1);
        //zad7
        //zad8
        int x = 5;
        int y = 2;
        double wynik = (double) x / y;
        System.out.println("Wyhik wynosi: " + wynik);
        //zad9
        System.out.println("Podaj slowo: ");
        String word = scanner.nextLine();
        System.out.println("Tekst wilekimi literami: " + word.toUpperCase());

        //zad10
        System.out.println("Podaj promień kola: ");
        int r = scanner.nextInt();
        double polekola = Math.PI * r * r;
        System.out.println("Pole kola rowna się: " + polekola);
    }
}
