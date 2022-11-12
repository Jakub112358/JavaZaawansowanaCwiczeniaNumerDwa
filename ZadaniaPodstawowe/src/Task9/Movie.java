package Task9;

import java.time.LocalDate;

public class Movie {
   private String title;
    private String type;
    private long duration;
    private LocalDate releaseDate;

    public Movie(String title, String type, long duration, LocalDate releaseDate) {
        this.title = title;
        this.type = type;
        this.duration = duration;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public long getDuration() {
        return duration;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", duration=" + duration +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
