package com.dali546.tuition.polymorphism;

public class Van extends Vehicle implements ILandVehicle, ITransporter, IRoadVehicle {

    @Override
    public void transportCargo() {
        System.out.println("I can only transport a small amount of stuff");
    }

    @Override
    public void move() {

    }
}
