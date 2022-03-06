package model;

public class Motor extends PartOfRocket {
    public Motor(){
        super("мотор");
    }
    public void start(){
        System.out.println("зажжужал мотор");
    }
}
