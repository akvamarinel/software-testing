package model;

public class Stars {
    private String name = "звезды";
    private String shine;
    private String power [] = {"блестели", "сияли", "горели"};

    public void setShine(int i){
        if(i > 2){
            throw new ArrayIndexOutOfBoundsException("please,put correct value");
        }
        shine = power[i];
    }
    public String getShine(){
        return shine;
    }

    public String getName(){
        return name;
    }
    public String shine(){
        return name + " " + shine;
    }
}
