package academy.mindswap;

public class Olives extends PizzaDecorator{

    public Olives(IPizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }

    @Override
    public String getGetDescription() {
        return super.getGetDescription() + "Olives";
    }
}
