package com.barzykin.model;

public interface Printable {
    default void print() {
        System.out.println(this);
    }
}
