package Homework02.Level05.Task12;

public class Main {
    public static void main(String[] args) {
        Cat kittyCat = new Cat("Kitty", 12, "Серый");
        Cat poppyCat = new Cat("Poppy", 13, "Черный");

        Dog jorgeDog = new Dog("Jorge", 23, "Белый");
        Dog bobDog = new Dog("Bob", 24, "Оранжевый");

        System.out.println(kittyCat + "\n");
        System.out.println(poppyCat + "\n");
        System.out.println(jorgeDog + "\n");
        System.out.println(bobDog);
    }
}
