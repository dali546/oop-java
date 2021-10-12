package com.dali546.tuition.abstraction;

public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal();


        Animal bird = new Bird();
        // bird.fly();
        ((Bird) bird).fly();

        /**
         * [(Animal) 001 - bird]  -------------->>> [010 - Bird#23tbdh2]
         * .talk()                                                  .talk()
         */
        bird.talk();

        Bird bird1 = new Bird();
        bird1.fly();

        Lion lion = new Lion();
        lion.talk();
        /**
         * [(Lion) 002 - lion]  -------------->>> [0115 - Lion#2352365]
         * .walk()                                                  .walk()
         */
        lion.walk();

        makeAnimalTalk(bird);
        makeAnimalTalk(lion);
//        makeBirdWalk(bird);
//        makeBirdWalk(bird1);
//        makeLionWalk(lion);
    }

    private static void makeAnimalTalk(Animal animal) {
        animal.walk();
        animal.talk();
    }
//
//    private static void makeBirdWalk(Bird bird) {
//        bird.walk();
//    }
//
//    private static void makeLionWalk(Lion lion) {
//        lion.walk();
//    }
}
