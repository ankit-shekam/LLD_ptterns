package Observer_Pattern;

import Observer_Pattern.Observable.IphoneObservableImpl;
import Observer_Pattern.Observer.EmailNotificationObserver;
import Observer_Pattern.Observer.MobileNotificationObserver;

public class Runner {
  public static void main(String[] args) {
    //got a weather station that updates the weather every second
    //got two displays (Observers) i.e. Mobile and TV
    //create a solution such that the observers get updates as soon as the Subject updates value

    IphoneObservableImpl iphoneObservable = new IphoneObservableImpl();

    EmailNotificationObserver emailNotificationObserver1 = new EmailNotificationObserver("abc@gmail.com", iphoneObservable);
    EmailNotificationObserver emailNotificationObserver2 = new EmailNotificationObserver("xyz@gmail.com", iphoneObservable);
    MobileNotificationObserver mobileNotificationObserver1 = new MobileNotificationObserver("1234", iphoneObservable);
    MobileNotificationObserver mobileNotificationObserver2 = new MobileNotificationObserver("5678", iphoneObservable);

    iphoneObservable.addObserver(emailNotificationObserver1);
    iphoneObservable.addObserver(emailNotificationObserver2);
    iphoneObservable.addObserver(mobileNotificationObserver1);
    iphoneObservable.addObserver(mobileNotificationObserver2);

    iphoneObservable.setStockCount(5);
    iphoneObservable.removeObserver(emailNotificationObserver2);
    iphoneObservable.removeObserver(mobileNotificationObserver2);
    iphoneObservable.setStockCount(-5);
    iphoneObservable.setStockCount(5);


  }
}
