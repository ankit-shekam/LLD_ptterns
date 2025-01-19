package Strategy_Pattern;
import Strategy_Pattern.Strategy.DriveStrategy;

public class Vehicle {

  private DriveStrategy obj;

  public Vehicle(DriveStrategy ob){
    this.obj = ob;
  }

  public void setNewDrive(DriveStrategy ob){
    this.obj = ob;
  }

  public void drive(int code){
    this.obj.drive(code);
  }

}
