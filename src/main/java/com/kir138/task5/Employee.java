package com.kir138.task5;

import java.io.Serializable;

public class Employee implements Serializable {
    /**
     * Задача 5
     * Создать класс Employee с полями
     * String name
     * String surname
     * Department department
     * Department  с полями:
     *  String name
     * int amountOfWorkers
     * Необходимо сериализовать класс Employee и десериализовать.
     */
    private String name;
    private String surname;
    private Department department;


    public Employee() {
    }

    public Employee(String name, String surname, Department department) {
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department=" + department +
                '}';
    }
}

