//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Hello world!"); //wypisz i zrob enter
    System.out.println("Sktot"); //sout

    System.out.print("Coś bez robienia entera");
    System.out.println("Nowa linia");

    System.out.println("W taki sposób robię znaki specjalne:");
    System.out.println("\t tabulacja"); //tab
    System.out.println("\n enter"); //enter
    System.out.println("To jest jak na maszynie\rdo pisania");//powrot karetki
    System.out.println("\"codzyslów\"");
    System.out.println("\'apostrof\'");
    System.out.println("backslash: \\");

    int liczbaCalkowita = 5;
    double liczbaRzeczywista;
    liczbaRzeczywista = (double) liczbaCalkowita/2;
    System.out.println("Wynik dzielenia liczby 5 przez 2 to " + liczbaRzeczywista/2);

    char znak = 'a';
    System.out.println("Litera a ma wartość " + (znak + 0));

    String napis = "napis";
    System.out.println("Napisz wielkimi literami " + napis.toUpperCase());

    System.out.println("Wynik 1+2+3 = " + 1 + 2 + 3); // bo pierwszym jest string
    System.out.println("Wynik 1+2+3 = " + (1 + 2 + 3));//zasady matmy
    System.out.println(1 + 2 + 3 + " to Wynik 1 + 2 + 3");
}
