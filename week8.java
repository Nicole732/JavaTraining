/* *Lab* : Write a superclass Animal that has a method called animalSound() 
which print message "The animal makes a sound". Write a Subclasses of Animals Pigs, Cats, and their own implementation of 
 an animalSound() which print the "pig oinks" for Pigs and the "cat meows" for Cats. 
 Add additional animalSound(int num) method in Cats class that print the number of time the cat meows.

In a Test class, create an Animal Pig and Cat  objects and call the animalSound() method on them, 
also call the animalSound(2) on Cat object
*/

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pigs extends Animal {
    @Override
    public void animalSound() {
        super.animalSound();
        System.out.println("pig oinks");
    }
}

class Cats extends Animal {
    @Override
    public void animalSound() {
        System.out.println("cat meows");
    }

    public void animalSound(int num) {
        System.out.println("The cat meows " + num + " times.");
    }
}

public class week8 {
    public static void main(String[] args) {
        Pigs TonyPig = new Pigs();
        TonyPig.animalSound();

        Cats Cathy = new Cats();
        Cathy.animalSound();
        Cathy.animalSound(10);

    }
}