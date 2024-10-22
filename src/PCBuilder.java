import java.util.*;

public class PCBuilder {
    private List<Component> components;

    public PCBuilder() {
        components = new ArrayList<>();
        initializeComponents();
    }

    private void initializeComponents() {
        // CPU
        components.add(new Component("Ryzen 3 1200", "CPU", 100, 50));
        components.add(new Component("Ryzen 5 5600", "CPU", 300, 80));
        components.add(new Component("Ryzen 7 5800X3D", "CPU", 450, 90));
        components.add(new Component("Ryzen 9 7950X3D", "CPU", 700, 100));
        components.add(new Component("Core i3 10100", "CPU", 120, 55));
        components.add(new Component("Core i5 11400", "CPU", 250, 75));
        components.add(new Component("Core i7 13700KF", "CPU", 400, 95));
        components.add(new Component("Core i9 13900K", "CPU", 600, 100));

        // GPU
        components.add(new Component("GTX 1650", "GPU", 150, 50));
        components.add(new Component("RTX 3060", "GPU", 300, 70));
        components.add(new Component("RTX 3070", "GPU", 500, 85));
        components.add(new Component("RTX 4080", "GPU", 1000, 95));
        components.add(new Component("RX 6500 XT", "GPU", 200, 60));
        components.add(new Component("RX 6700 XT", "GPU", 400, 80));
        components.add(new Component("RX 6800 XT", "GPU", 600, 90));
        components.add(new Component("RX 7900 XTX", "GPU", 1000, 100));

        // RAM, Storage, PSU, Cooling
        components.add(new Component("8GB DDR4-3200", "RAM", 50, 60));
        components.add(new Component("16GB DDR4-3600", "RAM", 100, 80));
        components.add(new Component("32GB DDR4-3600", "RAM", 150, 90));
        components.add(new Component("500GB NVMe SSD", "Storage", 70, 70));
        components.add(new Component("1TB NVMe SSD", "Storage", 120, 85));
        components.add(new Component("2TB NVMe SSD", "Storage", 200, 95));
        components.add(new Component("650W 80+ Gold", "PSU", 80, 80));
        components.add(new Component("750W 80+ Gold", "PSU", 100, 85));
        components.add(new Component("1000W 80+ Platinum", "PSU", 200, 95));
        components.add(new Component("Air Cooler", "Cooling", 50, 70));
        components.add(new Component("240mm AIO", "Cooling", 100, 85));
        components.add(new Component("360mm AIO", "Cooling", 150 , 95));
    }

    public List<Component> getComponents() {
        return components;
    }

    public Component getBestComponent(String type, int budget) {
        List<Component> filteredComponents = new ArrayList<>();
        for (Component component : components) {
            if (component.getType().equals(type) && component.getPrice() <= budget) {
                filteredComponents.add(component);
            }
        }
        if (filteredComponents.isEmpty()) return null;
        return Collections.max(filteredComponents, Comparator.comparingInt(Component::getPerformance));
    }
}