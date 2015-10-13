/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author ckc
 */
public class Apartment {
    private String address;
private double price;
private double areaInSqMeter; // in square meter
public Apartment(String address, double price, double area) {
this.address=address;
this.price=price;
this.areaInSqMeter = area;
}
public String getAddress() { return address; }
public double getPrice() { return price; }
// get area in square meter
public double getAreaInSqMeter() { return areaInSqMeter;}
}
