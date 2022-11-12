package Task7;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

//// Zadanie 7
//// Napisz klasę Car, która będzie zawierać pola nazwa i rodzaj samochodu.
//// Stwórz kolejkę Samochódw.
//// - Dodaj kilka samochodów do kolejki.
//// - przeiteruj po wszystkich dostępnych samochodach
//// - zaprezentuj działanie metody peek(), pop()
public class CarTest {
    public static void main(String[] args) {
        //tworzenie kolejki:
        Queue<Car> carQueue = new ArrayDeque<>();
        //dodawanie elementów:
        carQueue.add(new Car("fiat 126p","supercar"));
        carQueue.add(new Car("bmw x6","suv"));
        carQueue.add(new Car("solaris urbino","bus"));
        carQueue.add(new Car("kia sportage","suv"));

        //iteracja przez kolejke z wyświetlaniem elementów
        for (Car car : carQueue) {
            System.out.println(car);
        }

        System.out.println();

        //metoda peek - pobiera element (pierwszy) ale go nie usuwa z kolejki
        System.out.println(carQueue.peek());
        System.out.println(carQueue);
        // metoda poll - pobiera element (pierwszy) i usuwa z kolejki
        System.out.println(carQueue.poll());
        System.out.println(carQueue);

        System.out.println();

        //tworzenie nowego stosu
        Stack<Car> carStack = new Stack<>();
        //przypisanie elementow z kolejki do stosu
        carStack.addAll(carQueue);
        System.out.println(carStack);
        //metoda pop - pobiera element (ostatni) ze stosu i go usuwa ze stosu
        System.out.println(carStack.pop());
        System.out.println(carStack);



    }
}
