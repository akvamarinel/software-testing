package model;



public class Main {
    public static void main (String [] args ) {
       Motor motor = new Motor();
       Rocket rocket = new Rocket(motor);
       Person artur = new Person("Артур");
       Person ford = new Person("Форд");
       Stars stars = new Stars();
       Places space = new Places("открытый космос");
       Places empty = new Places("черная пустота");
       Air air = new Air();

       rocket.fly(air);
       artur.fly(space, rocket);
       ford.fly(space, rocket);
       stars.shine();
    }
}
