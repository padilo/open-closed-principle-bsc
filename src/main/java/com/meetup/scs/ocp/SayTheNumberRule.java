package com.meetup.scs.ocp;

public class SayTheNumberRule implements FizzBuzzRule {
    @Override
    public boolean canSay(int i) {
        return true;
    }

    @Override
    public String say(int i) {
        return String.valueOf(i);
    }
}
