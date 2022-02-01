/* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
*/


public class Student {
    Osoba osoba;
    private WydzialEnum wydzial;

    public Student(Osoba osoba, WydzialEnum wydzial)
    {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public void setOsoba(Osoba osoba)
    {
        this.osoba = osoba;
    }

    public void setWydzial(WydzialEnum wydzial)
    {
        this.wydzial = wydzial;
    }

    public Osoba getOsoba()
    {
        return osoba;
    }

    public WydzialEnum getWydzial()
    {
        return wydzial;
    }

    @Override
    public String toString()
    {
        return "Student: "+ getOsoba().getImie()+" "+getOsoba().getNazwisko()+", index: "+getOsoba().getIndex()+", wydział "+getWydzial();
    }
}

enum WydzialEnum {Polityki, Gospodarki, Matematyki, Filoligii, Informatyki}