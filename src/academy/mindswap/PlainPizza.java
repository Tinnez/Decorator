package academy.mindswap;

public class PlainPizza implements IPizza{
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getGetDescription() {
        return "Dough";
    }
}
