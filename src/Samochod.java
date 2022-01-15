public class Samochod extends Pojazd
{
    private MarkaEnum Marka;
    private String IloscKM;
    private String Model;

    public Samochod(Integer rokProdukcji, RodzajEnum rodzajPojazdu, int pojemnoscSilnika, MarkaEnum marka, String iloscKM, String model) {
        super(rokProdukcji, rodzajPojazdu, pojemnoscSilnika);
        Marka = marka;
        IloscKM = iloscKM;
        Model = model;
    }

    public MarkaEnum getMarka()
    {
        return Marka;
    }

    public String getIloscKM()
    {
        return IloscKM;
    }

    public String getModel()
    {
        return Model;
    }

    public void setMarka(MarkaEnum marka)
    {
        Marka = marka;
    }

    public void setIloscKM(String iloscKM)
    {
        IloscKM = iloscKM;
    }

    public void setModel(String model)
    {
        Model = model;
    }
    @Override
    public String toString()
    {
        return  "\n\nRodzaj pojazdu: " + getMarka() +
                "\nMarka Pojazdu: " + getMarka() +
                "\nModel Pojazdu " + getModel() +
                "\nPojemnosc Silnika: " + getPojemnoscSilnika() +
                "\nIlosc koni mechanicznych" + getIloscKM() +
                "\nRok produkcji: " + getRokProdukcji();

    }
}
