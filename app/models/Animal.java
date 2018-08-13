package models;

/**
 * Created by COM2-00-PC on 7/23/2018.
 */
public class Animal {
    private String id, type, name,color, farmname;
    private double price;

    public Animal() {
    }

    public Animal(String id, String type, String name, String color, String farmname, double price) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.color = color;
        this.farmname = farmname;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFarmname() {
        return farmname;
    }

    public void setFarmname(String farmname) {
        this.farmname = farmname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}




