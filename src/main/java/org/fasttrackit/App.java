package org.fasttrackit;


import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.setName("Bruno");
        animal.setHappiness(1);
        animal.setAge(3.5);
        animal.setFavoriteActivityName("Running");
        animal.setFavoriteFoodName("Purrina");
        animal.setHealtLevel(1);
        animal.setHungerLevel(9);
        animal.setThirstLevel(8);



        Adopter adopter = new Adopter (animal);
        adopter.setName("Becali");
        adopter.setMoneyAmount(100000000);

        System.out.println(adopter.getName());
        System.out.println(adopter.getMoneyAmount());

        AnimalFood food = new AnimalFood("RoyalCanin");
        food.setName("Pedigree");
        food.setQuantity(12);
        food.setPrice(24);
        food.setExpirationDate(LocalDate.of(2020, 02, 27));
        food.setAvailabilityInStock(true);


        FunTime funTime = new FunTime("running");
        funTime.setName("tug of war");


        Veterinarian veterinarian = new Veterinarian("Experience");
        veterinarian.setName("Albus");
        veterinarian.setSpecialization("veterinary surgeon");


        Dog dog = new Dog(adopter);
        dog.setName("Jerry");
        dog.setAge(3);
        dog.setHappiness(10);
        dog.setLoyalty(10);



        Cat cat = new Cat(adopter);
        cat.setName("Lisa");
        cat.setAge(2);
        cat.setFavoriteFoodName("Whiskas");
        cat.setSize(2);



    }
}
