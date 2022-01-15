public class Osoba
{
    private String imie;
    private String nazwisko;
    private Integer indeks;

    public Osoba(String imie, String nazwisko, Integer indeks)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public String getImie()
    {
        return imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public Integer getIndeks()
    {
        return indeks;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public void setIndeks(Integer indeks)
    {
        this.indeks = indeks;
    }

    public String zwrocInformacje()
    {
        return "Dane Osoby: " +
                "x=" + imie +
                ", y=" + nazwisko +
                ", z=" + indeks +
                '}';
    }
}
