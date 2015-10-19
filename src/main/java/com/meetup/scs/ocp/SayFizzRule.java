package com.meetup.scs.ocp;

/**
 * Created by pablo.diaz on 19/10/15.
 */
public class SayFizzRule implements FizzBuzzRule{
    @Override
    public boolean canSay(int i) {
        return i%3==0;
    }

    @Override
    public String say(int i) {
        return "Fizz";
    }
}
