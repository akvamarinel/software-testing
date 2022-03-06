import functions.MyFunctions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class ModuleTests {
    private MyFunctions myFunctions;


    @BeforeEach
    public void setUp() {
        myFunctions = new MyFunctions();
    }

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI })
    void getValues(double number) {
        double tmp = myFunctions.myCos(number);
        assertEquals(tmp, Math.cos(number) ); // проверить значения 1, 0, -1 -- граничные значения
    } //fixme поменять название теста
}
