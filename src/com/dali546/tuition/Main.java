package com.dali546.tuition;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Car myCar = new Car                ("Toyota", 4);

        System.out.println(myCar.getLitres());
        changeLitres(myCar);
        System.out.println(myCar.getLitres());
    }

    public static void changeLitres(Car car) {
        car.setLitres(-35677);
    }
}

