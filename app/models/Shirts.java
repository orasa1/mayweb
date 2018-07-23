package models;

/**
 * Created by COM2-02-PC on 7/9/2018.
 */
public class Shirts {
    private String id,name,logo,col;
    private double price ,num;



    public Shirts(){

    }

    public Shirts(String id, String name, String logo, String col, double price, double num) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.col = col;
        this.price = price;
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
}
