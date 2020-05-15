package com.carambula;

import java.util.ArrayList;

public class Van {
    private double carryingCapacity;
    private ArrayList<Coffee> load = new ArrayList<>();
    private double priceOfFreight;
    private double weightOfCoffees;

    public ArrayList<Coffee> getLoad() {
        return load;
    }

    public void printLoad() {
        for (Coffee coffee : load) {
            System.out.println(coffee);
        }
    }

    public double getPriceOfFreight() {
        return priceOfFreight;
    }

    public double getWeightOfCoffees() {
        return weightOfCoffees;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public Van(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
        this.priceOfFreight = 0;
        this.weightOfCoffees = 0;
    }

    private void loader(Coffee[] coffees, double budget) {
        for (Coffee coffee : coffees) {
            if (weightOfCoffees + coffee.getWeightOfCoffee() <= carryingCapacity && priceOfFreight + coffee.getPrice() <= budget) {
                weightOfCoffees += coffee.getWeightOfCoffee();
                priceOfFreight += coffee.getPrice();
                load.add(coffee);
            } else {
                return;
            }
        }
    }

    public void loadVan(InstantCoffee[] instantCoffees, MilledCoffee[] milledCoffees, CoffeeInBags[] coffeeInBags, double budget) {
        double minPrice = instantCoffees[0].getPrice();
        checker(instantCoffees, minPrice);
        checker(milledCoffees, minPrice);
        checker(coffeeInBags, minPrice);
        load.clear();
        if (budget < minPrice) return;
        while (weightOfCoffees < carryingCapacity && priceOfFreight + minPrice < budget) {
            loader(instantCoffees, budget);
            loader(milledCoffees, budget);
            loader(coffeeInBags, budget);
        }
    }

    public ArrayList<Coffee> findItemsInGivenRange(double leftBorder, double rightBorder) {
        ArrayList<Coffee> itemsInRange = new ArrayList<>();
        for (Coffee coffee: load) {
            if (coffee.getQuality() >= leftBorder && coffee.getQuality() <= rightBorder) itemsInRange.add(coffee);
        }
        return itemsInRange;
    }

    private void checker(Coffee[] coffees, double minPrice) {
        for (Coffee coffee : coffees) {
            if (coffee.getPrice() < minPrice) minPrice = coffee.getPrice();
        }
    }
}