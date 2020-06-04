package StructuredClass;

public class Employee {

    public static String whoIsThis="Office employee";



    private String name;
    private int age;
    private String designation;
    private double salary;


    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void printEmployee() {
        System.out.println( showEmployeeName());
        System.out.println( showEmployeeAge());
        System.out.println( showEmployeeDes());
        System.out.println( showEmployeeSalary());
    }

    private String showEmployeeName(){
        //..
        return "Name:"+name;
    }

    private String showEmployeeAge(){
        //..
        return "Age:" +age;
    }


    private String showEmployeeDes(){
        //..
        return "Designation:" +designation;
    }

    private String showEmployeeSalary(){
        //..
        return "Salary:" +salary;
    }


}