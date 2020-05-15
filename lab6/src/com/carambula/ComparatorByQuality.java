package com.carambula;

import java.util.Comparator;

public class ComparatorByQuality implements Comparator<Object> {

    @Override
    public int compare(Object obj1, Object obj2) {
        if (obj1 instanceof Coffee && obj2 instanceof Coffee) {
            return Double.compare(((Coffee) obj1).getQuality(), ((Coffee) obj2).getQuality());
        }
        return -2;
    }
}
