/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinginvestor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author srodgro
 */
public class Business {

    private String type;
    private String name;
    private int price;
    private List<Employee> employees;
    private List<Machinery> machinery;
    private List<Location> locations;
    private List<Product> products;
    private String design;
    private int quality;
    private String skill;

    public Business(String type, String name, int price) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.employees = new ArrayList<>();
        this.machinery = new ArrayList<>();
        this.locations = new ArrayList<>();
        this.products = new ArrayList<>();
        this.design = "basic";
    }

    public int sell(int quality, int demand, int price) {
        return quality * demand * price;
    }

    public void invest(int amount, int cost) {
        machinery.add(new Machinery(amount));
        this.price += cost;
    }

    public void hire(Employee employee) {
        employees.add(employee);
        this.price += employee.getSalary();
    }

    public void expand(Location location) {
        locations.add(location);
        this.price += location.getCost();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void changeDesign(String design) {
        this.design = design;
    }

    public void getLoan(int amount, double interestRate) {
        this.price += amount + (amount * interestRate);
    }

    public String getType() {
        return type;
    }

    public List<Location> getLocation() {
        return locations;
    }

    public String getName() {
        return name;
    }

    public int getQuality() {
        return quality;
    }

    public int getPrice() {
        return price;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
