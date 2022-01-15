public class Student
{
    private Osoba osoba;
    private wydzialEnum wydzial;

    public Student(Osoba osoba, wydzialEnum wydzial)
    {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public Osoba getOsoba()
    {
        return osoba;
    }

    public wydzialEnum getWydzial()
    {
        return wydzial;
    }

    public void setOsoba(Osoba osoba)
    {
        this.osoba = osoba;
    }

    public void setWydzial(wydzialEnum wydzial)
    {
        this.wydzial = wydzial;
    }
    @Override
    public String toString()
    {
        return "Imie: " + getOsoba().getImie() +"\n"+
                "Nazwisko: " +getOsoba().getNazwisko() +"\n"+
                "Indeks: " +getOsoba().getIndeks() +"\n"+
                "Wydzial: " +wydzial+"\n\n";
    }
}
