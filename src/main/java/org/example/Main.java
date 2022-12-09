package org.example;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        FileReader fileReader = new FileReader("src/main/resources/foreign_names.csv");

        CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

        CSVReader csvReader = new CSVReaderBuilder(fileReader).withCSVParser(parser).build();

        List<String[]> allData = csvReader.readAll();

        boolean flag = false;

        List<Human> humans = new ArrayList<>();

        for (String[] row : allData) {
            if (!flag) {
                flag = true;
            } else {
                Department department = new Department((row[4]).hashCode(), row[4]);
                Date date = new SimpleDateFormat("dd.MM.yyyy").parse(row[3]);
                Human human = new Human(Integer.parseInt(row[0]),
                        row[1],
                        Gender.valueOf(row[2]),
                        department,
                        Integer.parseInt(row[5]),
                        date);
                humans.add(human);
            }
        }
        for (Human human : humans) {
            System.out.println(human);
        }

    }
}