package task3;

public class Price {
    private String productName;
    private String store;
    private int price;
    public Price (String productName, String store, int price){
        this.productName = productName;
        this.store = store;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getStore() {
        return store;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "productName='" + productName + '\'' +
                ", store='" + store + '\'' +
                ", price=" + price +
                '}';
    }
}
