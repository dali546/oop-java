package com.dali546.tuition.polymorphism;

public class Truck extends Vehicle implements ILandVehicle, ITransporter, IRoadVehicle {
    @Override
    public void transportCargo() {
        System.out.println("I'm a big boy. I can transport a lot!");
    }

    @Override
    public void move() {

    }
}
