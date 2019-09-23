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

        Adopter adopter = new Adopter();
        adopter.name = "Becali";
        adopter.moneyAmount = 1000000;


        AnimalFood food = new AnimalFood();
        food.name = "Pedigree";
        food.quantity = 12;
        food.price = 24;
        food.expirationDate = LocalDate.of(2020, 02, 27);
        food.availabilityInStock = true;


        FunTime funTime = new FunTime();
        funTime.name = "tug of war";


        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Albus";
        veterinarian.specialization = "veterinary surgeon";




    }
}
