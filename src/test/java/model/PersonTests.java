package model;

import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTests {
    private Person artur;
    private Person ford;
    private Places space;
    private Motor motor;
    private Rocket rocket;
    private Air air;


    @BeforeEach
    void setUp(){
        artur = new Person("Артур", 20);
        ford = new Person("Форд", 60);
        space = new Places("открытый космос");
        motor = new Motor();
        rocket = new Rocket(motor);
        air = new Air();

    }

    @Test
    public void flyReturnsExceptionWhenStateFalse(){
        assertThrows(PersonFlyException.class, ()->{
            artur.fly(space, rocket);});

    }

    @Test
    public void flyReturnsExceptionWhenAgeMoreThan55() throws Exception{
        rocket.fly(air);
        assertThrows(PersonFlyException.class, ()->{
            ford.fly(space, rocket);});

    }

    @Test
    public void flyReturnsCorrectValues() throws Exception{
        rocket.fly(air);
        assertEquals("Артур вылетел на ракета в открытый космос", artur.fly(space, rocket));

    }
}
