package com.meetup.scs.ocp;

/**
 * Created by pablo.diaz on 19/10/15.
 */
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
