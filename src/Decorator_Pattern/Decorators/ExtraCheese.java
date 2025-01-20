package Decorator_Pattern.Decorators;

import Decorator_Pattern.Base_Class.BasePizza;

public class ExtraCheese extends ToppingsDecorator{

  BasePizza pizza;
  private final int EXTRA_CHEESE_PRICE = 10;

  public ExtraCheese(BasePizza base){
    this.pizza = base;
  }

  @Override
  public int cost() {
    return pizza.cost()+EXTRA_CHEESE_PRICE;
  }

}
