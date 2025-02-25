package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        /*
        Zoo z = new Zoo("Bouhech Zoo", "Bomhal");
        Zoo z1 = new Zoo("Zoo Mnihla", "Mnihla");
        Aquatic aqua1 = new Aquatic("Siii", "R9", 20, true,"sokra");
        Dolphin d = new Dolphin("Siii", "R9", 20, true,"sokra",150);
        Penguin p = new Penguin("Siii", "R9", 20, true,"sokra",50);
        Terrestrial ters = new Terrestrial("A", "R", 20, true,4);
        Animal a = new Animal("Siii", "R9", 20, true);
        Animal a1 = new Animal("A", "R", 20, true);
        Animal a2 = new Animal("P", "9", 20, true);

        z.addAnimal(a);
        z1.addAnimal(a1);
        z1.addAnimal(a2);

        z.displayZoo();

        if (z.isZooFull()) {
            System.out.println("Zoo Full");
        } else {
            System.out.println("Zoo Not Full");
        }

        Zoo sup = Zoo.comparerZoo(z, z1);
        System.out.println("**************************");
        System.out.println("Zoo with more animals: " + sup);
        System.out.println("************************** Aquatic ");
        System.out.println(aqua1);
        System.out.println(d);
        System.out.println(p);
        System.out.println(ters);
        System.out.println("************************** Swim part ");
        aqua1.swim();
        d.swim();
        p.swim();

         */
        Zoo zoo = new Zoo("Bouhech Zoo", "Bomhal");

        // Instruction 26 : Ajout d'animaux aquatiques
        Dolphin d1 = new Dolphin("a", "aa", 11, true,"manouba",150);
        Penguin p1 = new Penguin("b", "bb", 22, false,"lac",50);
        Dolphin d2 = new Dolphin("a", "aa", 11, true,"manouba",150);
        Penguin p2 = new Penguin("b", "bb", 22, false,"lac",50);

        zoo.addAquaticAnimal(d1);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(d2);
        zoo.addAquaticAnimal(p2);

        // Instruction 27 : Affichage des swim()
        System.out.println("All aquatic animals swimming:");
        zoo.displayAllSwimming();
        // Remarque : Chaque animal a sa propre façon de nager spécifique à sa classe

        // Instruction 29 : Test de la profondeur max des pingouins
        System.out.println("\nMax Penguin Swimming Depth: " +
                zoo.maxPenguinSwimmingDepth() + " meters");

        // Instruction 30 : Test du nombre par type
        System.out.println("\nAquatic animals by type:");
        zoo.displayNumberOfAquaticsByType();

        // Instruction 31 : Test de equals()
        Aquatic dolphin1 = new Dolphin("a", "aa", 11, true,"manouba",150);
        Aquatic dolphin2 = new Dolphin("a", "aa", 11, true,"manouba",150);
        System.out.println("\nAre dolphins equal? " + dolphin1.equals(dolphin2)); // true
    }


}
