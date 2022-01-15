import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Samochod S63 = new Samochod(2005,RodzajEnum.Samochod,2500,MarkaEnum.Mercedes,"163","s63");
        Samochod E36 = new Samochod(2001,RodzajEnum.Samochod,1900,MarkaEnum.BMW,"115","e36");
        Samochod RAV4 = new Samochod(2010,RodzajEnum.Samochod,3000,MarkaEnum.Toyota,"200","RAV4");
        Motor Z900 = new Motor(2017,RodzajEnum.Motor,250,MarkaEnum.Kawasaki,"czerwono-zielony");
        Motor CC150 = new Motor(2019,RodzajEnum.Motor,125,MarkaEnum.Honda,"czarno-pomarańczowy");

        List MyLista = new ArrayList<Pojazd>();
        MyLista.add(S63);
        MyLista.add(E36);
        MyLista.add(RAV4);
        MyLista.add(Z900);
        MyLista.add(CC150);



    }
}
