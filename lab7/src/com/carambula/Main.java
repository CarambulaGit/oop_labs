package com.carambula;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	    C2 = 1 == Set
//      C3 = 0 == startLength = 15; newLength = startLength * 1.3
        MySet mySet = new MySet();
        mySet.add(new CoffeeInBags("sort", 20, 20 ,20, "nameOfManufacturer"));
        System.out.println(Arrays.toString(mySet.getAllElements()));
    }
}
