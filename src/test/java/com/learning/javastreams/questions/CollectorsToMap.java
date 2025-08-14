package com.learning.javastreams.questions;

import com.learning.javastreams.beans.Employee;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectorsToMap {

    /**
     * Collects a list of employees into a map where the key is the city and the value is the employee's name.
     * If multiple employees share the same city, the first encountered name is retained.
     */
    @Test
    void collectToMap() throws IOException {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", "New York"),
                new Employee("Bob", "Finance", "San Francisco"),
                new Employee("Charlie", "IT", "New York")
        );

        Map<String, String> cityToName = new HashMap<>();

        System.out.println(cityToName);

        assertEquals(Map.of("New York", "Alice", "San Francisco", "Bob"), cityToName);

    }

    /**
     * Uses a parallel stream to collect employees into a thread-safe map,
     * mapping each city to the first encountered employee's name.
     * If multiple employees share a city, only the first name is retained.
     */
    @Test
    void collectToMapParallel() throws IOException {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", "New York"),
                new Employee("Bob", "Finance", "San Francisco"),
                new Employee("Charlie", "IT", "New York"),
                new Employee("David", "IT", "San Francisco"),
                new Employee("Eve", "HR", "Chicago")
        );

        Map<String, String> cityToName = new HashMap<>();

        System.out.println(cityToName);

        assertEquals(
                Map.of("New York", "Alice", "San Francisco", "Bob", "Chicago", "Eve"),
                cityToName
        );

    }

    /**
     * Uses a parallel stream to group employees by city, collecting the names of employees from each city into a list.
     * The resulting map has cities as keys and lists of employee names as values.
     */
    @Test
    void collectToMapParallelUsingGroupingBy() throws IOException {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", "New York"),
                new Employee("Bob", "Finance", "San Francisco"),
                new Employee("Charlie", "IT", "New York"),
                new Employee("David", "IT", "San Francisco"),
                new Employee("Eve", "HR", "Chicago")
        );

        Map<String, String> cityToName = new HashMap<>();

        System.out.println(cityToName);

        assertEquals(
                Map.of(
                        "New York", List.of("Alice", "Charlie"),
                        "San Francisco", List.of("Bob", "David"),
                        "Chicago", List.of("Eve")
                ),
                cityToName
        );


    }
}
