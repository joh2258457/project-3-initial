package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T>{
    private final List<T> container;

    public Bag() {
        this.container = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.container.isEmpty();
    }

    @Override
    public int size() {
        return this.container.size();
    }

    @Override
    public void add(T item) {
        this.container.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return this.container.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        this.container.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return this.container.spliterator();
    }
}
