package Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Napisz metodę, której celem jest wyświetlenie zwartości dowolnej listy z poniższych:
// - List< Integer > - List< Long > - List< Double > - List< Float >
public class Task6 {
    public static void main(String[] args) {

        Consumer<List<? extends Number>> numberListDisplay = System.out::println;


        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        displayList(integerList);
        numberListDisplay.accept(integerList);

        List<Long> longList = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L));
        displayList(longList);
        numberListDisplay.accept(longList);

        List<Double> doubleList = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4d));
        displayList(doubleList);
        numberListDisplay.accept(doubleList);

        List<Float> floatList = new ArrayList<>(Arrays.asList(1f, 2f, 3f, 4.0f));
        displayList(floatList);
        numberListDisplay.accept(floatList);
    }

    public static <T extends Number> void displayList(List<T> listToDisplay) {
        System.out.println(listToDisplay);
    }

}
