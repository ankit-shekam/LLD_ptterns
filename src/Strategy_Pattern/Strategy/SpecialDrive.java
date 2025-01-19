package Strategy_Pattern.Strategy;

public class SpecialDrive implements DriveStrategy{
  @Override
  public void drive(int code) {
    System.out.println("this is SPECIAL drive method called by : " + code);
  }
}
