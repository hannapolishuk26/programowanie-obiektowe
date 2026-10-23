import jdk.swing.interop.SwingInterOpUtils;

void main() {
    //zad1
    int age = 16;
    System.out.println("Moj wiek: " + wyswietlWiek(age));

    //zad2
    String name = "Hanna";
    System.out.println("Nazywam się: " + wyswietlImie(name));

    //zad3
    dzialanieNaliczbach(3, 6);
    //zad4
    int n = 17;
    System.out.println(czyParzysta(n));

    //zad5
    int c = 15;
    System.out.println("Czy liczba jest podzielna na 3 i na 5? " + czyPodzielna(c));

    //zad6
    int number2 = 6;
    System.out.println("Liczba do potęgi 3: " + liczbaDoPotegi(number2));

    //zad7
    int z = 16;
    System.out.println("Pierwistek z liczby: " + z + " wynosi " + pierwiastekZLiczby(z));

    //zad8
    double odcineka = 4.0;
    double odcinekb = 3.0;
    double odcinekc = 5.0;
    System.out.println("Czy trójkąt jest prostokątny? " + czyProstokatny(odcineka, odcinekb, odcinekc));
}

int wyswietlWiek(int wiek){
    return wiek;
}
String wyswietlImie(String imie){
    return imie;
}
void dzialanieNaliczbach(int a, int b){
    System.out.println("Suma: " + (a + b));
    System.out.println("Różnica: " + (a - b));
    System.out.println("Iloczyn: " + (a * b));
}
boolean czyParzysta(int liczba){
    if(liczba % 2 == 0){
        return true;
    }else{
        return false;
    }
}
boolean czyPodzielna(int number){
    if(number % 3 == 0 && number % 5 == 0){
        return true;
    }else{
        return false;
    }
}
int liczbaDoPotegi(int num2){
    return num2 * num2 * num2;
}

double pierwiastekZLiczby(int liczbap){
    return  Math.sqrt(liczbap);
}
boolean czyProstokatny(double bok1, double bok2, double bok3){
    double a2 = bok1 * bok1;
    double b2 = bok2 * bok2;
    double c2 = bok3 * bok3;
    if((a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2)){
        return true;
    }else{
        return false;
    }
}