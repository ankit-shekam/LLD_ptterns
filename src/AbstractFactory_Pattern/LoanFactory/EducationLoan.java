package AbstractFactory_Pattern.LoanFactory;

public class EducationLoan implements Loan{
  @Override
  public void Loan() {
    System.out.println("this is an Education Loan product");
  }
}
