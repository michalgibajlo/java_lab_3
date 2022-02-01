import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>,
            f) wyświetlić dane
         */

        Samochod A01 = new Samochod(EnumMarka.Audi, 5);
        Samochod T01 = new Samochod(EnumMarka.Toyota, 4);
        Samochod B01 = new Samochod(EnumMarka.BMW, 2);

        SUV suv1 = new SUV(A01, EnumModel.Q7, 2019);
        SUV suv2 = new SUV(T01, EnumModel.Rav4, 2022);
        SUV suv3 = new SUV(B01, EnumModel.X6, 2017);

        ArrayList<SUV> cars =new ArrayList<SUV>();
            cars.add(suv1);
            cars.add(suv2);
            cars.add(suv3);

        System.out.println(A01.toString()+" "+suv1.toString());
        System.out.println(T01.toString()+" "+suv2.toString());
        System.out.println(B01.toString()+" "+suv3.toString());



    }
}
