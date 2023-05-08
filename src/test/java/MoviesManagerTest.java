import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoviesManagerTest {

    @Test
    public void add() {
        MoviesManager manager = new MoviesManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");
        manager.add("film 6");
        manager.add("film 7");
        manager.add("film 8");
        manager.add("film 9");
        manager.add("film 10");

        String[] actual = manager.findAll();
        String[] expected = {"film 1", "film 2", "film 3", "film 4 ", "film 5", "film 6", "film 7", "film 8", "film 9", "film 10"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add2() {
        MoviesManager manager = new MoviesManager();
        manager.add("film 1");
        manager.add("film 2");


        String[] expected = {"film 1", "film 2"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add4() {
        MoviesManager manager = new MoviesManager();


        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLast() {
        MoviesManager manager = new MoviesManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");
        manager.add("film 6");
        manager.add("film 7");
        manager.add("film 8");
        manager.add("film 9");
        manager.add("film 10");

        String[] actual = manager.findLast();
        String[] expected = {"film 10", "film 9", "film 8", "film 7 ", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast2() {
        MoviesManager manager = new MoviesManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");
        manager.add("film 6");
        manager.add("film 7");
        manager.add("film 8");
        manager.add("film 9");

        String[] actual = manager.findLast();
        String[] expected = {"film 9", "film 8", "film 7 ", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast3() {
        MoviesManager manager = new MoviesManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");
        manager.add("film 6");
        manager.add("film 7");
        manager.add("film 8");
        manager.add("film 9");
        manager.add("film 10");
        manager.add("film 11");

        String[] actual = manager.findLast();
        String[] expected = {"film 11", "film 10", "film 9", "film 8", "film 7 ", "film 6", "film 5", "film 4", "film 3", "film 2"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast4() {
        MoviesManager manager = new MoviesManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");


        String[] actual = manager.findLast();
        String[] expected = {"film 5", "film 4", "film 3", "film 2", "film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }
}