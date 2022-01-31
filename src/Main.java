import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
         * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

        Scanner scan = new Scanner(System.in);
        while (true)
        {
            System.out.print("Wprowadź liczbę: ");
            int x = scan.nextInt();
            if (x==0) {break;}
            switch (x)
            {
                case 1:
                    System.out.println(liczby.jeden+" "+StatusEnum.KONTYNUUJEMY);
                    break;
                case 2:
                    System.out.println(liczby.dwa+" "+StatusEnum.KONTYNUUJEMY);
                    break;
                case 3:
                    System.out.println(liczby.trzy+" "+StatusEnum.KONTYNUUJEMY);
                    break;
                case 4:
                    System.out.println(liczby.cztery+" "+StatusEnum.KONTYNUUJEMY);
                    break;
                case 5:
                    System.out.println(liczby.piec+" "+StatusEnum.KONTYNUUJEMY);
                    break;
                case 6:
                    System.out.println(liczby.szesc+" "+StatusEnum.KONTYNUUJEMY);
                    break;
                case 7:
                    System.out.println(liczby.siedem+" "+StatusEnum.KONTYNUUJEMY);
                    break;
                case 8:
                    System.out.println(liczby.osiem+" "+StatusEnum.KONTYNUUJEMY);
                    break;
                case 9:
                    System.out.println(liczby.dziewiec+" "+StatusEnum.KONTYNUUJEMY);
                    break;
                case 10:
                    System.out.println(liczby.dziesiec+" "+StatusEnum.KONTYNUUJEMY);
                    break;
                default:
                    System.out.println("Liczba spoza zakresu, "+StatusEnum.KONTYNUUJEMY);
            }

        }
        System.out.println("Kończę pracę, "+StatusEnum.KONIEC);

    }
}

enum liczby {jeden, dwa, trzy, cztery, piec, szesc, siedem, osiem, dziewiec, dziesiec}
enum StatusEnum {KONTYNUUJEMY, KONIEC}