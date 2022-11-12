package Task8;

import java.time.LocalDate;
import java.util.Objects;

//Zadanie 8
// Przygotuj klasę  o następujących polach:
// - title (String)
// - reżyser (String)
// - rok wydania (int)
// Dodaj dwa jednakowe obiekty do list i HashSetu:
// * najpierw bez implementacji metody hashCode i metody Equals
// * z implementacją metody equals
// * z implemenetacją metody hashCode
// Zaobserwuj różnicę. Dla powyższej listy liczba duplikatów powinna być równa: 2
public class Movie {
    private String title;
    private String director;
    private int releaseDate;

    public Movie(String title, String director, int releaseDate) {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return releaseDate == movie.releaseDate && Objects.equals(title, movie.title) && Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, director, releaseDate);
    }
}
