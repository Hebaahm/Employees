/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeproject;

import java.util.ArrayList;


public class Depart {
   int  departnumber;
    String departname;
    ArrayList<Employee>employeelist;

    public Depart() {
    }

    public Depart(int departnumber, String departname) {
        this.departnumber = departnumber;
        this.departname = departname;
        employeelist=new ArrayList<Employee>();
    }

    public int getDepartnumber() {
        return departnumber;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartnumber(int departnumber) {
        this.departnumber = departnumber;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

   public void addemployee(Employee e)
   {
       employeelist.add(e);
       
   }
    public void removeemployee(int idx)
   {
       employeelist.remove(idx);
       
   }
    public int employeecount(){
        return employeelist.size();
    }

  public void print_employee_list(){
      for(int i =0;i<employeelist.size();i++){
          System.out.println(employeelist.get(i).GetSSN()+" "+employeelist.get(i).GetName()+" "+employeelist.get(i).getSex()); 
      }
  }
    public void print_all_details(){
        for(int i=0;i<employeelist.size();i++){
            if(employeelist.get(i) instanceof SalariedEmployee)
               ((SalariedEmployee) employeelist.get(i)).Displayalldetails();
            if(employeelist.get(i) instanceof HourlyEmployee)
             ((HourlyEmployee)employeelist.get(i)).Displayalldetails();
             if(employeelist.get(i) instanceof CommissionEmployee)  
                 ((CommissionEmployee)employeelist.get(i)).Displayalldetails();
    }
    
}
}
