/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeproject;


public class SalariedEmployee extends Employee implements Displyable{
    double Salary;
    double Bonus;
    double Deduction;

    public SalariedEmployee() {
    }

    public SalariedEmployee(double Salary, double Bonus, double Deduction, String Name, int SSN, String Adress, Gender sex) {
        super(Name, SSN, Adress, sex);
        this.Salary = Salary;
        this.Bonus = Bonus;
        this.Deduction = Deduction;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }

    public void setDeduction(double Deduction) {
        this.Deduction = Deduction;
    }

    public double getSalary() {
        return Salary;
    }

    public double getBonus() {
        return Bonus;
    }

    public double getDeduction() {
        return Deduction;
    }
    
    @Override
     public  double Earning(){
         return (Salary+Bonus-Deduction);
     }
     @Override
      public void Displayalldetails(){
          System.out.println(super.toString());
          System.out.println(toString());
      }
      @Override
       public void displayEarnings(){
           System.out.println(Earning());
           
       }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "Salary=" + Salary + ", Bonus=" + Bonus + ", Deduction=" + Deduction + '}';
    }
       
}
