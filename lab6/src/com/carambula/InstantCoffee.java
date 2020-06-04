package com.carambula;

public class InstantCoffee extends Coffee {
    private double weightOfPackage;
    private double weight;

    public InstantCoffee(String sort, double weightOfCoffee, double cost, double weightOfPackage, String nameOfManufacturer) throws WrongValueException{
        super(sort, weightOfCoffee, cost, nameOfManufacturer);
        if (weightOfPackage <= 0) throw new WrongValueException();
        this.weightOfPackage = weightOfPackage;
        this.weight = weightOfPackage + weightOfCoffee;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstantCoffee) {
            return super.equals(obj) && weightOfPackage == ((InstantCoffee) obj).weightOfPackage;
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
