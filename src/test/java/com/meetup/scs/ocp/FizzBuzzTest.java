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

    @Test
    public void sayFizzBuzz() {
        FizzBuzz fizzBuzz = FizzBuzzSetup.create();

        assertThat(fizzBuzz.say(3*5), equalTo("FizzBuzz"));
    }

    @Test
    public void sayBang() {
        FizzBuzz fizzBuzz = FizzBuzzSetup.create();

        assertThat(fizzBuzz.say(7), equalTo("Bang"));
        assertThat(fizzBuzz.say(14), equalTo("Bang"));
    }

    @Test
    public void sayFizzBang() {
        FizzBuzz fizzBuzz = FizzBuzzSetup.create();

        assertThat(fizzBuzz.say(3*7), equalTo("FizzBang"));

    }

    @Test
    public void sayBuzzBang() {
        FizzBuzz fizzBuzz = FizzBuzzSetup.create();

        assertThat(fizzBuzz.say(5*7), equalTo("BuzzBang"));
    }

    @Test
    public void sayFizzBuzzBang() {
        FizzBuzz fizzBuzz = FizzBuzzSetup.create();

        assertThat(fizzBuzz.say(3*5*7), equalTo("FizzBuzzBang"));
    }
}