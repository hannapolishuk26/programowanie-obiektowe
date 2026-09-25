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
        System.out.println("Podaj pierwsza liczbe");
        int num1 = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int num2 = scanner.nextInt();
        System.out.println("Podaj trzecia liczbe");
        int num3 = scanner.nextInt();
        int najwieksza = num1;
        if(num2 > najwieksza){
            najwieksza = num2;
        }
        if(num3 > najwieksza){
            najwieksza = num3;
        }
        System.out.println("Nakwiekszą liczbą jest: " + najwieksza);

        //zad5
        System.out.println("Podaj numer miesiąca");
        int month = scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("Styczen");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecien");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpień");
                break;
            case 9:
                System.out.println("Wrzesien");
                break;
            case 10:
                System.out.println("Pażdziernik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzien");
                break;
            default:
                System.out.println("Nieprawidlowy numer miesiaca");
                break;
        }
        //zad6
        System.out.println("Podaj swoje imię");
        String yname = scanner.nextLine();
        String mname = "Hanna";
        if (mname.equals(yname)) {
            System.out.println("Mamy takie same imię");
        } else {
            System.out.println("Mamy różne imiona");
        }
        //zad7
        System.out.println("Podaj swoj wiek");
        int age = scanner.nextInt();
        boolean czyPelnoletniaos = (age >= 18) ? true : false;
        System.out.println(czyPelnoletniaos);

        //zad8
        System.out.println("Podaj rok");
        int rok = scanner.nextInt();
        if((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0){
            System.out.println("Rok " + rok + " jest rokiem przestępnym");
        }else{
            System.out.println("Rok" + rok + " nie jest rokiem przestępnym");
        }
        //zad9
        System.out.println("Podaj swoją wagę");
        double waga = scanner.nextDouble();
        System.out.println("Podaj swój wzrost");
        double wzrost = scanner.nextDouble();
        double BMI = waga/(wzrost * wzrost);
        if(BMI >= 18.5 && BMI <= 24.5){
            System.out.println("waga prawidłowa");
        } else if (BMI < 18.5) {
            System.out.println("niedowaga");
        }else{
            System.out.println("nadwaga");
        }
        //zad10
        System.out.println("Podaj cenę towaru");
        double cena = scanner.nextDouble();
        if (cena < 100 || cena > 10000) {
            System.out.println("Podana cena jest poza zakresem (100 - 10000 zł). Zmień dane");
        }
        System.out.println("Podaj liczba rat");
        int liczbaRat = scanner.nextInt();
        if(liczbaRat < 6 || liczbaRat > 48){
            System.out.println("Liczba rat jest poza zakresem (6 - 48). Zmien dane");
        }
        double oprocentowanie = 0.0;
        if(liczbaRat >= 6 && liczbaRat <= 12){
            oprocentowanie = 0.025;
        } else if (liczbaRat >= 13 && liczbaRat <= 24) {
            oprocentowanie = 0.05;
        } else if (liczbaRat >= 25 && liczbaRat <=48) {
            oprocentowanie = 0.10;
        }
        double odsetki = cena * oprocentowanie;
        double lacznaKwota = cena + odsetki;
        double miesiecznaRata = lacznaKwota / liczbaRat;

        System.out.println("Cena: " + cena);
        System.out.println("Liczba rat:" + liczbaRat);
        System.out.println("Oprocentowanie:"+ (oprocentowanie * 100));
        System.out.println("Kwota odsetek: " + odsetki);
        System.out.println("Miesięczna rata: " + miesiecznaRata);

        scanner.close();
    }
}
