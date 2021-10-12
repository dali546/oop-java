package com.dali546.tuition.polymorphism;

public class Main {
    public static void main(String[] args) {
//        CargoPlane vehicle = new CargoPlane();
//         vehicle.transportCargo();
//        ((CargoPlane) vehicle).transportCargo();
//        vehicle.fly();
//         ((Plane) vehicle).transportCargo();
//         ((Plane) vehicle).fly();


         // Because `vehicle` is a Vehicle, I can reassign it to any Vehicle or it's children.
//        vehicle = new Boat();
//        ((CargoPlane) vehicle).transportCargo();

//        Skateboard skateboard = new Skateboard();
//        skateboard.move();

//        Van van = new Van();
//        transportGoods(van);
//        Truck truck = new Truck();
//        transportGoods(truck);

        Helicopter helicopter = new Helicopter();
        flyPlane(helicopter);
        Vehicle cargoPlane = new CargoPlane();
        flyPlane((Plane) cargoPlane);
        flyPlane((CargoPlane) cargoPlane);

    }

    public static void transportGoods(ITransporter transporter) {
        transporter.transportCargo();
    }


    public static void flyPlane(IAirVehicle vehicle) {
        vehicle.fly();
    }
}
