import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //zad1
        System.out.print("Podaj dodatnią liczbę całkowitą: ");
        int n = scanner.nextInt();
        if(n <= 0){
            System.out.println("liczba musi być dodatnia");
        }else{
            System.out.println("Liczby nieparzyste nie większe od " + n + ":");
        }
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        //zad2
        System.out.println("Podaj dodatnią liczbę całkowitą");
        int m = scanner.nextInt();
        if(m <= 0){
            System.out.println("liczba nusi być dodatnia");
        }else{
            System.out.println("Liczby nieparzyste nie większe od " + m + ":");
        }
        for (int i = 1; i <= m; i *= 2) {
            System.out.println(i);
        }
        //lub
        int potega = 1;
        while(potega <= m){
            System.out.println(potega);
            potega = potega * 2;
        }
        //zad3
        int suma = 0;
        int liczba;
        System.out.println("Podawaj liczby całkowite (wpisanie 0 kończy program):");
        do{
            System.out.println("Podaj liczbę: ");
            liczba = scanner.nextInt();
            suma += liczba;
        }while(liczba !=0);
        System.out.println("Suma wszystkich podanych liczb wynosi: " + suma);
        //zad4
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int num;
        int licznik = 1;
        System.out.println("Podawaj liczby calkowite(podanie 0 konczy program)");
        while (true){
            num = scanner.nextInt();
            if(num == 0){
                break;
            }
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }licznik++;
        }
        if(licznik > 0){
            int dodawanie = max + min;
            double srednia = (double) dodawanie / 2;
            System.out.println("Największa liczba: " + max);
            System.out.println("Najmniejsza liczba: " + min);
            System.out.println("Suma liczb: " + dodawanie);
            System.out.println("Średnia liczb: " + srednia);
        }else{
            System.out.println("Mie podano żadniej liczby(wpisano 0 jako pierwszą wartość");
            scanner.close();
        }
    }
}
