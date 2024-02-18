package Operatory;

public class OperatoryPrzykłady {
    public static void main(String[] args){

        //Arytmetyczne:
        int a = 10;
        int b = 3;
        int suma = a + b;    // suma = 13
        int roznica = a - b; // roznica = 7
        int iloczyn = a * b; // iloczyn = 30
        int iloraz = a / b;  // iloraz = 3
        int reszta = a % b;  // reszta = 1
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("Suma: " + suma);
        System.out.println("Różnica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
        System.out.println("Iloraz: " + iloraz);
        System.out.println("Modulo(reszta): " + reszta);

        //Operatory porównania:
        int x = 5;
        int y = 10;
        boolean czyRowne = (x == y);  // false
        boolean czyNierowne = (x != y); // true
        boolean czyMniejszy = (x < y); // true
        System.out.println(x + " == " + y + " >> " +czyRowne);

        //Logiczne

        boolean warunek1 = true;
        boolean warunek2 = false;
        boolean wynikAnd = warunek1 && warunek2; // false
        boolean wynikOr = warunek1 || warunek2;  // true
        boolean wynikNot = !warunek1;           // false

        //Przypisania
        int c = 5;
        System.out.println("Początkowe c = " + c);

        c += 3;  // a teraz wynosi 8 (bo 5 + 3)
        System.out.println("c += 3 >> " + c);
        c-=4;
        System.out.println("c -= 4 >> " + c);
        c*=4;
        System.out.println("c *= 4 >> " + c);

        //Trójargumentowy
        int z = 10;
        int v = (z > 5) ? 20 : 30;  // y teraz wynosi 20, bo warunek (x > 5) jest prawdziwy

        //Postinkrementacja
        int l = 5;
        int m = l++;  // postinkrementacja
        System.out.println("l = " + l);
        System.out.println("m = " +m);

        //Preinkrementacja
        int f = 5;
        int i = ++f;  // preinkrementacja
        System.out.println("f = " + f);
        System.out.println("i = " +i);

        //Operator ~ (negacja bitowa)
        /*
        Operator ~ w języku Java to operator bitowy NOT (negacji bitowej).
        Działa na poziomie bitów, zamieniając każdy bit w liczbie całkowitej na przeciwny. Jeśli bit był ustawiony na 0,
        po zastosowaniu operatora ~ staje się on 1, a jeśli był ustawiony na 1, to po zastosowaniu operatora staje się 0.
        Binarna reprezentacja 5: 00000000 00000000 00000000 00000101
        Negacja bitowa: 11111111 11111111 11111111 11111010
        */

        int liczba = 5;
        int negacjaBitowa = ~liczba;

        System.out.println("Liczba: " + liczba);
        System.out.println("Negacja bitowa: " + negacjaBitowa);


        //Operatory przesunięcia >>, <<, >>>,  <<
        // int przesunietaLiczba = liczba >> iloscPozycji;
        int liczba1 = 16;  // Binarnie: 00000000 00000000 00000000 00010000
        int przesunietaLiczba = liczba1 >> 2;  // Przesunięcie o 2 miejsca w prawo

        System.out.println("Liczba1: " + liczba1);
        System.out.println("Przesunięta liczba: " + przesunietaLiczba);


        /*
        Operator ^ to operator bitowego XOR (exclusive OR) w języku Java. Operator ten wykonuje operację XOR na
        poszczególnych bitach dwóch liczb całkowitych. Wynik XOR to 1, gdy bity są różne, a 0, gdy są takie same.

         00000101 (5)
         00000011 (3)
         XOR: 00000110 (6)
        */

        int liczba2 = 5;   // Binarnie: 00000000 00000000 00000000 00000101
        int liczba3 = 3;   // Binarnie: 00000000 00000000 00000000 00000011
        int wynikXOR = liczba2 ^ liczba3;

        System.out.println("Liczba 1: " + liczba2);
        System.out.println("Liczba 2: " + liczba3);
        System.out.println("Wynik XOR: " + wynikXOR);

        //Warunek trójargumentowy:

        int liczba4 = 10;

        String wynik = (liczba4 > 5) ? "Liczba jest większa od 5" : "Liczba nie jest większa od 5";
        System.out.println(wynik);
    }
}
