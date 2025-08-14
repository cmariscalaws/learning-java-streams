package com.learning.javastreams.questions;

import com.learning.javastreams.beans.Person;
import com.learning.javastreams.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;


public class GettingStarted {

    @Test
    public void imperativeApproach() throws IOException {
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        List<Person> people = MockData.getPeople();
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        List<Person> people = MockData.getPeople();

        List<Person> first10Under18 = people.stream()
                .filter(p -> p.getAge() <= 18)
                .limit(10)
                .toList();

        first10Under18.forEach(System.out::println);
    }
}
