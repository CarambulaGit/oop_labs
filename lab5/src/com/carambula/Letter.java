package com.carambula;

public class Letter {
    private char letter;

    public Letter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return String.valueOf(letter);
    }

    /**
     * @param obj
     * @return is equal(ignore case)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Letter) {
            return String.valueOf(letter).equalsIgnoreCase(String.valueOf(obj));
        }
        return false;
    }

//    public boolean equals(Object obj) {
//        if (obj instanceof Letter) {
//            return ((Letter) obj).letter == letter;
//        }
//        return false;
//    }
}
