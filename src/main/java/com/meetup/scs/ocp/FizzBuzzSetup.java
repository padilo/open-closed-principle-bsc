package com.meetup.scs.ocp;

public class FizzBuzzSetup {
    public static FizzBuzz create() {
        return new FizzBuzz(
                new SayFizzRule(),
                new SayTheNumberRule()
        );
    }
}
