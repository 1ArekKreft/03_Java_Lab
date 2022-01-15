public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Student Tomek = new Student(new Osoba("Tomasz","Nowak",53244),wydzialEnum.GDANSK);
        Student Maciek = new Student(new Osoba("Maciej","Kowalski",24123),wydzialEnum.WARSZAWA);
        Student Arek = new Student(new Osoba("Arkadiusz","Bialk",53241),wydzialEnum.RZESZOW);
        Student Mati = new Student(new Osoba("Mateusz","Gates",53121),wydzialEnum.KRAKOW);
        Student Krzysiu = new Student(new Osoba("Krzysztof","Czerw",63421),wydzialEnum.GDYNIA);

        Student [] Studenci = {Tomek, Maciek, Arek, Mati, Krzysiu};

        for(Student std : Studenci)
        {
            System.out.print(std.toString());
        }

    }
}
