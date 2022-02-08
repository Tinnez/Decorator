package academy.mindswap;

public class SimplePizza extends Pizza{
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getGetDescription() {
        return "Mozzarela";
    }
}
