package Task8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

//Zadanie 8
// Na podstawie poniższej listy napisz mechanizm, który zwróci tylko elementy unikalne:
//    List<Integer> values = new ArrayList<>();
//    values.add(10);
//    values.add(11);
//    values.add(10);
//    values.add(11);
//    values.add(12);
//    values.add(11);
public class Task8 {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);

        System.out.println(values);

        //z użyciem interfejsu funkcyjnego:
        UnaryOperator<List<Integer>> deleteDuplicates = x -> {
            List<Integer> resultList = new ArrayList<>();
            for (Integer integer : x) {
                if(!resultList.contains(integer)){
                    resultList.add(integer);
                }
            }
            return resultList;
        };

        System.out.println(deleteDuplicates.apply(values));

        //z użyciem streamu:
        List<Integer> valuesReducedUsingStream = values.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(valuesReducedUsingStream);



        //z użyciem zwykłej metody statycznej:
        System.out.println(deleteDuplicatesMethod(values));

    }

    private static List<Integer> deleteDuplicatesMethod (List<Integer> inputList){
        List<Integer> resultList = new ArrayList<>();
        for (Integer integer : inputList) {
            if(!resultList.contains(integer)){
                resultList.add(integer);
            }
        }
        return resultList;
    }

}
