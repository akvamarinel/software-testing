package functions;

import functions.MyFunctions;
import functions.UsefulMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class MyFunctionsTests {
    private MyFunctions myFunctions;
    private final double DELTA = 1.0e-3;


    @BeforeEach
    public void setUp() {
        myFunctions = new MyFunctions();
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0.523599, 0.8660",
            "0.785398, 0.70710",
            "1.0472, 0.499997"
    })
    public void myCosReturnsPositiveValuesInFirstQuarter (double arg, double ans) {
        double tmp = myFunctions.myCos(arg);
        assertEquals(tmp, ans, DELTA);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "-0.523599, 0.8660",
            "-0.785398, 0.70710",
            "-1.0472, 0.499997"
    })
    public void myCosReturnsPositiveValuesInFourthQuarter(double arg, double ans){
        double tmp = myFunctions.myCos(arg);
        assertEquals(tmp, ans, DELTA);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2.0944, -0.500004",
            "2.35619, -0.707103",
            "2.61799, -0.86602"
    })
    public void myCosReturnsNegativeValuesInSecondQuarter(double arg, double ans){
        double tmp = myFunctions.myCos(arg);
        assertEquals(tmp, ans, DELTA);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "-2.0944, -0.500004",
            "-2.35619, -0.707103",
            "-2.61799, -0.86602"
    })
    public void myCosReturnsNegativeValuesInThirdQuarter(double arg, double ans){
        double tmp = myFunctions.myCos(arg);
        assertEquals(tmp, ans, DELTA);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0})
    public void myCosReturnsOneWhenZero(double arg){
        double tmp = myFunctions.myCos(arg);
        assertEquals(tmp, 1);
    }


    @ParameterizedTest
    @ValueSource(doubles = {3.141592})
    public void myCosReturnsMinusOneWhen180(double arg){
        double tmp = myFunctions.myCos(arg);
        assertEquals(tmp, -1, DELTA);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.5708})
    public void myCosReturnsZeroWhen90(double arg){
        double tmp = myFunctions.myCos(arg);
        assertEquals(tmp, 0, DELTA);
    }

    @Test
    public void myCosReturnsNaNWhenNan(){
        double tmp = myFunctions.myCos(Double.NaN);
        assertEquals(tmp, Double.NaN);
    }

    @ParameterizedTest
    @ValueSource(doubles = {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY})
    public void myCosReturnsNaNWhenInfinity(double arg){
        double tmp = myFunctions.myCos(arg);
        assertEquals(tmp, Double.NaN);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    public void factReturnsOneWhenZeroAndOne(int arg){
        assertEquals(UsefulMethods.fact(arg), 1);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2, 2",
            "8, 40320",
            "10, 3628800"
    })
    public void factReturnsCorrectValuesWhenMoreThanZero(int arg,int ans){
        assertEquals(UsefulMethods.fact(arg), ans);
    }

    @Test
    public void factReturnsExceptionWhenLessThanZero(){
        assertThrows(IllegalArgumentException.class, ()->{UsefulMethods.fact(-10);});
    }

}
