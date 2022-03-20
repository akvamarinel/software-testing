package model;

public class Rocket implements RocketAction {
    private final static String NAME = "ракета";
    private boolean state = false;
    private Motor motor;

    public Rocket(Motor motor){
        this.motor = motor;
    }

    public String getName() {
        return NAME;
    }

    public boolean getState(){
        return state;
    }

    public void fly(Air air) throws MotorException{
        motor.start();
        if(motor.getState()) {
            state = true;
            System.out.print("ракета завелась");
            air.roar();
        }
    }
}
