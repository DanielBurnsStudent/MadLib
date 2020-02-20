package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Phase 1 - Declaring Variables (20 minimum)
        String name;
        String country1;
        String country2;
        String profession;
        String timeOfYear;
        String weather;
        String game;
        String famousPerson1;
        String famousPerson2;
        String durationOfTime;
        String favoriteToy;
        String object1;
        String object2;
        String verb2;
        String adjective1;
        String adjective2;
        String adjective3;
        String familyMember;
        String years;
        String videoGame;
        //Phase 2 - Getting User input
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Name a famous person.");
        famousPerson1 = keyboard.nextLine();

        System.out.println("What is your favorite country?");
        country1 = keyboard.nextLine();

        System.out.println("What is your favorite toy?");
        favoriteToy = keyboard.nextLine();

        System.out.println("What is your favorite profession?");
        profession = keyboard.nextLine();

        System.out.println("What is your favorite season?");
        timeOfYear = keyboard.nextLine();

        System.out.println("Name the title of a family member. (Brother, sister, Father, ect.)");
        familyMember = keyboard.nextLine();

        System.out.println("Name of your favorite videogame.");
        videoGame = keyboard.nextLine();

        System.out.println("Name a male character/person.");
        name = keyboard.nextLine();

        System.out.println("Name a duration of time (x days, x months, ect.)");
        durationOfTime = keyboard.nextLine();

        System.out.println("Name a country you've never been to.");
        country2 = keyboard.nextLine();

        System.out.println("What is the weather like? (Rainy, sunny, humid, ect).");
        weather = keyboard.nextLine();

        System.out.println("Pick any number.");
        years = keyboard.nextLine();

        System.out.println("Name a celebrity.");
        famousPerson2 = keyboard.nextLine();

        System.out.println("Name a game.");
        game = keyboard.nextLine();

        System.out.println("Enter the name of an object.");
        object1 = keyboard.nextLine();

        System.out.println("Enter a color.");
        adjective3 = keyboard.nextLine();

        System.out.println("Enter a verb ending in -ing.");
        verb2 = keyboard.nextLine();

        System.out.println("Enter the name of an object.");
        object2 = keyboard.nextLine();

        System.out.println("Enter a size (large, medium, small, ect).");
        adjective1 = keyboard.nextLine();

        System.out.println("Enter an adverb ending in -ly.");
        adjective2 = keyboard.nextLine();

        //Phase 3 - Print MadLib
        System.out.println("One " + weather + " day, " + famousPerson1 + " Showed up at the lodgings of " + name + "." );
        System.out.println("Out of fear, " + name + " quickly fled to " + country1 + " and stayed there for " + durationOfTime + ".");
        System.out.println(name + " became a very skilled " + profession + " while there and stayed with his " + familyMember + ".");
        System.out.println("One day, " + name + " found a " + adjective3 + " " + favoriteToy + " When " + famousPerson2 + " appeared.");
        System.out.println(famousPerson2 + " gave " + name + " a " + adjective1 + " " + object2 + " and told " + name + " to go deliver ");
        System.out.println("it to " + country2 + " next " + timeOfYear + ". " + adjective2 + ", " + name + " left for " + country2 + ". " + "While in ");
        System.out.println(country2 + ", " + name + " became very skilled at " + videoGame + " and " + game + ".");
        System.out.println(name + " stayed in " + country2 + " for " + years + " years. One day, while " + verb2 + ", " + name + " ");
        System.out.println("was lucky enough to obtain a golden " + object1 + ".");
    }
}
