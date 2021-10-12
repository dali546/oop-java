package com.dali546.tuition.abstraction;

public class Bird extends Animal {

    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void talk() {
        System.out.println("Squawk!");
    }
}
