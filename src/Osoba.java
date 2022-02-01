/* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
*/

public class Osoba {

    private String imie;
    private String nazwisko;
    private int index;

    Osoba(){};

    Osoba(String imie)
    {
        this.imie = imie;
    }

    Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    Osoba(String imie, String nazwisko, int index)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public String getImie()
    {
        return imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public int getIndex()
    {
        return index;
    }

    @Override
    public String toString()
    {
        return "Osoba (" +
                "imie = "+imie+
                ", nazwisko = "+nazwisko+
                ", index = "+index+
                ")";
    }
}