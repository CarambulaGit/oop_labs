package com.carambula;

public abstract class Coffee {
    private String sort;
    private double weightOfCoffee;

    public String getSort() {
        return sort;
    }

    public double getWeightOfCoffee() {
        return weightOfCoffee;
    }

    public double getPrice() {
        return price;
    }

    public double getQuality() {
        return quality;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    private double price;
    private double quality;
    private String nameOfManufacturer;

    public Coffee(String sort, double weightOfCoffee, double price, String nameOfManufacturer) {
        this.sort = sort;
        this.weightOfCoffee = weightOfCoffee;
        this.price = price;
        this.quality = price / weightOfCoffee;
        this.nameOfManufacturer = nameOfManufacturer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coffee) {
            return sort.equals(((Coffee) obj).sort) &&
                    weightOfCoffee == ((Coffee) obj).weightOfCoffee &&
                    price == ((Coffee) obj).price &&
                    quality == ((Coffee) obj).quality &&
                    nameOfManufacturer.equals(((Coffee) obj).nameOfManufacturer);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Sort: " + sort
                + "\nName of manufacturer: " + nameOfManufacturer
                + "\nWeight of coffee: " + weightOfCoffee
                + "\nCost: " + price
                + "\nQuality: " + quality;
    }
}
