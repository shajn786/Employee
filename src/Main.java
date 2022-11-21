import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int opt;

   static ArrayList<Employee> list=new ArrayList<Employee>();
    static  int id,salary,phonenumber;
    static String name,designation,email,address,comanyname;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        while(true) {
            System.out.println("Employee App");
            System.out.println("1 : Add Employee");
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






            }
        }
    }
}