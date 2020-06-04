package com.carambula;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {
    @Test
    public void testMySet() {
        MySet mySet = new MySet();
        assertEquals(0, mySet.size());
    }

    @Test
    public void testAdd() {
        MySet mySet = new MySet();
        mySet.add(new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer"));
        assertEquals(1, mySet.size());
    }

    @Test
    public void testAddAll() {
        MySet mySet = new MySet();
        ArrayList<Coffee> coffees = new ArrayList<>(15);
        coffees.add(new CoffeeInBags("sort1", 20, 20, 20, "nameOfManufacturer"));
        coffees.add(new CoffeeInBags("sort2", 20, 20, 20, "nameOfManufacturer"));
        mySet.addAll(coffees);
        assertEquals(2, mySet.size());
    }

    @Test
    public void testContains() {
        MySet mySet = new MySet();
        assertFalse(mySet.contains(new Object()));
        mySet.add(new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer"));
        assertTrue(mySet.contains(new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer")));
    }

    @Test
    public void testContainsAll() {
        MySet mySet = new MySet();
        ArrayList<Coffee> coffees = new ArrayList<>(15);
        assertTrue(mySet.containsAll(coffees));
        mySet.add(new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer"));
        coffees.add(new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer"));
        assertTrue(mySet.containsAll(coffees));
    }

    @Test
    public void testIterator() {
        MySet mySet = new MySet();
        Iterator<Coffee> iterator = mySet.iterator();
        assertFalse(iterator.hasNext());
        mySet.add(new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer"));
        assertTrue(iterator.hasNext());
        assertEquals(new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer"), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testToArray() {
        MySet mySet = new MySet();
        assertArrayEquals(new Coffee[15], mySet.toArray());
        mySet.add(new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer"));
        Coffee[] coffees = new Coffee[15];
        coffees[0] = new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer");
        assertArrayEquals(coffees, mySet.toArray());
    }

    @Test
    public void testRemove() {
        MySet mySet = new MySet();
        mySet.add(new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer"));
        mySet.remove(new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer"));
        assertEquals(0, mySet.size());
    }

    @Test
    public void testRemoveAll() {
        MySet mySet = new MySet();
        mySet.add(new CoffeeInBags("sort1", 20, 20, 20, "nameOfManufacturer"));
        mySet.add(new CoffeeInBags("sort2", 20, 20, 20, "nameOfManufacturer"));
        mySet.add(new CoffeeInBags("sort3", 20, 20, 20, "nameOfManufacturer"));
        ArrayList<Coffee> coffees = new ArrayList<>(15);
        coffees.add(new CoffeeInBags("sort1", 20, 20, 20, "nameOfManufacturer"));
        coffees.add(new CoffeeInBags("sort2", 20, 20, 20, "nameOfManufacturer"));
        mySet.removeAll(coffees);
        assertEquals(1, mySet.size());
    }

    @Test
    public void testRetainAll() {
        MySet mySet = new MySet();
        mySet.add(new CoffeeInBags("sort1", 20, 20, 20, "nameOfManufacturer"));
        mySet.add(new CoffeeInBags("sort2", 20, 20, 20, "nameOfManufacturer"));
        ArrayList<Coffee> coffees = new ArrayList<>(15);
        coffees.add(new CoffeeInBags("sort1", 20, 20, 20, "nameOfManufacturer"));
        mySet.retainAll(coffees);
        assertEquals(1, mySet.size());
    }

    @Test
    public void testClear() {
        MySet mySet = new MySet();
        mySet.add(new CoffeeInBags("sort1", 20, 20, 20, "nameOfManufacturer"));
        mySet.add(new CoffeeInBags("sort2", 20, 20, 20, "nameOfManufacturer"));
        mySet.clear();
        assertEquals(0, mySet.size());
    }
}
