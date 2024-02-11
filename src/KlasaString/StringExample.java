package KlasaString;

public class StringExample {
    public static void main(String[] args){
        // Tworzenie obiektu klasy String
        String str = "Hello, World!";

        // Metoda length() - zwraca długość ciągu
        int length = str.length();
        System.out.println("Długość ciągu: " + length);

        // Metoda charAt() - zwraca znak na określonej pozycji
        char firstChar = str.charAt(0);
        System.out.println("Pierwszy znak: " + firstChar);

        // Metoda substring() - zwraca fragment ciągu
        String substring = str.substring(7, 12);
        System.out.println("Fragment ciągu: " + substring);

        // Metoda equals() - porównuje dwa ciągi pod względem zawartości
        String anotherString = "Hello, World!";
        boolean isEqual = str.equals(anotherString);
        System.out.println("Czy ciągi są równe? " + isEqual);

        // Metoda indexOf() - zwraca indeks pierwszego wystąpienia danego znaku
        int indexOfComma = str.indexOf(",");
        System.out.println("Indeks pierwszego wystąpienia przecinka: " + indexOfComma);

        // Metoda toUpperCase() - zamienia wszystkie znaki na wielkie litery
        String upperCaseStr = str.toUpperCase();
        System.out.println("Ciąg z dużymi literami: " + upperCaseStr);

        // Metoda toLowerCase() - zamienia wszystkie znaki na małe litery
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Ciąg z małymi literami: " + lowerCaseStr);

        // Metoda replace() - zamienia określony znak lub ciąg znaków na inny
        String replacedStr = str.replace("Hello", "Hi");
        System.out.println("Zamieniony ciąg: " + replacedStr);

        // Metoda trim() - usuwa białe znaki z początku i końca ciągu
        String trimmedStr = str.trim();
        System.out.println("Po przycięciu białych znaków: " + trimmedStr);

        // Metoda toCharArray() - zwraca tablicę znaków reprezentującą dany ciąg
        char[] charArray = str.toCharArray();
        System.out.print("Tablica znaków: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Metoda compareTo() - porównuje dwa ciągi leksykograficznie
        String anotherString2 = "Hello, Java!";
        int comparisonResult = str.compareTo(anotherString2);
        System.out.println("Wynik porównania: " + comparisonResult);
        // Wynik jest liczbą całkowitą:
        //  0 - oba ciągi są identyczne
        //  > 0 - bieżący ciąg leksykograficznie większy niż inny ciąg
        //  < 0 - bieżący ciąg leksykograficznie mniejszy niż inny ciąg
    }
}
