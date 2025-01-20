package Decorator_Pattern.Base_Class;

public class MargaritaPizza extends BasePizza{

  public final int MARGARITA_PRICE = 100;

  @Override
  public int cost() {
    return MARGARITA_PRICE;
  }
}
