package org.fasttrackit;

import com.sun.org.apache.xerces.internal.dom.RangeImpl;

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
        animal.name = "Bruno";
        animal.happiness = 1;
        animal.age = 3.5;
        animal.favoriteActivityName = "Running";
        animal.favoriteFoodName = "Purrina";
        animal.healtLevel = 1;
        animal.hungerLevel = 9;
        animal.thirstLevel = 8;

        Adopter adopter = new Adopter (animal);
        adopter.name = "Becali";
        adopter.moneyAmount = 1000000;


        AnimalFood food = new AnimalFood("RoyalCanin");
        food.name = "Pedigree";
        food.quantity = 12;
        food.price = 24;
        food.expirationDate = LocalDate.of(2020, 02, 27);
        food.availabilityInStock = true;


        FunTime funTime = new FunTime("running");
        funTime.name = "tug of war";


        Veterinarian veterinarian = new Veterinarian("Experience");
        veterinarian.name = "Albus";
        veterinarian.specialization = "veterinary surgeon";


        Dog dog = new Dog(adopter);
        dog.name = "Jerry";
        dog.age = 3;
        dog.happiness = 10;
        dog.loyalty = 10;



        Cat cat = new Cat(adopter);
        cat.name = "Lisa";
        cat.age = 2;
        cat.favoriteFoodName = "Whiskas";
        cat.size = 2;


    }
}
