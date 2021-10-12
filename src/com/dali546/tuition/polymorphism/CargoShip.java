package com.dali546.tuition.polymorphism;

public class CargoShip extends Boat implements IWaterVehicle, ITransporter {
    @Override
    public void transportCargo() {
        System.out.println("I blocked the Suez Canal boiiiiii");
    }
}
