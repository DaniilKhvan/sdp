// src/main/java/factorymethod/PizzaStore.java
package factorymethod;

/**
 * Creator: Abstract class that declares the factory method for creating pizzas.
 * Subclasses will override createPizza to return specific pizza types.
 * This promotes loose coupling and adheres to the Single Responsibility Principle.
 */
public abstract class PizzaStore {
    /**
     * Orders a pizza by type. This method uses the factory method to create the pizza.
     * @param type the type of pizza to order (e.g., "cheese")
     * @return the prepared pizza
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        if (pizza == null) {
            throw new IllegalArgumentException("Unknown pizza type: " + type);
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * Factory method: Subclasses implement this to create specific pizza types.
     * @param type the type of pizza
     * @return a new pizza instance
     */
    protected abstract Pizza createPizza(String type);
}