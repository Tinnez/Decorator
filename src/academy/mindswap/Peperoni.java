package academy.mindswap;

public class Peperoni extends PizzaDecorator{

    public Peperoni(IPizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getGetDescription() {
        return super.getGetDescription() + "Pepperoni";
    }
}
