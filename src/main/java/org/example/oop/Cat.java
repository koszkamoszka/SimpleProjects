package org.example.oop;

public class Cat extends Animal implements Fluffy {
    @Override
    protected void makeSound() {
        System.out.println("meow");
        super.makeSound();
    }

    private void size() {

    }

    @Override
    public void combFur() {

    }
}
