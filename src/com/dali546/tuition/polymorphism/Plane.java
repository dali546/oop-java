package com.dali546.tuition.polymorphism;

public class Plane extends Vehicle implements IAirVehicle {
    @Override
    public void fly() {
        System.out.println("I am a generic plane flying. neeeoowwwwwwww");
    }
}
