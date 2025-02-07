package ldt.example;

/**
 * <h5> {@literal SEALED CLASSES IN JAVA 17} </h5>
 * <p> - Sealed classes using for permits 1-n subclasses. </p>
 * <p> - Subclasses must be final, sealed or non-sealed. </p>
 * <p> - Sealed classes useful for control extend, permission classes for maintain. </p>
 * @author Thinh
 */
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal mouse = new Mouse();
        Animal mouseRobot = new MouseRobot();

        printAnimalInfo(dog, cat, mouse, mouseRobot);
    }

    private static void printAnimalInfo(Animal... animal) {
        for (Animal a : animal) {
            a.name();
        }
    }
}