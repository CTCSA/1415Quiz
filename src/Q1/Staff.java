package Q1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ckc
 */
public class Staff {
 public final static int SENIOR = 0;
 public final static int JUNIOR = 1;
 private String staffID;
 private int type;
 private String name;
 public Staff(String staffID, String name, int type) {
 this.staffID = staffID;
 this.name = name;
 this.type = type;
 }
 public String getStaffID() {
 return staffID;
 }
 public String getName() {
 return name;
 }
 public int getType() {
 return type;
 }
}
