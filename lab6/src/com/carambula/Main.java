package com.carambula;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<InstantCoffee> instantCoffees = new ArrayList<>();
        ArrayList<MilledCoffee> milledCoffees = new ArrayList<>();
        ArrayList<CoffeeInBags> coffeeInBags = new ArrayList<>();

        instantCoffees.add(new InstantCoffee("Sumatra", 150, 80, 30, "Folgers"));
        instantCoffees.add(new InstantCoffee("Kenya Selected", 350, 50, 40, "Maxwell House"));
        instantCoffees.add(new InstantCoffee("Blawan Paumah", 300, 60, 40, "Ellis"));
        milledCoffees.add(new MilledCoffee("Arabica", 400, 30, 50, "Jacobs"));
        milledCoffees.add(new MilledCoffee("Robusta", 300, 50, 40, "Boxcar"));
        milledCoffees.add(new MilledCoffee("Liberian", 350, 30, 45, "Blue Star"));
        coffeeInBags.add(new CoffeeInBags("Typica", 200, 50, 30, "Intelligentsia"));
        coffeeInBags.add(new CoffeeInBags("Arusha", 500, 50, 50, "Starbucks"));
        coffeeInBags.add(new CoffeeInBags("Mokka", 400, 40, 40, "Lipton"));

        InstantCoffee[] arrInstantCoffees = new InstantCoffee[instantCoffees.size()];
        MilledCoffee[] arrMilledCoffees = new MilledCoffee[milledCoffees.size()];
        CoffeeInBags[] arrCoffeeInBags = new CoffeeInBags[coffeeInBags.size()];
        arrInstantCoffees = instantCoffees.toArray(arrInstantCoffees);
        arrMilledCoffees = milledCoffees.toArray(arrMilledCoffees);
        arrCoffeeInBags = coffeeInBags.toArray(arrCoffeeInBags);

        Van van = new Van(500000);
        van.loadVan(arrInstantCoffees, arrMilledCoffees, arrCoffeeInBags, 1000);
        van.printLoad();
        van.getLoad().sort(new ComparatorByQuality());
        System.out.println("\n\n\n");
//                                     ***FOR TEST***
//        van.getLoad().forEach(elem -> System.out.println(elem.getQuality()));
        van.printLoad();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Left border: ");
            double leftBorderOfQuality = scanner.nextDouble();
            System.out.println("Right border: ");
            double rightBorderOfQuality = scanner.nextDouble();
            van.findItemsInGivenRange(leftBorderOfQuality, rightBorderOfQuality).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Wrong input, input must be number, fractional part must be entered after ','");
        }
    }
}
