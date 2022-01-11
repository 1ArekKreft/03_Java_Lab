import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student Ania = new Student("Anna","Nowak",18, true);
        Student Maciek = new Student("Maciej","Kowalski",25, true);
        Student Mati = new Student("Mateusz","Morawiecki",54, true);

        Student [] Studenci = {Ania, Maciek, Mati};

        for(Student std : Studenci)
        {
            System.out.print("\nImię studenta: ");
            System.out.print(std.Imie);
            System.out.print("\nNazwisko studenta: ");
            System.out.print(std.Nazwisko);
            System.out.print("\nWiek studenta: ");
            System.out.print(std.Wiek);
            System.out.print("\nCzy student lubi laborki z Javy? ");
            System.out.print(std.CzyLubiLabolatoriaZJavy ? "Tak!" : "Nie!");
            System.out.println();
        }


    }
}
