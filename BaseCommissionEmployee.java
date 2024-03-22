/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeproject;


public class BaseCommissionEmployee extends CommissionEmployee  {
    double Base;

    public BaseCommissionEmployee() {
    }

    public BaseCommissionEmployee(double Base, double Gross_Sale, double Commission_rate, String Name, int SSN, String Adress, Gender sex) {
        super(Gross_Sale, Commission_rate, Name, SSN, Adress, sex);
        this.Base = Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getBase() {
        return Base;
    }

  @Override 
   public   double Earning(){
        return Base+super.Earning();
        
    }
   @Override
  public void Displayalldetails(){
      super.Displayalldetails();
       System.out.println(toString());
  }
  public void displayEarnings()
            
    {
        System.out.println(Earning());
    }

    @Override
    public String toString() {
        return "BaseCommissionEmployee{" + "Base=" + Base + '}';
    }
    
}
