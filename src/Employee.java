public class Employee {

    int empcode,salary,phonenumber;
    String empname,designation,companyname,address,email;

    public Employee(int empcode,String empname,String designation,int salary, String companyname,int phonenumber,String email,String address)
    {
        this.empcode =empcode;
        this.empname = empname;
        this.designation= designation;
        this.salary =salary;
        this.companyname = companyname;
        this.phonenumber = phonenumber;
        this.email = email;
        this.address = address;
    }

    public int getEmpcode() {
        return empcode;
    }

    public int getSalary() {
        return salary;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public String getEmpname() {
        return empname;
    }

    public String getDesignation() {
        return designation;
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
