/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeproject;


public class CommissionEmployee extends Employee implements Displyable{
    double Gross_Sale;
    double Commission_rate;

    public CommissionEmployee() {
    }

    public CommissionEmployee(double Gross_Sale, double Commission_rate, String Name, int SSN, String Adress, Gender sex) {
        super(Name, SSN, Adress, sex);
        this.Gross_Sale = Gross_Sale;
        this.Commission_rate = Commission_rate;
    }

    public void setGross_Sale(double Gross_Sale) {
        this.Gross_Sale = Gross_Sale;
    }

    public void setCommission_rate(double Commission_rate) {
        this.Commission_rate = Commission_rate;
    }

    public double getGross_Sale() {
        return Gross_Sale;
    }

    public double getCommission_rate() {
        return Commission_rate;
    }
@Override 
public  double Earning(){
    return  Gross_Sale*Commission_rate;
    
}
  @Override
  public void Displayalldetails(){
      System.out.println(  super.toString());
      System.out.println(toString());
  }

  
    @Override
    public String toString() {
        return "CommissionEmployee{" + "Gross_Sale=" + Gross_Sale + ", Commission_rate=" + Commission_rate + '}';
    }
    @Override
     public void displayEarnings(){
         System.out.println(Earning());
     }
    
}
