/** EmployeeMain.java
 *  This is the main section of the project
 *  Andrea Jacobs 218024266
 *  16 May 2023 */

package za.ac.cput;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();

        System.out.println("Please enter details for employee 1: ");
        System.out.println("Please enter employee name: ");
        e1.setEmpName(sc.nextLine());
        System.out.println("Please enter employee surname: ");
        e1.setEmpSurname(sc.nextLine());
        System.out.println("Please enter employee number: ");
        e1.setEmpNumber(sc.nextLine());
        System.out.println("Please enter employee salary: ");
        e1.setEmpSalary(Double.parseDouble(sc.nextLine()));

        sc.nextLine();

        System.out.println("Please enter details for employee 2: ");
        System.out.println("Please enter employee name: ");
        String empName = sc.nextLine();
        System.out.println("Please enter employee surname: ");
        String empSurname = sc.nextLine();
        System.out.println("Please enter employee number: ");
        String empNumber = sc.nextLine();
        System.out.println("Please enter employee salary: ");
        double empSalary = Double.parseDouble(sc.nextLine());
        Employee e2 = new Employee(empName, empSurname, empNumber, empSalary);

        System.out.println("Employee 1: ");
        System.out.println(e1);

        System.out.println("Employee 2");
        System.out.println(e2);

        System.out.println("Please enter the salary percentage increase for employee 1: ");
        double increase10 = Double.parseDouble(sc.nextLine());
        e1.increaseSalary(increase10);

        System.out.println("Please enter the salary percentage increase for employee 2: ");
        double increase15 = Double.parseDouble(sc.nextLine());
        e2.increaseSalary(increase15);

        System.out.println("Employee 1 details after "+ increase10 + " salary increase");
        System.out.println(e1);

        System.out.println("Employee 2 details after "+ increase15 + " salary increase");
        System.out.println(e2);
    }
}