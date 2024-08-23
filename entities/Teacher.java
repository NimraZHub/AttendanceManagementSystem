
package entities;

public class Teacher {
    private String u_name;
    private String password;
    private String name;
    private String empCode;  // Primary key
    private double salary;
    private String department;
    private String address;
    private String phoneNumber;

    // Constructor
     public Teacher(){
    
    }
    public Teacher(String u_name, String password,String name, String empCode, double salary, String department, String address, String phoneNumber) {
        this.u_name = u_name;
        this.password = password;
        this.name = name;
        this.empCode = empCode;
        this.salary = salary;
        this.department = department;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    // Getters and Setters
    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}
