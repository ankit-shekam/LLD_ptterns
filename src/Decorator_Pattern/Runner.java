package Decorator_Pattern;

import Decorator_Pattern.Base_Class.BasePizza;
import Decorator_Pattern.Base_Class.MargaritaPizza;
import Decorator_Pattern.Base_Class.VegDelightPizza;
import Decorator_Pattern.Decorators.ExtraCheese;
import Decorator_Pattern.Decorators.ExtraMushroom;

public class Runner {
  public static void main(String[] args) {
    BasePizza margPizza = new MargaritaPizza();
    System.out.println(margPizza.cost());

    BasePizza vegDelightPizza = new VegDelightPizza();

    BasePizza extraCheeseMarg = new ExtraCheese(margPizza);
    System.out.println(extraCheeseMarg.cost());

    BasePizza extraCheeseMushroomMarg = new ExtraMushroom(extraCheeseMarg);
    System.out.println(extraCheeseMushroomMarg.cost());

    BasePizza extraCheeseVegDelight = new ExtraCheese(vegDelightPizza);
    System.out.println(extraCheeseVegDelight.cost());
  }
}
