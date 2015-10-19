package com.meetup.scs.ocp;

public class FizzBuzzSetup {
    public static FizzBuzz create() {
        return new FizzBuzz(
                new SayBangRule(),
                new SayFizzBuzzRule(),
                new SayBuzzRule(),
                new SayFizzRule(),
                new SayTheNumberRule()
        );
    }
}
