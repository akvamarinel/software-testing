package model;

public class Air {
    private String name = "воздух";


    public String getName(){
        return name;
    }
    public void roar(){
        System.out.println(name + " заревел");
    }
}
