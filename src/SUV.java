public class SUV extends Samochod{
    Samochod samochod;
    private EnumModel model;
    private int rok;

    SUV(){};
    SUV(Samochod samochod, EnumModel model, int rok)
    {
        this.samochod = samochod;
        this.model = model;
        this.rok = rok;
    };

    public void setModel(EnumModel model)
    {
        this.model = model;
    }

    public void setRok(int rok)
    {
        this.rok = rok;
    }

    public EnumModel getModel()
    {
        return model;
    }

    public int getRok()
    {
        return rok;
    }

    @Override
    public String toString()
    {
        return "Model "+model+" z "+rok+" roku.";
    }
}

enum EnumModel {Q7, Rav4, CHR, X6}