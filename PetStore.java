package com.pets;

public class PetStore {

    public static void main(String args[]) {

        //Dog
        PetTemplate dog = new PetTemplate();
        dog.name = "Rocky";
        dog.breed = "Bulldog";
        dog.color = "brown";
        dog.sex = 'M';
        dog.age = 2;
        dog.price = 1200;
        dog.Bio();


        //Cat
        PetTemplate cat = new PetTemplate();
        cat.name = "Spot";
        cat.breed = "Siamese";
        cat.color = "black and white ";
        cat.sex = 'M';
        cat.age = 4;
        cat.price = 500;
        cat.Bio();

        //Ferret
        PetTemplate ferret = new PetTemplate();
        ferret.name = "Tina";
        ferret.breed = "Unknown";
        ferret.color = "black";
        ferret.sex = 'F';
        ferret.age = 3;
        ferret.price = 350;
        ferret.Bio();

        //Lizard
        PetTemplate lizard = new PetTemplate();
        lizard.name = "Gary";
        lizard.breed = "Bearded Dragon";
        lizard.color = "green";
        lizard.sex = 'M';
        lizard.age = 1;
        lizard.price = 400;
        lizard.Bio();


    }


}
