public class Student {
    String Imie;
    protected String Nazwisko;
    protected int Wiek;
    protected boolean CzyLubiLabolatoriaZJavy;

    Student(String i, String n, int w, boolean c)
    {
        this.Imie = i;
        this.Nazwisko = n;
        this.Wiek = w;
        this.CzyLubiLabolatoriaZJavy = c;
    }
}