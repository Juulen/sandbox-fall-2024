package com.sandbox.trees;

import java.util.Iterator;

public interface tree<T> extends Iterable<T> {

    boolean create();
    T insert(T element);
    T search(T targetElement) throws ElementNotFoundException;
    boolean delete(T element);
    boolean contains(T targetElement);
    boolean isEmpty();
    int size();

    Iterator<T> iterator();
    Iterator<T> iteratorPreOrder();
    Iterator<T> iteratorInOrder();
    Iterator<T> iteratorPostOrder();
    Iterator<T> iteratorLevelOrder();

}