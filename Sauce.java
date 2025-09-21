// src/main/java/abstractfactory/Sauce.java
package abstractfactory;


public interface Sauce {
    String getDescription();
}

class MarinaraSauce implements Sauce {
    @Override
    public String getDescription() {
        return "Marinara Sauce";
    }
}

class PlumTomatoSauce implements Sauce {
    @Override
    public String getDescription() {
        return "Plum Tomato Sauce";
    }
}