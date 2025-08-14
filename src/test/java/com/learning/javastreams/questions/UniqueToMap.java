package com.learning.javastreams.questions;

import com.learning.javastreams.beans.Employee;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueToMap {

    /**
     * Keeps unique employees by department (first occurrence) using toMap.
     * The resulting collection contains the names of the first employee for each department.
     */
    @Test
    void uniqueDepartment() throws IOException {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", "New York"),
                new Employee("Bob", "Finance", "San Francisco"),
                new Employee("Charlie", "HR", "Chicago"),
                new Employee("David", "Finance", "Boston"),
                new Employee("Eve", "IT", "Seattle")
        );

        Collection<String> uniqueByDept = new HashSet<>();

        // Assert that the collection contains the first employee name per department
        assertEquals(Set.of("Alice", "Bob", "Eve"), new HashSet<>(uniqueByDept));
    }

    /**
     * Filters employees to keep only the first occurrence per department using a HashSet.
     * The resulting list contains the first employee for each department.
     */
    @Test
    void uniqueDepartment_distinct() throws IOException {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", "New York"),
                new Employee("Bob", "Finance", "San Francisco"),
                new Employee("Charlie", "HR", "Chicago"),
                new Employee("David", "Finance", "Boston"),
                new Employee("Eve", "IT", "Seattle")
        );

        Set<String> seenDepartments = new HashSet<>();
        List<Employee> uniqueByDept2 = new ArrayList<>();

        // Assert that the list contains the first employee per department
        assertEquals(
                List.of(
                        new Employee("Alice", "HR", "New York"),
                        new Employee("Bob", "Finance", "San Francisco"),
                        new Employee("Eve", "IT", "Seattle")
                ),
                uniqueByDept2
        );
    }
}
