package Listy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
public class Listy {
    public static void main(String[] args) {

        // Utworzenie listy liczb całkowitych
        List<Integer> listaLiczb = new ArrayList<Integer>();

        // Dodanie elementów do listy za pomocą metody add().
        listaLiczb.add(10);
        listaLiczb.add(20);
        listaLiczb.add(30);
        listaLiczb.add(40);
        listaLiczb.add(50);

        //Pobieranie za pomocą metody get().
        int pierwszyElementTablicy = listaLiczb.get(0);
        System.out.println("Pierwszy element listyLiczb: " + pierwszyElementTablicy);

        // Wyświetlenie elementów listy
        System.out.println("Elementy listy: " + listaLiczb);

        //Sprawdzenie stanu listy. Pomocnicze metody.
        int iloscElem = listaLiczb.size();
        System.out.println("Ilość elem. Listy: " + iloscElem);

        //Sprawdzenie czy lista jest pusta.
        boolean listaJestPusta = listaLiczb.isEmpty();
        System.out.println("Czy lista jest Pusta: " + listaJestPusta);

        // Iteracja po elementach listy
        for (Integer liczba : listaLiczb) {
            System.out.println("Element: " + liczba);
        }
        //Dodawanie element na konkretną pozycję;
        listaLiczb.add(0,100);
        System.out.println("Elementy listy: " + listaLiczb);

        //Usuwanie elementu za pomocą metody remove().
        listaLiczb.remove(0);
        System.out.println("Elementy listy: " + listaLiczb);

        //Sprawdzenie czy lista zawiera dany element.
        boolean czyZawiera = listaLiczb.contains(10);
        System.out.println("Czy zawiera 10: " + czyZawiera);

        //Czyszczenie listy
        //listaLiczb.clear();

        //Zmiana elementu na inny.
        listaLiczb.set(0,300);
        System.out.println("Elementy listy: " + listaLiczb);

        //Wyszukanie indeksu:
        int index = listaLiczb.indexOf(20);
        System.out.println("Index of 20: " + index);

        //Sortowanie listy:
        Collections.sort(listaLiczb);
        System.out.println("Elementy listy: " + listaLiczb);
    }



}
