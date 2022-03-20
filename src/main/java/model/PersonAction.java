package model;

interface PersonAction {
    String fly(Places place, Rocket rocket) throws PersonFlyException;
}
