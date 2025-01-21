package AbstractFactory_Pattern.LoanFactory;

import AbstractFactory_Pattern.AbstractFactory;
import AbstractFactory_Pattern.BankFactory.Bank;

import java.text.MessageFormat;

public class LoanFactory extends AbstractFactory {
  @Override
  public Bank getBank(String bank) {
    return null;
  }

  @Override
  public Loan getLoan(String loan) throws ClassNotFoundException {
    switch (loan.toUpperCase()){
      case "EDUCATION_LOAN":
        return new EducationLoan();
      case "HOME_LOAN":
        return new HomeLoan();
      default:
        throw new ClassNotFoundException(MessageFormat.format("Loan not supported yet: ", loan));
    }
  }
}
