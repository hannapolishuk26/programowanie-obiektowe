import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //zad1
        System.out.println("Podaj liczbe:");
        int liczba = scanner.nextInt();
        if (liczba % 3 == 0) {
            System.out.println("Liczba " + liczba + " jest podzielna przez 3");
        } else {
            System.out.println("Liczba " + liczba + " nie dzieli się przez 3");
        }

        //zad2
        System.out.println("Podaj trzy długości boków trójkąta:");
        System.out.print("Bok a: ");
        double a = scanner.nextDouble();
        System.out.print("Bok b: ");
        double b = scanner.nextDouble();
        System.out.print("Bok c: ");
        double c = scanner.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Można zbudować trójkąt.");
        } else {
            System.out.println("Nie można zbudować trójkąta.");
        }

        //zad3
        System.out.println("Podaj pierwszą liczbe");
        int x = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int y = scanner.nextInt();
        if(x > y){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }

        //zad4
        System.out.println("Podaj pierwsza liczbę");
        int d = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int e = scanner.nextInt();
        System.out.println("Podaj trzecia liczbe");
        int f = scanner.nextInt();
        int najwieksza = d;

        if (e > najwieksza) {
            najwieksza = e;
        }
        if (f > najwieksza) {
            najwieksza = f;
        }
        System.out.println("Najwiekszą liczbą jest: " + najwieksza);
        scanner.close();
    }
}
