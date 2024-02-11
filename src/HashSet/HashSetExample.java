package HashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetExample {
    public static void main(String[] args) {
        // Utworzenie HashSet przechowującej ciągi znaków
        Set<String> hashSet = new HashSet<>();

        // Dodanie elementów do HashSet za pomocą metody add()
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("JavaScript");
        hashSet.add("Java"); // Ten element zostanie zignorowany, ponieważ HashSet przechowuje tylko unikalne elementy

        // Wyświetlenie elementów HashSet
        System.out.println("Elementy HashSet: " + hashSet);

        // Sprawdzenie, czy HashSet zawiera określony element
        boolean czyZawieraJava = hashSet.contains("Java");
        System.out.println("Czy HashSet zawiera Java? " + czyZawieraJava);

        // Usunięcie elementu z HashSet
        hashSet.remove("C++");

        // Wyświetlenie elementów po usunięciu
        System.out.println("Elementy HashSet po usunięciu C++: " + hashSet);

        // Iteracja po elementach HashSet za pomocą iteratora
        System.out.println("Iteracja po elementach HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // Sprawdzenie, czy HashSet jest pusty
        boolean czyPusty = hashSet.isEmpty();
        System.out.println("Czy HashSet jest pusty? " + czyPusty);

        // Pobranie rozmiaru HashSet
        int rozmiar = hashSet.size();
        System.out.println("Rozmiar HashSet: " + rozmiar);

        // Wyczyszczenie HashSet
        hashSet.clear();
        System.out.println("Elementy HashSet po wyczyszczeniu: " + hashSet);

        // Iteracja po elementach HashSet za pomocą pętli for-each
        System.out.println("Iteracja po elementach HashSet:");

        for (String element : hashSet) {
            System.out.println("Element: " + element);
        }
    }
}
