package Tablica;

public class Tablica {
    public static void main(String[] args){

        String tablicaStr[] = new String[6];

        tablicaStr[0]="Adam";
        tablicaStr[1]="Anna";
        tablicaStr[2]="Łukasz";
        tablicaStr[3]="Hania";

        System.out.println("tablicaStr[0]: " + tablicaStr[0]);

        //Deklaracja z inicjalizacją:

        String[] tablicaStr2 = {"jeden","dwa","trzy"};

        System.out.println(tablicaStr2[2]);

        //Zadeklarowanie tablicy jako ostatni argument metody

        int[] tablicaLiczb = {10, 20, 30, 40, 50,78};

        wyswitlTablice(tablicaLiczb);
        System.out.println();


    }

    public static void wyswitlTablice(int[] tablica){
        for(int i=0; i< tablica.length; i++){
            System.out.print(tablica[i] + " ");
        }
    }

}
