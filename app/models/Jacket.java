package models;

/**
 * Created by COM2-02-PC on 8/13/2018.
 */
public class Jacket extends Shirts {

    private String hood,thick,leather;
    private double bag;

    public Jacket() {
    }

    public Jacket(String hood, String thick, String leather, double bag) {
        this.hood = hood;
        this.thick = thick;
        this.leather = leather;
        this.bag = bag;
    }

    public String getHood() {
        return hood;
    }

    public void setHood(String hood) {
        this.hood = hood;
    }

    public String getThick() {
        return thick;
    }

    public void setThick(String thick) {
        this.thick = thick;
    }

    public String getLeather() {
        return leather;
    }

    public void setLeather(String leather) {
        this.leather = leather;
    }

    public double getBag() {
        return bag;
    }

    public void setBag(double bag) {
        this.bag = bag;
    }
}
