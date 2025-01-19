package Strategy_Pattern.Strategy;

public class NormalDrive implements DriveStrategy{

  @Override
  public void drive(int code) {
    System.out.println("this is NORMAL Drive Method called by : " + code);
  }
}
