package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow1 = new Cow(150, 4, "Female", "Mu-mu");
        Cow cow2 = new Cow(100, 3, "Male", "Meiki");
        Cow cow3 = new Cow(120, 3, "Male", "kiku");
        Cow cow4 = new Cow(160, 5, "Female", "Nora");
        Cow cow5 = new Cow(149, 2, "Male", "Coruk");
        Cow cow6 = new Cow(125, 1, "Female", "Lora");

        Sheep sheep1 = new Sheep(50.4, 2, "Female", "Nini");
        Sheep sheep2 = new Sheep(52.4, 1, "Male", "Ni");
        Sheep sheep3 = new Sheep(53.4, 4, "Female", "Nin");
        Sheep sheep4 = new Sheep(51.4, 5, "Male", "Nj");

        Horse horse1 = new Horse(180.27, 2, "Male", "Ak-boz", "White");
        Horse horse2 = new Horse(140.27, 1, "Female", "Akmo", "Black");
        Horse horse3 = new Horse(160.27, 5, "Male", "Akula", "Brown");

        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};
        Sheep[] sheep = {sheep1, sheep2, sheep3};
        Horse[] horses = {horse1, horse2};


        Farm farm1 = new Farm("Rancho", "Deckson 12/3", cows, horses, sheep);
        System.out.println(farm1);
        Farm2 farm2 = new Farm2("Myrich",24,cow6,sheep4,horse3);
        System.out.println(farm2);
    }
}
