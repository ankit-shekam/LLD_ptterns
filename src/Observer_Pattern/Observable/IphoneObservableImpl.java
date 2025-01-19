package Observer_Pattern.Observable;

import Observer_Pattern.Observer.NotificationObserver;
import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

  public List<NotificationObserver> observerList = new ArrayList<>();
  public int stockCount = 0;

  @Override
  public void addObserver(NotificationObserver observer) { observerList.add(observer); }

  @Override
  public void removeObserver(NotificationObserver observer) { observerList.remove(observer); }

  @Override
  public int getStockCount() { return stockCount; }

  @Override
  public void notifyObservers() {
    for(NotificationObserver observer : observerList){
      observer.update();
    }
  }

  @Override
  public void setStockCount(int newStockAddedCount) {
    if(stockCount == 0){
      notifyObservers();
    }
    stockCount += newStockAddedCount;
  }
}
