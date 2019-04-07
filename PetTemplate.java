package com.pets;

public class PetTemplate {


    //Pet
    String name;
    String breed;
    String color;
    char sex;
    int age;
    int price;


    public void Bio() {
        System.out.printf("Hi my name is %s and I am %d years old. I'm only $%d won't you please take me home with you.\n", name, age, price);

    }

}
