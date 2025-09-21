// src/main/java/factorymethod/ChicagoStyleCheesePizza.java
package factorymethod;

/**
 * Concrete product: Chicago style cheese pizza.
 * Implements the Pizza interface with specific behavior.
 */
public class Margarita implements Pizza {
    private final String name = "Margarita";

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
        System.out.println("Cutting " + name + " into squares");
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