import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static int opt;
     static Employee w;

   static ArrayList<Employee> list=new ArrayList<Employee>();
    static  int id,salary,phonenumber;
    static String name,designation,email,address,comanyname;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        while(true) {
            System.out.println("Employee App");
            System.out.println("1 : Add Employee\n" +
                    "2 : View Employee\n" +
                    "3 : Search the employee\n" +
                    "4 : Delete the employee");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("enter the empcode");
                    id = sc.nextInt();
                    System.out.println("enter the empname");
                    name = sc.next();
                    System.out.println("enter the designation");
                    designation = sc.next();
                    System.out.println("enter the salary");
                    salary = sc.nextInt();
                    System.out.println("enter the company name");
                    comanyname = sc.next();

                    System.out.println("Enter the Phone number");
                    phonenumber = sc.nextInt();
                    System.out.println("enter the email");
                    email = sc.next();
                    System.out.println("enter the address");
                    address = sc.next();

                    list.add(new Employee(id, name, designation, salary, comanyname, phonenumber, email, address));
                    break;

                case 2:

                    System.out.println("Employee List");
                    for(Employee e : list)
                    {
                        System.out.println("Employee Id :"+e.empcode);
                        System.out.println("Employee Name :"+e.empname);
                        System.out.println("Designataion :"+e.designation);
                        System.out.println("Compnay Name"+e.companyname);
                        System.out.println("Salary"+e.salary);
                        System.out.println("Phone Nmber"+e.phonenumber);
                        System.out.println("Email :"+e.email);
                        System.out.println("Address :"+e.address);
                    }
                             break;

                case 3:

                    System.out.println("enter the id");
                    int id = sc.nextInt();

                    for(Employee e : list)
                    {
                        if(id == e.empcode)
                        {
                            System.out.println("Employee Name :"+e.empname);
                            System.out.println("Designataion :"+e.designation);
                            System.out.println("Compnay Name"+e.companyname);
                            System.out.println("Salary"+e.salary);
                            System.out.println("Phone Nmber"+e.phonenumber);
                            System.out.println("Email :"+e.email);
                            System.out.println("Address :"+e.address);
                        }
                    }
                    break;

                case 4:

                    System.out.println("enter the id");
                    int idd = sc.nextInt();


                    for(Employee e : list)
                    {
                        if(idd == e.empcode)
                        {
                            w =e;

                        }

                    }
                        list.remove(w);


            }
        }
    }
}