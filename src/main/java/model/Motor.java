package model;

public class Motor extends PartOfRocket {
    private int count = 0;
    private boolean state = true;
    public Motor(){
        super("мотор");
    }
    public boolean getState(){
        return state;
    }
    public void start() throws MotorException {
        count++;
        if(count < 5){
            System.out.println("зажжужал мотор");
        }
        else {
            state = false;
            throw new MotorException("мотор неисправен");
            //System.out.println("мотор неисправен");
        }
    }
}
