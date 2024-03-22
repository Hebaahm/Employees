/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeproject;


public class HourlyEmployee extends Employee implements Displyable {
    double HoureRate;
    int Number_of_hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(double HoureRate, int Number_of_hours, String Name, int SSN, String Adress, Gender sex) {
        super(Name, SSN, Adress, sex);
        this.HoureRate = HoureRate;
        this.Number_of_hours = Number_of_hours;
    }

    public void setHoureRate(double HoureRate) {
        this.HoureRate = HoureRate;
    }

    public void setNumber_of_hours(int Number_of_hours) {
        this.Number_of_hours = Number_of_hours;
    }

    public double getHoureRate() {
        return HoureRate;
    }

    public int getNumber_of_hours() {
        return Number_of_hours;
    }
    @Override
    public   double Earning(){
        return (HoureRate*Number_of_hours);
        
    }
    public void Displayalldetails()
    {
        System.out.println( super.toString());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "HoureRate=" + HoureRate + ", Number_of_hours=" + Number_of_hours + '}';
    }
    
    public void displayEarnings()
            
    {
        System.out.println(Earning());
    }
    
    
}
