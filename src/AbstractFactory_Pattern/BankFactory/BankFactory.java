package AbstractFactory_Pattern.BankFactory;

import AbstractFactory_Pattern.AbstractFactory;
import AbstractFactory_Pattern.LoanFactory.Loan;

import java.text.MessageFormat;

public class BankFactory extends AbstractFactory {

  @Override
  public Bank getBank(String bank) throws ClassNotFoundException {
    switch (bank.toUpperCase()){
      case "HDFC":
        return new Hdfc();
      case "SBI":
        return new Sbi();
      default:
        throw new ClassNotFoundException(MessageFormat.format("bank not supported yet : ", bank));
    }
  }

  @Override
  public Loan getLoan(String loan){
    return null;
  }
}
