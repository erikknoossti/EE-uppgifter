package org.example.eeuppgifter.uppgift1;

import java.util.List;

public class main {
    public static void main(String[] args) {
        IAnimal dog = new Dog();
        IAnimal snake = new Snake();

        AnimalUtil.printAnimalType(dog);
        AnimalUtil.printAnimalType(snake);
            }
        }