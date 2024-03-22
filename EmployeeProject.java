/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeproject;


public class EmployeeProject {

    public static void main(String[] args) {
        
        Depart d1=new Depart(1,"counting");
        SalariedEmployee s1=new SalariedEmployee(2000,500,50,"Ahmed",1200,"Egypt",Gender.Male);
        d1.addemployee(s1);
        HourlyEmployee H1 =new HourlyEmployee(100,6,"Mohammed",1200,"Riadh",Gender.Male);
        d1.addemployee(H1);
        CommissionEmployee c1 =new CommissionEmployee(15000,0.25,"Heba",1200,"Egypt",Gender.Female);
        d1.addemployee(c1);
        
        System.out.println(d1.employeecount());
        d1.print_employee_list();
        d1.print_all_details();
    }
}
