package com.meetup.scs.ocp;

import java.util.stream.Stream;

public class FizzBuzz {
    private FizzBuzzRule[] rules;

    public FizzBuzz(FizzBuzzRule... rules) {
        this.rules = rules;
    }

    public String say(int i) {
        return Stream.of(rules)
                .filter(rule -> rule.canSay(i))
                .findFirst()
                .map(rule -> rule.say(i))
                .orElse("???");
    }
}
