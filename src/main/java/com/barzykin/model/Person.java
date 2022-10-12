package com.barzykin.model;

import lombok.Data;

@Data
public abstract class Person implements Printable {
    protected int id;
    protected String name;

    protected Person(int id, String  name) {
        this.id = id;
        this.name = name;
    }

    protected Person() {
    }
}
