package ru.netology.manager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
      PosterManager manager = new PosterManager();

    @Test
    void addFilm() {
        Poster firstFilm = new Poster(1,22,"Hola", "Comedy");
        manager.addFilm(firstFilm);
        Poster[] actual = manager.getLastPosters();
        Poster[] expected = new Poster[]{firstFilm};
        assertArrayEquals(expected,actual);
    }

    @Test
    void getLastPosters() {
        Poster firstFilm = new Poster(1,11,"Sun","Comedy");
        Poster secondFilm = new Poster(2,22,"Moon","Lamedy");
        Poster thirdFilm = new Poster(3,33,"Space","Lamusic");
        manager.addFilm(firstFilm);
        manager.addFilm(secondFilm);
        manager.addFilm(thirdFilm);
        manager.getLastPosters();
        Poster[] actual = manager.getLastPosters();
        Poster[] expected = new Poster[]{thirdFilm,secondFilm,firstFilm};
        assertArrayEquals(expected,actual);
    }



    @Test
    void getLastPostersWithCount() {
        PosterManager manager = new PosterManager(2);
        Poster firstFilm = new Poster(1,11,"Sun","Comedy");
        Poster secondFilm = new Poster(2,22,"Moon","Lamedy");
        Poster thirdFilm = new Poster(3,33,"Space","Lamusic");
        manager.addFilm(firstFilm);
        manager.addFilm(secondFilm);
        manager.addFilm(thirdFilm);
        manager.getLastPosters();
        Poster[] actual = manager.getLastPosters();
        Poster[] expected = new Poster[]{thirdFilm,secondFilm};
        assertArrayEquals(expected,actual);
    }
}