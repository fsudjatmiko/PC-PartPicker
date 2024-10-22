public class Component {
    private String name;
    private String type;
    private int price;
    private int performance;

    public Component(String name, String type, int price, int performance) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.performance = performance;
    }

    // Getters
    public String getName() { return name; }
    public String getType() { return type; }
    public int getPrice() { return price; }
    public int getPerformance() { return performance; }
}