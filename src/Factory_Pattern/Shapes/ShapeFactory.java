package Factory_Pattern.Shapes;

import java.text.MessageFormat;

public class ShapeFactory {
  public Shape ShapeFactory(String factory) throws ClassNotFoundException {
    switch (factory.toUpperCase()){
    case "SQUARE":
      System.out.println("creating square shape Obj...");
      return new Square();
    case "RECTANGLE":
      System.out.println("creating rectangle shape Obj...");
      return new Rectangle();
    default:
      throw new ClassNotFoundException(MessageFormat.format("Shape not supported yet...", factory.toUpperCase()));
    }
  }
}
