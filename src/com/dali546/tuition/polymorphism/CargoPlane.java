package com.dali546.tuition.polymorphism;

public class CargoPlane extends Plane implements ITransporter {
    @Override
    public void transportCargo() {
        System.out.println("I'm super expensive at transporting cargo. ");
    }

    @Override
    public void fly() {
        System.out.println("When I fly I do something special too...");
        super.fly();
    }
}
