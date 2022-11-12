package Task9;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Korzystając z Stream API, napisz funkcję, która dla poniższego przykładu:
//     List<Movie> movies = Arrays.asList(….)
//    gdzie Movie to klasa
//    class Movie {
//    String title;
//    String type;
//    long duration;//min
//    LocalDate releaseDate
//    }
// zwróci listę filmów, gdzie:
// - długość filmu będzie większa niż 20 min
// - rok wydania nie będzie starszy niż 2018
// - typ to horror
public class Task9 {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(new Movie("some comedy movie", "comedy", 90, LocalDate.of(2020, 10, 24))
                , new Movie("some short horror movie", "horror", 16, LocalDate.of(2020, 10, 24))
                , new Movie("some old horror movie", "horror", 80, LocalDate.of(1924, 10, 24))
                , new Movie("some new horror movie", "horror", 129, LocalDate.of(2022, 10, 24))
                , new Movie("other comedy movie", "comedy", 18, LocalDate.of(2020, 10, 24))
                , new Movie("other new horror movie", "horror", 90, LocalDate.of(2018, 1, 1)));

        List<Movie> newHorrorMovies = movies.stream()
                .filter(x -> x.getDuration()>20)
                .filter(x -> x.getReleaseDate().isAfter(LocalDate.of(2017,12,31)))
                .filter(x -> x.getType().equals("horror"))
                .collect(Collectors.toList());

        System.out.println(newHorrorMovies);

    }

}
