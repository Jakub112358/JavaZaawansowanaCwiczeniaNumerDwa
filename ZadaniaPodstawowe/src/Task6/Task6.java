package Task6;

//Napisz mechanizm, który skonwertuje listę typu String na listę typu Integer.
//zakomentowane linie były do zabawy modyfikowalnymi i niemodyfikowalnymi listami :)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {


        List<String> listBeforeConversion = new ArrayList<>(Arrays.asList("1","2","3"));
        List<Integer> listAfterConversion = listBeforeConversion.stream().map(Integer::parseInt).toList();
        System.out.println(listAfterConversion);

//        System.out.println(listAfterConversion.getClass());
//        List<Integer> modifiableIntegerList = new ArrayList<>(listAfterConversion);
//        System.out.println(modifiableIntegerList.getClass());

//        listBeforeConversion.add("4");
//        List<Integer> listAfterConversion = listBeforeConversion.stream()
//                .map(Integer::parseInt)
//                .toList(); //returns unmodifiable list
//                .collect(Collectors.toList());
//        listAfterConversion.add(4);
//        listAfterConversion = new ArrayList<>(listAfterConversion);
//        listAfterConversion.add(4); //won't work with .toList(); terminal operation without line above
//        System.out.println(listAfterConversion);
    }
}
