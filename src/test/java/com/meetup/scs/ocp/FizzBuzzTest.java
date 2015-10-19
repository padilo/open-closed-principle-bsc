package com.meetup.scs.ocp;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void sayTheNumber() {
        FizzBuzz fizzBuzz = FizzBuzzSetup.create();

        assertThat(fizzBuzz.say(1), equalTo("1"));
        assertThat(fizzBuzz.say(2), equalTo("2"));
    }

    @Test
    public void sayFizz() {
        FizzBuzz fizzBuzz = FizzBuzzSetup.create();

        assertThat(fizzBuzz.say(3), equalTo("Fizz"));
        assertThat(fizzBuzz.say(6), equalTo("Fizz"));
    }

    @Test
    public void sayBuzz() {
        FizzBuzz fizzBuzz = FizzBuzzSetup.create();

        assertThat(fizzBuzz.say(5), equalTo("Buzz"));
        assertThat(fizzBuzz.say(10), equalTo("Buzz"));
    }
}