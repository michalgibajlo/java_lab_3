public class Samochod {
    protected EnumMarka marka;
    protected int ileosob;

    Samochod(){};
    Samochod(EnumMarka marka)
    {
        this.marka = marka;
    };

    Samochod(EnumMarka marka, int ileosob)
    {
        this.marka = marka;
        this.ileosob = ileosob;
    };

    public void setMarka(EnumMarka marka)
    {
        this.marka = marka;
    }

    public void setIleosob(int ileosob)
    {
        this.ileosob = ileosob;
    }

    public EnumMarka getMarka()
    {
        return marka;
    }

    public int getIleosob()
    {
        return ileosob;
    }

    @Override
    public String toString()
    {
        return "Samochód marki "+marka+" dla "+ileosob+" osób.";
    }
}

enum EnumMarka {Audi, BMW, Chevrolet, Fiat, Ford, Ferrari, Toyota};