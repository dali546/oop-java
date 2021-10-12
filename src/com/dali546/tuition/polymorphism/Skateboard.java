package com.dali546.tuition.polymorphism;

public class Skateboard extends Vehicle implements ILandVehicle {
    @Override
    public void move() {
        System.out.println("I am moving so slowly.");
    }
}
