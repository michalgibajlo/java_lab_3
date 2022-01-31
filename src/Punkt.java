/* klasa Punkt */
public class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */

    private int pX, pY, pZ;

    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    Punkt(){} //pusty konstruktor
    Punkt(int x) //konstruktor inicjalizujacy zmienną pX
    {
        this.pX = x;
    }

    Punkt(int x, int y) //konstruktor inicjalizujący wszystkie zmienne
    {
        this.pX = x;
        this.pY = y;
    }

    Punkt(int x, int y, int z) //konstruktor inicjalizujący wszystkie zmienne
    {
        this.pX = x;
        this.pY = y;
        this.pZ = z;
    }

    public void setX(int x) //stworzyć settery
    {
        this.pX = x;
    }

    public void setY(int y) //stworzyć settery
    {
        this.pY = y;
    }

    public void setZ(int z) //stworzyć settery
    {
        this.pZ = z;
    }

    public void setpZ(int pZ)
    {
        this.pZ = pZ;
    }

    public int getX() //stworzyć gettery
    {
        return pX;
    }

    public int getY() //stworzyć gettery
    {
        return pY;
    }

    public int getZ() //getter do zmiennej pZ niech zwraca return pZ * 10
    {
        return pZ*10;
    }

    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */

    public int suma()
    {
        return pX+pY+pZ;
    }

    public int roznica()
    {
        return (pX-pY-pZ);
    }

    public int roznica(int x, int y, int z)
    {
        return (pX*x - pY*y - pZ*z);
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "x=" + pX +
                ", y=" + pY +
                ", z=" + pZ +
                '}';
    }


}
