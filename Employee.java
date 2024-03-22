/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeproject;

enum Gender{Male,Female};


public abstract class Employee {
    String Name;
    int SSN;
    String Adress;
    Gender sex;

    public Employee() {
    }

    public Employee(String Name, int SSN, String Adress, Gender sex) {
        this.Name = Name;
        this.SSN = SSN;
        this.Adress = Adress;
        this.sex = sex;
    }

   public void SetName(String name){
       Name=name;
       
   }
    public void SetSSN(int ssn){
        SSN=ssn;
    }
    public String GetName(){
        return Name;
    }
    public int GetSSN(){
        return SSN;
        
    }

    public Gender getSex() {
        return sex;
    }
    
    public  abstract double Earning();

    @Override
    public String toString() {
        return "Employee{" + "Name=" + Name + ", SSN=" + SSN + ", Adress=" + Adress + ", sex=" + sex + '}';
    }
    
}
