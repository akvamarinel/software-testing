package model;

public abstract class PartOfRocket {
    private String type;
    public PartOfRocket(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
