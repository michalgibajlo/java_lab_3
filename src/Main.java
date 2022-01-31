import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        Punkt punktA = new Punkt(7);
        punktA.toString();
        System.out.println(punktA.toString());

        Punkt punktB = new Punkt(3,4, 5);
        punktB.toString();
        System.out.println(punktB.toString());

        punktA.setX(7);
        punktA.setY(8);
        punktA.setZ(9);
        punktA.toString();
        System.out.println(punktA.toString());

        System.out.println(punktA.getX());
        System.out.println(punktA.getY());
        System.out.println(punktA.getZ());

        System.out.println(punktA.suma());
        System.out.println(punktA.roznica());
        System.out.println(punktA.roznica(8,5,2));

    }
}
