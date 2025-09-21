// src/main/java/factorymethod/Pizza.java
package factorymethod;

/**
 * Represents a Pizza product with a name and preparation steps.
 * This interface defines the common behavior for all concrete pizzas.
 */
public interface Pizza {
    /**
     * Prepares the pizza by gathering ingredients and assembling.
     */
    void prepare();

    /**
     * Bakes the pizza in the oven.
     */
    void bake();

    /**
     * Cuts the pizza into slices.
     */
    void cut();

    /**
     * Boxes the pizza for delivery.
     */
    void box();

    /**
     * Gets the name of the pizza.
     * @return the pizza name
     */
    String getName();
}