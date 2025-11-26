package org.example.eeuppgifter.lektion1;

public class main {
    public static void main(String[] args) {
        IAnimal dog = new Dog();
        IAnimal snake = new Snake();

        AnimalUtil.printAnimalType(dog);
        AnimalUtil.printAnimalType(snake);
            }
        }