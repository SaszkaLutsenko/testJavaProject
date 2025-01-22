package org.example.pakege;

public class IDuck implements IFlyable, ISwimmable   {

    @Override
    public void swim() {
        System.out.println("this shit swims");
    }

    @Override
    public void fly() {
            System.out.println("this shit flying");
    }
}
