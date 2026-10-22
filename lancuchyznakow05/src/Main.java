import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //zad1
        System.out.println("Wpisz tekst");
        String tekst = scanner.nextLine().toLowerCase();
        if(tekst.isEmpty()){
            System.out.println("Wpisz tekst, ciąg jest pusty");
        }else{
            char ostatniznak = tekst.charAt(tekst.length() - 1);
            int licznik = 0;
            for(int i = 0; i< tekst.length(); i++){
                if(ostatniznak == tekst.charAt(i)){
                    licznik++;
                }
            }
            System.out.println("Ostatni znak powtarza sie " + licznik + " razy");
        }
        //zad2
        System.out.println("Wpisz tekst do odwrocenia");
        String tekst2 = scanner.nextLine();
        String odwrocony = new StringBuilder(tekst2).reverse().toString();
        System.out.println(odwrocony);

        //zad3
        System.out.println("Nspisz zdanie do obliczenia sumy liczb: ");
        String zdanie = scanner.nextLine();
        int suma = 0;
        for(int i = 0; i < zdanie.length(); i++){
            char znak = zdanie.charAt(i);
            if(Character.isDigit(znak)){
                suma += Character.getNumericValue(znak);
            }
        }
        int wynik = 0;
        String dowolnytekst = String.valueOf(suma);
        for(int i = 0; i< dowolnytekst.length(); i++){
            char znak = dowolnytekst.charAt(i);
            wynik += Character.getNumericValue(znak);
        }
        System.out.println("Suma cyfr jest równa " + wynik);
        scanner.close();
    }
}