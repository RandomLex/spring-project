package com.barzykin.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Teacher extends Person {
    private int salary;

    public Teacher(int id, String name) {
        super(id, name);
    }

    public Teacher(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }
}
