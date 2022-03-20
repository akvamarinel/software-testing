package model;

import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RocketTests {
    private Motor motor;
    private Rocket rocket;
    private Air air;

    @BeforeEach
    void setUp(){
        motor = new Motor();
        rocket = new Rocket(motor);
        air = new Air();
    }

    @Test
    public void flyReturnsExceptionWhenMoreThan5() throws Exception{
        for(int i = 0; i < 4; i++){
            rocket.fly(air);
        }
        assertThrows(MotorException.class, ()->{
            rocket.fly(air);});

    }

}
