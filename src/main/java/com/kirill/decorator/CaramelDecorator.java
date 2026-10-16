package com.kirill.decorator;

public class CaramelDecorator extends CoffeeDecorator {

    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", caramel";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.70;
    }
}
