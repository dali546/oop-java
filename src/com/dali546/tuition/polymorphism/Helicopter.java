package com.dali546.tuition.polymorphism;

public class Helicopter extends Vehicle implements IAirVehicle {
    @Override
    public void fly() {
        System.out.println("I fly by spinning these blades...");
    }
}
