package com.learning.javastreams.questions;

import com.learning.javastreams.beans.Employee;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlattenNestedList {

    /**
     * Flattens a nested list of employees into a single list using flatMap.
     * The resulting list contains all employees from the nested structure.
     */
    @Test
    void flattenList() throws IOException {
        Employee e1 = new Employee("Alice", "HR", "New York");
        Employee e2 = new Employee("Bob", "Finance", "San Francisco");
        Employee e3 = new Employee("Charlie", "IT", "New York");
        Employee e4 = new Employee("David", "IT", "San Francisco");

        List<List<Employee>> nestedList = Arrays.asList(
                Arrays.asList(e1, e2),
                Arrays.asList(e3, e4)
        );

        List<Employee> flatList = Collections.EMPTY_LIST;

        // Assert that the flattened list contains all employees in order
        assertEquals(List.of(e1, e2, e3, e4), flatList);
    }

    /**
     * Flattens a nested list of employees, filters for those in New York, and maps to their names.
     * The resulting list contains the names of employees from New York.
     */
    @Test
    void flattenFilterMapList() throws IOException {
        Employee e1 = new Employee("Alice", "HR", "New York");
        Employee e2 = new Employee("Bob", "Finance", "San Francisco");
        Employee e3 = new Employee("Charlie", "IT", "New York");
        Employee e4 = new Employee("David", "IT", "San Francisco");

        List<List<Employee>> nestedList = Arrays.asList(
                Arrays.asList(e1, e2),
                Arrays.asList(e3, e4)
        );

        List<String> nyEmployeeNames = Collections.EMPTY_LIST;

        // Assert that the list contains only the names of New York employees
        assertEquals(List.of("Alice", "Charlie"), nyEmployeeNames);
    }


}
