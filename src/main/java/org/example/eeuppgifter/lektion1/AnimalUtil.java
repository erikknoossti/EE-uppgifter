package org.example.eeuppgifter.lektion1;

public class AnimalUtil {

    public static void printAnimalType(IAnimal animal) {

        if (animal instanceof IMammal) {
            System.out.println("Detta djur är ett däggdjur.");
        }

        if (animal instanceof IReptile) {
            System.out.println("Detta djur är en reptil.");
        }
    }
}
