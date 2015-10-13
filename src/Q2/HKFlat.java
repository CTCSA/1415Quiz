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
public class HKFlat implements Flat {
private String address;
private double price;
private double areaInSqFoot; // in square foot
public HKFlat(String address, double price, double area) {
this.address=address;
this.price=price;
this.areaInSqFoot = area;
}
public String getAddress() { return address; }
public double getPrice() { return price; }
// get area in square foot
public double getAreaInSqFoot() { return areaInSqFoot;}
}
