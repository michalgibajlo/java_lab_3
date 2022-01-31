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

        Student Michal = new Student();
        Student A = new Student();
        Student B = new Student();

        Michal.imie="Michal"; Michal.nazwisko="Gibajlo"; Michal.wiek=27; Michal.przyjety=true;
        A.imie="Jan"; A.nazwisko="Kowalski"; A.wiek=23; A.przyjety=true;
        B.imie="Krzysztof"; B.nazwisko="Nowak"; B.wiek=31; B.przyjety=false;

        String[][] tablica = new String[][]{
                {Michal.imie, Michal.nazwisko}
        };

    }
}
