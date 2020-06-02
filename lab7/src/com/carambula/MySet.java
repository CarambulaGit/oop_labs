package com.carambula;

import java.util.*;

public class MySet implements Set<Coffee> {
    private static final int INITIAL_SIZE = 15;
    private Coffee[] coffees = new Coffee[INITIAL_SIZE];
    private int size = 0;

    public MySet() {
    }

    public MySet(Coffee coffee) {
        add(coffee);
    }

    public MySet(Collection<Coffee> coffees) {
        addAll(coffees);
    }

    public Coffee[] getAllElements() {
        return Arrays.copyOfRange(coffees,0, size);
    }

    public boolean increaseCapacity(float factor) {
        if (factor > 1) {
            Coffee[] temp = Arrays.copyOf(coffees, coffees.length);
            coffees = new Coffee[(int) (INITIAL_SIZE * factor)];
            addAll(Arrays.asList(temp));
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object obj) {
        if (obj instanceof Coffee) {
            for (int i = 0; i < size; i++) {
                if (coffees[i].equals(obj)) return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new Iterator<Coffee>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Coffee next() {
                return coffees[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return coffees;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return a;
    }

    @Override
    public boolean add(Coffee coffee) {
        if (!this.contains(coffee) && size < coffees.length) {
            coffees[size++] = coffee;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        if (obj instanceof Coffee) {
            for (int i = 0; i < size; i++) {
                if (coffees[i].equals(obj)) {
                    coffees[i] = coffees[size - 1];
                    coffees[--size] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object obj : c) {
            if (!contains(obj)) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Coffee> c) {
        int sizeBeforeOperation = size;
        c.forEach(this::add);
        return sizeBeforeOperation != size;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        int sizeBeforeOperation = size;
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (Object obj : c) {
                if (coffees[i].equals(obj)) {
                    coffees[counter++] = coffees[i];
                }
            }
        }
        for (int i = counter; i < size; i++) {
            coffees[i] = null;
        }
        size = counter;
        return sizeBeforeOperation != size;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        int sizeBeforeOperation = size;
        c.forEach(this::remove);
        return sizeBeforeOperation != size;
    }

    @Override
    public void clear() {
        removeAll(Arrays.asList(coffees));
    }
}
