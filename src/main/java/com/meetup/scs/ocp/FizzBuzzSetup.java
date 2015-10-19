package com.meetup.scs.ocp;

public class FizzBuzzSetup {
    public static FizzBuzz create() {
        return new FizzBuzz(
                new SayFizzBuzzBangRule(),
                new SayBuzzBangRule(),
                new SayFizzBangRule(),
                new SayBangRule(),
                new SayFizzBuzzRule(),
                new SayBuzzRule(),
                new SayFizzRule(),
                new SayTheNumberRule()
        );
    }
}
