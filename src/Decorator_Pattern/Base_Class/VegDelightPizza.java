package Decorator_Pattern.Base_Class;

public class VegDelightPizza extends BasePizza{

  public final int VEG_DELIGHT_PRICE = 70;

  @Override
  public int cost() {
    return VEG_DELIGHT_PRICE;
  }
}
