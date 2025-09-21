// src/main/java/Main.java

import abstractfactory.Pizza;

/**
 * Client code demonstrating both patterns.
 * This class shows how to use Factory Method and Abstract Factory.
 */
public class Main {
    public static void main(String[] args) {
        // Demonstrate Factory Method
        System.out.println("Factory Method:");
        factorymethod.PizzaStore nyStore = new factorymethod.PepperoniPizzaStore();
        factorymethod.Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("Ordered: " + nyPizza.getName() + "\n");

        factorymethod.PizzaStore chicagoStore = new factorymethod.MargaritaPizzaStore();
        factorymethod.Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ordered: " + chicagoPizza.getName() + "\n");

        // Demonstrate Abstract Factory
        System.out.println("Abstract Factory Demo:");
        abstractfactory.IngredientFactory nyIngredientFactory = new abstractfactory.PepperoniIngredientFactory();
        Pizza nyCheesePizza = new Pizza(nyIngredientFactory);
        nyCheesePizza.display();

        abstractfactory.IngredientFactory chicagoIngredientFactory = new abstractfactory.MargaritaIngredientFactory();
        Pizza chicagoCheesePizza = new Pizza(chicagoIngredientFactory);
        chicagoCheesePizza.display();
    }
}