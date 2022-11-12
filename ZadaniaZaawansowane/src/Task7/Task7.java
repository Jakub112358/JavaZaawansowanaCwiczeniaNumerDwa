package Task7;

import java.util.LinkedList;
import java.util.List;

//Zadanie 7
// Napisz własną implementację dodawania oraz odczytywania danych z LinkedList. Zastosuj typy generyczne.
public class Task7 {
    public static void main(String[] args) {


        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i + 1);
        }
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));

        List<Integer> modifiedLinkedList = new ModifiedLinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            modifiedLinkedList.add(i + 1); //.add (T) dodaje element T w losowym miejscu listy
        }
        System.out.println(modifiedLinkedList);
        System.out.println(modifiedLinkedList.get(2)); //.get(i) pobiera losowy element z zakresu 0:i
    }
}
