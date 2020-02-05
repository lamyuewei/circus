package Circus;

import Circus.animal.Animal;
import Circus.animal.Bird;
import Circus.animal.Duck;
import Circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        System.out.println(d.speak());
        Bird b = (Bird)d;  // upcasting
        Animal a = (Animal)b; // upcasting
        System.out.println(a.speak());
        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        train(new Parrot());
        // Circus.animal.Animal a2 = new Circus.animal.Animal();
        // Circus.animal.Bird b2 = new Circus.animal.Bird();
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
