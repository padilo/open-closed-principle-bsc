package com.meetup.scs.ocp;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzz {
    private FizzBuzzRule[] rules;

    public FizzBuzz(FizzBuzzRule... rules) {
        this.rules = rules;
    }

    public String say(int i) {
        String value = Stream.of(rules)
                .filter(rule -> rule.canSay(i))
                .map(rule -> rule.say(i))
                .collect(Collectors.joining());

        return value.equals("")? String.valueOf(i): value;
    }
}
