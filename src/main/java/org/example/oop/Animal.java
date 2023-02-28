package org.example.oop;

/*
public - everyone has access
package-private (default) - classes in package have access
protected - child classes have access
private - only internal access
 */
public class Animal {
    protected void makeSound() {
        System.out.println("*silence*");
        size();
    }

    private void size() {

    }
}
