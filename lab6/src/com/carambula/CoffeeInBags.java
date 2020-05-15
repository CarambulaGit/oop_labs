package com.carambula;

public class CoffeeInBags extends Coffee {
    private double weightOfPackage;
    private double weight;


    public CoffeeInBags(String sort, double weightOfCoffee, double cost, double weightOfPackage, String nameOfManufacturer) {
        super(sort, weightOfCoffee, cost, nameOfManufacturer);
        this.weightOfPackage = weightOfPackage;
        this.weight = weightOfPackage + weightOfCoffee;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CoffeeInBags) {
            return super.equals(obj) && this.weightOfPackage == ((CoffeeInBags) obj).weightOfPackage;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nWeight of package: " + weightOfPackage +
                "\nFull weight: " + weight + "\n";
    }
}
