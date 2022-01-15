public class Pojazd
{
    private Integer RokProdukcji;
    private RodzajEnum RodzajPojazdu;
    protected int PojemnoscSilnika;

    public Pojazd(Integer rokProdukcji, RodzajEnum rodzajPojazdu, int pojemnoscSilnika)
    {
        RokProdukcji = rokProdukcji;
        RodzajPojazdu = rodzajPojazdu;
        PojemnoscSilnika = pojemnoscSilnika;
    }

    protected Integer getRokProdukcji()
    {
        return RokProdukcji;
    }

    protected RodzajEnum getRodzajPojazdu()
    {
        return RodzajPojazdu;
    }

    protected int getPojemnoscSilnika()
    {
        return PojemnoscSilnika;
    }

    public void setRokProdukcji(Integer rokProdukcji)
    {
        RokProdukcji = rokProdukcji;
    }

    public void setRodzajPojazdu(RodzajEnum rodzajPojazdu)
    {
        RodzajPojazdu = rodzajPojazdu;
    }

    public void setPojemnoscSilnika(int pojemnoscSilnika)
    {
        PojemnoscSilnika = pojemnoscSilnika;
    }

}



