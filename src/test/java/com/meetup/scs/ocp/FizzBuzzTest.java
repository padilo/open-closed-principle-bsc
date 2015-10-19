package com.meetup.scs.ocp;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void sayTheNumber() {
        FizzBuzz fizzBuzz = FizzBuzzFactory.create();

        assertThat(fizzBuzz.say(1), equalTo("1"));
        assertThat(fizzBuzz.say(2), equalTo("2"));
    }
}