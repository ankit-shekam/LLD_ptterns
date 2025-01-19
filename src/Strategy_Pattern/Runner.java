package Strategy_Pattern;

import Strategy_Pattern.Strategy.NormalDrive;
import Strategy_Pattern.Strategy.SpecialDrive;

public class Runner {

  public static void main(String[] args) {

    Vehicle v1 = new Vehicle(new NormalDrive());
    v1.drive(v1.hashCode());

    v1.setNewDrive(new SpecialDrive());
    v1.drive(v1.hashCode());

  }

}
