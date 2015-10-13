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
public class Payroll {
 public static void printPaySlip(Staff staff, int numOfHour){
 double payPerHour = 0.0;
 double salary = 0;
 final int regularWorkingHour = 42;

 if (staff.getType() == Staff.SENIOR) {
 payPerHour = 55;
 double extraPay =
 numOfHour > regularWorkingHour? 50 : 0;
 salary = numOfHour * payPerHour + extraPay;
 } else if (staff.getType() == Staff.JUNIOR) {
 payPerHour = 34;
 int extraHour = (numOfHour - regularWorkingHour) < 0 ? 0 :
 numOfHour - regularWorkingHour;
 salary = payPerHour * numOfHour
 + extraHour * payPerHour * 0.2;
 }
 System.out.println("\nThe salary for "
 + staff.getName()
+ "("+staff.getStaffID()+") is "
+ salary+".");
 System.out.println("Number Of Working hour:" + numOfHour);
 }
 public static void main(String arg[]) {
 Staff john = new Staff("S101", "John", Staff.JUNIOR);
 printPaySlip(john, 44);
 Staff peter = new Staff("S053", "Peter", Staff.SENIOR);
 printPaySlip(peter, 45);
 } 
}
