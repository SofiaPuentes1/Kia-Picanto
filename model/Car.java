package model;

public abstract class Car {
    protected String description = "Unknown Car";

    public String getDescription() {
        return description;
    }

    public abstract long cost();
}