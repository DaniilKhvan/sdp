package abstractfactory;

public interface Cheese {
    String getDescription();
}

class ReggianoCheese implements Cheese {
    @Override
    public String getDescription() {
        return "Reggiano Cheese";
    }
}

class MozzarellaCheese implements Cheese {
    @Override
    public String getDescription() {
        return "Mozzarella Cheese";
    }
}