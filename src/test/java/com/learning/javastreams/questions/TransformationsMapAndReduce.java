package com.learning.javastreams.questions;

import com.learning.javastreams.beans.Car;
import com.learning.javastreams.beans.Person;
import com.learning.javastreams.beans.PersonDTO;
import com.learning.javastreams.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class TransformationsMapAndReduce {

    @Test
    void yourFirstTransformationWithMap() throws IOException {
        List<Person> people = MockData.getPeople();
        List<PersonDTO> personDTOList = people.stream()
                .map(PersonDTO::map)
                .toList();

        personDTOList.forEach(System.out::println);
    }

    @Test
    void mapToDoubleAndFindAverageCarPrice() throws IOException {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void reduce() {
        int[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
    }
}

