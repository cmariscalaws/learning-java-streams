package com.learning.javastreams.beans;

import java.util.Objects;

public class Employee {
    private final String name;
    private final String department;
    private final String city;


    public Employee(final String name,
                    final String department,
                    final String city) {

        this.name = name;
        this.department = department;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getName(), employee.getName()) && Objects.equals(getDepartment(), employee.getDepartment()) && Objects.equals(getCity(), employee.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDepartment(), getCity());
    }
}
