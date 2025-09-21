package abstractfactory;


public interface IngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();
}