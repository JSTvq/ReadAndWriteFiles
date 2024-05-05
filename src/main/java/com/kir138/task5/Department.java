package com.kir138.task5;

import java.io.Serializable;

public class Department implements Serializable {
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
    private int amountOfWorkers;

    public Department() {
    }

    public Department(String name, int amountOfWorkers) {
        this.name = name;
        this.amountOfWorkers = amountOfWorkers;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", amountOfWorkers=" + amountOfWorkers +
                '}';
    }
}
