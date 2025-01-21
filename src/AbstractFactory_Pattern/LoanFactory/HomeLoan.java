package AbstractFactory_Pattern.LoanFactory;

public class HomeLoan implements Loan{
  @Override
  public void Loan() {
    System.out.println("this is a HomeLoan payment");
  }
}
