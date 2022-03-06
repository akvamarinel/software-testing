package model;

public class Rocket implements RocketAction {
    private String name = "ракета";
    private Motor motor;

    public Rocket(Motor motor){
        this.motor = motor;
    }

    public String getName() {
        return name;
    }

    public void fly(Air air){
        motor.start();
        System.out.print("ракета завелась ");
        air.roar();
    }
}
