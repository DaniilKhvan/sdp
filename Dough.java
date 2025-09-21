package abstractfactory;


public interface Dough {
    String getDescription();
}

class ThinCrustDough implements Dough {
    @Override
    public String getDescription() {
        return "Thin Crust Dough";
    }
}

class ThickCrustDough implements Dough {
    @Override
    public String getDescription() {
        return "Thick Crust Dough";
    }
}