package com.carambula;

public class WrongValueException extends RuntimeException {
    public WrongValueException() {
        System.out.println("Oops, something going wrong");
    }
}
