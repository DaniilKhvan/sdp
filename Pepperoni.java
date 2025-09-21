// src/main/java/factorymethod/NYStyleCheesePizza.java
package factorymethod;

/**
 * Concrete product: New York style cheese pizza.
 * Implements the Pizza interface with specific behavior.
 */
public class Pepperoni implements Pizza {
    private final String name = "Pepperoni";

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
    }

    @Override
    public void bake() {
        System.out.println("Baking " + name);
    }

    @Override
    public void cut() {
        System.out.println("Cutting " + name);
    }

    @Override
    public void box() {
        System.out.println("Boxing " + name);
    }

    @Override
    public String getName() {
        return name;
    }
}