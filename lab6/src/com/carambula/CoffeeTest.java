package com.carambula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoffeeTest {
    @Test
    public void testEquals() {
        Coffee coffee = new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer");
        assertTrue(coffee.equals(new CoffeeInBags("sort", 20, 20, 20, "nameOfManufacturer")));
        assertFalse(coffee.equals(new Object()));
    }

    @Test
    public void testWrongValueException() throws WrongValueException {
        try {
            InstantCoffee instantCoffee = new InstantCoffee("", -1, -2, -3, null);

        } catch (Exception e) {
            assertEquals(e.getClass(), WrongValueException.class);
        }
    }
}
