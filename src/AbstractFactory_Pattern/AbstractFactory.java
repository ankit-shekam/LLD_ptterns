package AbstractFactory_Pattern;

import AbstractFactory_Pattern.BankFactory.Bank;
import AbstractFactory_Pattern.LoanFactory.Loan;

public abstract class AbstractFactory {
  public abstract Bank getBank(String bank) throws ClassNotFoundException;
  public abstract Loan getLoan(String loan) throws ClassNotFoundException;
}
