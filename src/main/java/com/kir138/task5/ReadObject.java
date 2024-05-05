package com.kir138.task5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.bin"))) {
            Employee e1 = (Employee) ois.readObject();
            Employee e2 = (Employee) ois.readObject();;
            System.out.println(e1);
            System.out.println(e2);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
