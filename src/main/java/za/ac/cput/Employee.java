/** Employee.java
 *  This is the worker class
 *  Andrea Jacobs 218024266
 *  16 May 2023 */

package za.ac.cput;

public class Employee {
    private String empName;
    private String empSurname;
    private String empNumber;
    private double empSalary;

    public Employee() {}

    public Employee(String empName, String empSurname, String empNumber, double empSalary) {
        this.empName = empName;
        this.empSurname = empSurname;
        this.empNumber = empNumber;
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public void increaseSalary(double amt) {
        empSalary *= (1 + (amt / 100));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empSurname='" + empSurname + '\'' +
                ", empNumber='" + empNumber + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
