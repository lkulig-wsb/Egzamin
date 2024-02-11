package LinkedList;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        // Utworzenie LinkedList przechowującej liczby całkowite
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Dodanie elementów na koniec listy za pomocą metody add()
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Dodanie elementów na początku listy
        linkedList.addFirst(5);

        // Dodanie elementu na końcu listy
        linkedList.addLast(40);

        // Wyświetlenie elementów listy
        System.out.println("Elementy linkedList: " + linkedList);

        // Pobieranie pierwszego i ostatniego elementu
        int firstElement = linkedList.getFirst();
        int lastElement = linkedList.getLast();
        System.out.println("Pierwszy element: " + firstElement);
        System.out.println("Ostatni element: " + lastElement);

        // Usuwanie pierwszego i ostatniego elementu
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Elementy linkedList po usunięciu pierwszego i ostatniego elementu: " + linkedList);

        // Iteracja po elementach linkedList
        System.out.println("Iteracja po elementach linkedList:");
        for (Integer element : linkedList) {
            System.out.println("Element: " + element);
        }
    }
}
