package com.sandbox.linkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element) {

        Node newNode = new Node(element, head);  // 1,2

        if (head == null) {
            head = newNode; // 3
            tail = head;
        } else {
            head = newNode; // 3
        }

    }

    @Override
    public void addLast(E element) {

    }

    @Override
    public E pollFirst() {

        E element;
        if (head == null) {
            element = null;
        } else {

            element = head.element; // 1

            if (head == tail) { // one element in the list
                head = null; // 2
                tail = null;
            } else {
                Node next = head.next; // 3
                head.next = null;  // optional
                head = next; // 4
            }
        }
        return element;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return head.element;
    }

    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");
        Node current = head;
        if (current != null) {
            while (current != null) {
                joiner.add(current.element.toString());
                current = current.next;  // walking the list
            }
        }
        builder.append(joiner);
        builder.append("]");

        return builder.toString();
    }

    private class Node {

        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }

    }
}
