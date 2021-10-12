package com.dali546.tuition.abstraction;

// Class is Abstract... I can't create an animal
public abstract class Animal {

    // All animals walk the same, so there is no need to make it abstract
    public void walk() {
        System.out.println("I am walking.");
    }

    // All Animals talk differently
    public abstract void talk();
}
