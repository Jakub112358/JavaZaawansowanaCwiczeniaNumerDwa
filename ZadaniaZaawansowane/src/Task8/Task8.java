package Task8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {


        Movie movie1 = new Movie("title1", "director1", 2010);
        Movie movie2 = new Movie("title2", "director2", 2012);
        Movie movie3 = new Movie("title1", "director1", 2010);

        List<Movie> movieList = new ArrayList<>();
        HashSet<Movie> movieHashSet = new HashSet<>();

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        System.out.println(movieList);

        movieHashSet.add(movie1);
        movieHashSet.add(movie2);
        movieHashSet.add(movie3);

        System.out.println(movieHashSet);

    }
}
