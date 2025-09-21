// src/main/java/factorymethod/NYPizzaStore.java
package factorymethod;

/**
 * Concrete Creator: New York pizza store.
 * Overrides the factory method to create NY-style pizzas.
 */
public class PepperoniPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)) {
            return new Pepperoni();
        }
        // Can add more types here without changing base class
        return null;
    }
}