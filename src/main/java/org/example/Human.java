package org.example;

import java.util.Date;

public class Human {
    int ID;
    String name;
    Gender gender;
    Department department;
    int salary;
    Date birthDate;
    public Human(int ID, String name, Gender gender, Department department, int salary, Date birthDate) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Human{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", department=" + department +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}
