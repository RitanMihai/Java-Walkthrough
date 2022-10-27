import collections.ArraysExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest {
    private ArraysExample dataSource;

    @BeforeEach
    public void setup(){
        dataSource = new ArraysExample(); /* new ArrayList<>(Arrays.asList(1,8,3,9,4,10,5)) */
    }

    @Test
    public void getFirst() {
        Integer expected = 1;
        Assertions.assertEquals(dataSource.getFirst(), expected);
    }

    @Test
    public void getLast() {
        Integer expected = 5;
        Assertions.assertEquals(dataSource.getLast(), expected);
    }

    @Test
    public void highest() {
        Integer expected = 10;
        Assertions.assertEquals(dataSource.getTheHighestNumber(), expected);
    }

    @Test
    public void lowest() {
        Integer expected = 1;
        Assertions.assertEquals(dataSource.getTheLowestNumber(), expected);
    }

    @Test
    public void sortAsc(){
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,3,4,5,8,9,10));
        Assertions.assertEquals(dataSource.sortAsc(), expected);
    }

    @Test
    public void sortDesc(){
        List<Integer> expected = new ArrayList<>(Arrays.asList(10,9,8,5,4,3,1));
        Assertions.assertEquals(dataSource.sortDesc(), expected);
    }
}
