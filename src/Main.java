import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        //w Osoba.java
        Osoba A = new Osoba("Adam", "Wojciechowski", 123456);
        System.out.println(A.toString());



        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba();
        Osoba osoba3 = new Osoba();
        Osoba osoba4 = new Osoba();
        Osoba osoba5 = new Osoba();

        Student student1 = new Student(osoba1, WydzialEnum.Matematyki);
        Student student2 = new Student(osoba2, WydzialEnum.Filoligii);
        Student student3 = new Student(osoba3, WydzialEnum.Polityki);
        Student student4 = new Student(osoba4, WydzialEnum.Gospodarki);
        Student student5 = new Student(osoba5, WydzialEnum.Informatyki);

        student1.osoba.setImie("Adam"); student1.osoba.setNazwisko("Jankowicz"); student1.osoba.setIndex(34697);
        student2.osoba.setImie("Wojtek"); student2.osoba.setNazwisko("Malicz"); student2.osoba.setIndex(72957);
        student3.osoba.setImie("Piotr"); student3.osoba.setNazwisko("Makowicz"); student3.osoba.setIndex(89032);
        student4.osoba.setImie("Tomasz"); student4.osoba.setNazwisko("Płachetka"); student4.osoba.setIndex(52069);
        student5.osoba.setImie("Michał"); student5.osoba.setNazwisko("Wojtyła"); student5.osoba.setIndex(21278);

        ArrayList<Student> studenci =new ArrayList<Student>();
            studenci.add(student1);
            studenci.add(student2);
            studenci.add(student3);
            studenci.add(student4);
            studenci.add(student5);

        for (Student x: studenci)
        {
            System.out.println(x);
        }



    }
}
