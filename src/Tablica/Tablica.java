package Tablica;



public class Tablica {
    public static void main(String[] args){

        String tablicaStr[] = new String[6];

        tablicaStr[0]="Adam";
        tablicaStr[1]="Anna";
        tablicaStr[2]="Łukasz";
        tablicaStr[3]="Hania";

        //Dostęp do pierwszego elementu.
        System.out.println("tablicaStr[0]: " + tablicaStr[0]);

        //Deklaracja z inicjalizacją:

        String[] tablicaStr2 = {"jeden","dwa","trzy"};

        System.out.println(tablicaStr2[2]);

        //Zadeklarowanie tablicy jako ostatni argument metody

        int[] tablicaLiczb = {10, 20, 30, 40, 50,78,15,9,11,23};

        wyswitlTablice(tablicaLiczb);
        System.out.println();

        //Sprawdzenie rozmiaru tablicy.
        int rozmiarTablicyLiczb = tablicaLiczb.length;

        System.out.println("Rozmiar tablicyLiczb to: " + rozmiarTablicyLiczb);


    }

    //Iteracja po elementach tablicy.
    public static void wyswitlTablice(int[] tablica){
        for(int i=0; i< tablica.length; i++){
            System.out.print(tablica[i] + " ");
        }
    }

}
