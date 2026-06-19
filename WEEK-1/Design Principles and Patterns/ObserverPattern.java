import java.util.ArrayList;

public class ObserverPattern {

    interface Observer {
        void update(double price);
    }

    interface Stock {
        void registerObserver(Observer observer);
        void removeObserver(Observer observer);
        void notifyObservers();
    }

    static class StockMarket implements Stock {

        private ArrayList<Observer> observers = new ArrayList<>();
        private double stockPrice;

        public void registerObserver(Observer observer) {
            observers.add(observer);
        }

        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(stockPrice);
            }
        }

        public void setStockPrice(double stockPrice) {
            this.stockPrice = stockPrice;
            notifyObservers();
        }
    }

    static class MobileApp implements Observer {

        public void update(double price) {
            System.out.println("Mobile App: Stock price updated to Rs." + price);
        }
    }

    static class WebApp implements Observer {

        public void update(double price) {
            System.out.println("Web App: Stock price updated to Rs." + price);
        }
    }

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        stockMarket.setStockPrice(2500.50);
    }
}