public class Motor extends Pojazd
{
    private MarkaEnum marka;
    private String kolory;

    public Motor(Integer rokProdukcji, RodzajEnum rodzajPojazdu, int pojemnoscSilnika, MarkaEnum marka, String kolory)
    {
        super(rokProdukcji, rodzajPojazdu, pojemnoscSilnika);
        this.marka = marka;
        this.kolory = kolory;
    }

    public MarkaEnum getMarka()
    {
        return marka;
    }

    public String getKolory()
    {
        return kolory;
    }

    public void setMarka(MarkaEnum marka)
    {
        this.marka = marka;
    }

    public void setKolory(String kolory)
    {
        this.kolory = kolory;
    }

    @Override
    public String toString()
    {
        return  "\n\nRodzaj pojazdu: " + getMarka() +
                "\nMarka Pojazdu: " + getMarka() +
                "\nPojemnosc Silnika: " + getPojemnoscSilnika() +
                "\nIlosc koni mechanicznych" + getKolory() +
                "\nRok produkcji: " + getRokProdukcji();

    }
}
