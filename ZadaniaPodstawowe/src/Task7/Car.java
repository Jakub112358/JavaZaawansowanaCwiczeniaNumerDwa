package Task7;
// Zadanie 7
// Napisz klasę Car, która będzie zawierać pola nazwa i rodzaj samochodu.
// Stwórz kolejkę Samochódw.
// - Dodaj kilka samochodów do kolejki.
// - przeiteruj po wszystkich dostępnych samochodach
// - zaprezentuj działanie metody peek(), pop()
public class Car {
    private String name;
    private String type;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
