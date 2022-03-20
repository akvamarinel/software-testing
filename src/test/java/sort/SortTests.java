package sort;

import functions.UsefulMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sorts.Sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SortTests {
    private Sort sort;

    @BeforeEach
    void setUp(){
        sort = new Sort();
    }

    @Test
    void heapSortMakesCorrectSortFirst(){
        int arr [] = {5, 9, -1, 3};
        int ans [] = {-1, 3, 5, 9};
        sort.heapSort(arr);
        assertArrayEquals(arr, ans);
    }

    @Test
    void heapSortMakesCorrectSortWithSecond(){
        int arr [] = {-1, 1000, 3, -4};
        int ans [] = {-4, -1, 3, 1000};
        sort.heapSort(arr);
        assertArrayEquals(arr, ans);
    }
    @Test
    public void heapSortReturnsException(){
        assertThrows(NullPointerException.class, ()->{
            sort.heapSort(null);});
    }


}
