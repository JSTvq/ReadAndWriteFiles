package com.kir138;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * Задача 1
         * Напишите программу на Java для чтения содержимого файла в массив байтов.
         */
        /*try(FileInputStream fins = new FileInputStream("fileName1")) {
            byte[] file_content = new byte[2 * 1024];
            int read = 0;
            while ((read = fins.read(file_content)) > 0) {
                System.out.println(new String(file_content, 0, read - 1));
            }
        }*/

        /**
         * Задача 2
         * Напишите программу на Java для чтения содержимого текстового файла с помощью сканера
         * (в конструктор сканнера нужно передать FileReader)построчно и вывода каждой строки в консоль.
         */
        /*try (FileReader fileReader = new FileReader("fileName1")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }*/

        /**
         * Задача 3
         * Напишите программу, в которой данные считываются из текстового файла построчно и записываются в
         * другой файл также построчно.
         */
        /*try (BufferedReader bufferedReader = new BufferedReader(new FileReader("fileName1"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fileName2"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }*/

        /**
         * Задача 4
         * Напишите программу, которая посимвольно считывает данные из текстового файла с именем fileName1 и
         * записывает в файл fileName2.
         * fileName1 и fileName2 пользователь вводит в консоль, каждое имя на отдельной строке.
         */
        /*try (FileReader fileReader = new FileReader("fileName1");
        FileWriter fileWriter = new FileWriter("fileName2")) {
            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }
        }*/

        /**
         * Задача 5
         * Создать класс Employee с полями
         * String name
         * String surname
         * Department department
         * Department  с полями:
         * String name
         * int amountOfWorkers
         * Необходимо сериализовать класс Employee и десериализовать.
         */
        //Решение в пакете task5


        /**
         * Задача 6
         * Напишите программу на Java для добавления(не перезаписи) текста в существующий файл.
         */
        /*String line = "добавляем новую строку в существующий файл";
        try (FileWriter fileWriter = new FileWriter("fileName1")) {
            fileWriter.write("\n" + line);
        }*/

        /**
         * Задача 7
         * Напишите программу на Java, читающую первые три строки файла и записывающую их в другой файл.
         */
        /*try (BufferedReader bufferedReader = new BufferedReader(new FileReader("fileName1"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fileName2"))) {
            String line;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null && count < 3) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                count++;
            }
        }*/

        /**
         * Задача 8
         * Напишите программу на Java для поиска самого длинного слова в текстовом файле.
         */
        /*try (BufferedReader bufferedReader = new BufferedReader(new FileReader("fileName1"))){
            String line;
            String lineMax = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() > lineMax.length()) {
                        lineMax = word;
                    }
                }
            }
            System.out.println(lineMax);
        }*/
    }
}