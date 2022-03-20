package model;

public class Person implements PersonAction{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printName(){
        System.out.println(name);
    }

    @Override
    public String fly(Places place, Rocket rocket) throws PersonFlyException{
        if(rocket.getState() && age < 55){
            return name + " вылетел на " + rocket.getName() + " в " + place.getName();
            //System.out.println("вылетели в " + place.getName() + " как " +  thing.getName());
        }
        else {
            throw new PersonFlyException("полет не состоялся");
        }
    }

}
