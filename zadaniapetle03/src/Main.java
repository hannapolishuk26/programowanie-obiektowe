import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //zad1
        System.out.print("Podaj dodatnią liczbę całkowitą: ");
        int n = scanner.nextInt();
        if(n <= 0){
            System.out.println("liczba nusi być dodatnia");
        }else{
            System.out.println("Liczby nieparzyste nie większe od " + n + ":");
        }
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
