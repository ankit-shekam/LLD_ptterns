package Observer_Pattern.Observer;

import Observer_Pattern.Observable.StocksObservable;

public class EmailNotificationObserver implements NotificationObserver{
  public String mailId;
  StocksObservable stocksObservable;

  public EmailNotificationObserver(String mailId, StocksObservable observable){
    this.mailId = mailId;
    this.stocksObservable = observable;
  }

  @Override
  public void update() {
    sendMail(mailId, "hurry the iphone you were looking for is in stock now...");
  }

  public void sendMail(String mailId, String msg){
    System.out.println("hey : "+ mailId + ", " + msg);
  }
}
