package com.dali546.tuition;

public class Car {
    private String model;


    private int litres;

    public Car(String model, int litres) {
        System.out.println("I just created an object");
        System.out.println(this);
        this.setModel(model);
        this.litres = litres;
    }

    public Car(int litres) {
        this.litres = litres;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLitres() {
        return litres;
    }

    public void setLitres(int litres) {
        this.litres = litres;
    }
}
