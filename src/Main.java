import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        System.out.println("Zadanie 1:");

        Student Michal = new Student();
        Student A = new Student();
        Student B = new Student();

        Michal.imie="Michal"; Michal.nazwisko="Gibajlo"; Michal.wiek=27; Michal.przyjety=true;
        A.imie="Jan"; A.nazwisko="Kowalski"; A.wiek=23; A.przyjety=true;
        B.imie="Krzysztof"; B.nazwisko="Nowak"; B.wiek=31; B.przyjety=false;

        String[] Timie = new String[] {Michal.imie, A.imie, B.imie};
        String[] Tnazwisko = new String[] {Michal.nazwisko, A.nazwisko, B.nazwisko};
        Integer[] Twiek = new Integer[] {Michal.wiek, A.wiek, B.wiek};
        Boolean[] Tprzyjety = new Boolean[] {Michal.przyjety, A.przyjety, B.przyjety};

        for (int a=0; a<=2; a++)
        {
            System.out.print(Timie[a]+" ");
            System.out.print(Tnazwisko[a]+" ");
            System.out.print(Twiek[a]+" ");
            System.out.println(Tprzyjety[a]);
        }

    }
}
