package org.example;

public class Department {
    int ID;
    String name;

    public Department(int parseInt, String s) {
        ID = parseInt;
        name = s;
    }

    @Override
    public String toString() {
        return "Department{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
