package Factory_Pattern;

import Factory_Pattern.Shapes.Shape;
import Factory_Pattern.Shapes.ShapeFactory;

public class Runner {
  public static void main(String[] args) throws ClassNotFoundException {
    ShapeFactory factory = new ShapeFactory();
//    Shape circle = factory.ShapeFactory("circle");
    Shape square = factory.ShapeFactory("square");
    square.draw();

  }
}
