package com.kir138.task5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Department d1 = new Department("Деп1", 10);
        Department d2 = new Department("Деп2", 13);
        Employee e1 = new Employee("Имя1", "Фамилия1", d1);
        Employee e2 = new Employee("Имя2", "Фамилия2", d2);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.bin"))) {
            oos.writeObject(e1);
            oos.writeObject(e2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
