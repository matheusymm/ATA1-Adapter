package StockApp;

public class StockApp {
    public static void main(String[] args) {
        SmartAnalytics smartAnalytics = new SmartAnalytics();
        StockData stockdata = new StockDataAdapter(smartAnalytics);
        String data = stockdata.getStockData("AAPL");
        System.out.println(data);
    }
}