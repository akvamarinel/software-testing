package model;

import functions.UsefulMethods;
import model.Stars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StarsTests {

    Stars stars;

    @BeforeEach
    void setUp(){
        stars = new Stars();
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0, звезды блестели",
            "1, звезды сияли",
            "2, звезды горели"
    })
    void shineReturnsCorrect(int arg, String res) {
        stars.setShine(arg);
        Assertions.assertEquals(res, stars.shine());
    }

    @Test
    public void shineReturnsExceptionWhenMoreThan2(){
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
            stars.setShine(4); });
    }
}
