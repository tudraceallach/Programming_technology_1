package file3;
import java.util.Calendar;

public class Product {

    private String name;
    private double cost;
    private int year;
    private String manufacturer;

    public Product() {
        name = "";
        cost = 0;
        year = 0;
        manufacturer = "";
    }

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
        this.year = Calendar.getInstance().get(Calendar.YEAR);
        manufacturer = "";
    }

    public Product(String name, double cost, int year) {
        this.name = name;
        this.cost = cost;
        this.year = year;
        manufacturer = "";
    }

    public Product(String name, int cost, int year, String manufacturer) {
        this.name = name;
        this.cost = cost;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public int productAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }

    public void increasePrice() {
        if (productAge() == 0) {
            cost += cost * 0.2;
        }
    }

    public double usdCost() {
        double usd = 63.0;
        return cost / usd;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void getInfo() {
        System.out.printf("Название: %s\nЦена: %.2f\nГод: %d\nИзготовитель: %s\n\n", name, cost, year, manufacturer);
    }
}
