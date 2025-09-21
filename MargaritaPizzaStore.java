// src/main/java/factorymethod/ChicagoPizzaStore.java
package factorymethod;

/**
 * Concrete Creator: Chicago pizza store.
 * Overrides the factory method to create Chicago-style pizzas.
 */
public class MargaritaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)) {
            return new Margarita();
        }
        // Can add more types here without changing base class
        return null;
    }
}