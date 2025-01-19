package Strategy_Pattern;

import Strategy_Pattern.Strategy.NormalDrive;
import Strategy_Pattern.Strategy.SpecialDrive;

public class Runner {

  public static void main(String[] args) {

//    create a vehicle package where each vehicle has a specific type of drive() logic and you
//    have the capability of switching between the different drive logic with minimal change
    
    Vehicle v1 = new Vehicle(new NormalDrive());
    v1.drive(v1.hashCode());

    v1.setNewDrive(new SpecialDrive());
    v1.drive(v1.hashCode());

  }

}
