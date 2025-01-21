package AbstractFactory_Pattern;

import AbstractFactory_Pattern.BankFactory.BankFactory;
import AbstractFactory_Pattern.LoanFactory.LoanFactory;

import java.text.MessageFormat;

public class FinancialFactory {
  public AbstractFactory FinancialFactory(String factoryType) throws ClassNotFoundException {
    switch (factoryType.toUpperCase()){
      case "BANK":
        return new BankFactory();
      case "LOAN":
        return new LoanFactory();
      default:
        throw new ClassNotFoundException(MessageFormat.format("Factory not supported yet: ", factoryType));
    }
  }
}
