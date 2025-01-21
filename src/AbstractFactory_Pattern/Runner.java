package AbstractFactory_Pattern;

import AbstractFactory_Pattern.BankFactory.Bank;
import AbstractFactory_Pattern.LoanFactory.Loan;

public class Runner {
  public static void main(String[] args) throws ClassNotFoundException {
    FinancialFactory financialFactory = new FinancialFactory();
    AbstractFactory bankFactory = financialFactory.FinancialFactory("bank");
    AbstractFactory loanFactory = financialFactory.FinancialFactory("loan");
    Bank newSbi = bankFactory.getBank("sbi");
    newSbi.Bank();
    Loan newHomeLoan = loanFactory.getLoan("home_loan");
    newHomeLoan.Loan();
  }
}
