package Observer_Pattern.Observable;

import Observer_Pattern.Observer.NotificationObserver;

public interface StocksObservable {

  void addObserver(NotificationObserver observer);
  void removeObserver(NotificationObserver observer);
  void notifyObservers();
  void setStockCount(int newStockAddedCount);
  int getStockCount();

}
