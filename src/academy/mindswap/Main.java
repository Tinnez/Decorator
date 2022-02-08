package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        PizzaDecorator pizza = new Peperoni(new Olives(new Peperoni(new PlainPizza())));

        System.out.println(pizza.getCost());
        System.out.println(pizza.getGetDescription());
    }
}
