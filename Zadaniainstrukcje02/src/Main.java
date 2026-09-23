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

        scanner.close();
    }
}
