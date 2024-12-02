package StockApp;

public class StockDataAdapter implements StockData {
    private SmartAnalytics smartAnalytics;

    public StockDataAdapter(SmartAnalytics smartAnalytics) {
        this.smartAnalytics = smartAnalytics;
    }

    private String convertToJson(String stockData) {
        return stockData + ".json";
    }

    private String convertToXml(String stockData) {
        return stockData + ".xml";
    }

    public String getStockData(String stockName) {
        String stockDataJson = convertToJson(stockName);
        String analyzedData = smartAnalytics.getStockData(stockDataJson);
        return convertToXml(analyzedData);
    }
}
