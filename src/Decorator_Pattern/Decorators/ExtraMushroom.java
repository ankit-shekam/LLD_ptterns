package Decorator_Pattern.Decorators;

import Decorator_Pattern.Base_Class.BasePizza;

public class ExtraMushroom extends ToppingsDecorator{

  BasePizza pizza;
  private final int EXTRA_MUSHROOM_PRICE = 15;

  public ExtraMushroom(BasePizza base){
    this.pizza = base;
  }

  @Override
  public int cost() {
    return pizza.cost()+EXTRA_MUSHROOM_PRICE;
  }
}
