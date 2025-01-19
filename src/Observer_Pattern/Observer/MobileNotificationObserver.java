package Observer_Pattern.Observer;

import Observer_Pattern.Observable.StocksObservable;

public class MobileNotificationObserver implements NotificationObserver{
  public String phoneNumer;
  StocksObservable stocksObservable;

  public MobileNotificationObserver(String mobileNum, StocksObservable observable){
    this.stocksObservable = observable;
    this.phoneNumer = mobileNum;
  }

  @Override
  public void update() {
    MobileNotificationSent(phoneNumer, "hurry the iphone you were looking for is in stock now...");
  }

  public void MobileNotificationSent(String mobileNum, String msg){
    System.out.println("hey : "+ mobileNum + ", " + msg);
  }
}
