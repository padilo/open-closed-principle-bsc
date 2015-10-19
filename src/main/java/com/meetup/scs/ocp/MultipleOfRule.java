package com.meetup.scs.ocp;

/**
 * Created by pablo.diaz on 19/10/15.
 */
public abstract class MultipleOfRule implements FizzBuzzRule {
    private int multiple;
    private String name;

    public MultipleOfRule(int multiple, String name) {
        this.multiple = multiple;
        this.name = name;
    }

    @Override
    public boolean canSay(int i) {
        return i%multiple == 0;
    }

    @Override
    public String say(int i) {
        return name;
    }
}
