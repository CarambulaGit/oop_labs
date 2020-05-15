package com.carambula;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
//        C11 = 3 - create class airplane with 5+ fields
//        Create array of objects
//        Sort array of objects
        Airplane[] planes = new Airplane[4];
        planes[0] = new Airplane("Airbus A400M", 780, 6390, 37000, 270);
        planes[1] = new Airplane("Boeing 747 LCF", 878, 7800, 83325, 1840);
        planes[2] = new Airplane("Bombardier Dash 8-100", 491, 2039, 4700, 39);
        planes[3] = new Airplane("Bombardier Dash 8-100", 491, 2039, 4699, 39);
//        planes[3] = new Airplane("Antonov An-225", 800, 15400, 250000, 1300);
//        Arrays.sort(planes, Comparator.comparing(Airplane::getModel));
        Arrays.sort(planes, Comparator.comparing(Airplane::getModel).reversed().thenComparing(Airplane::getPayload));
        for (Airplane plane : planes) {
            System.out.println(plane);
        }
    }
}
