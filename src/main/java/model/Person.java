package model;

public class Person implements PersonAction{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    @Override
    public void fly(Places place, Rocket rocket) {
        System.out.println(name + " вылетел на " + rocket.getName() + " в " + place.getName());
        //System.out.println("вылетели в " + place.getName() + " как " +  thing.getName());
    }
}
