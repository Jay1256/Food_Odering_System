package Customer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;
public class User {
    static Hashtable<String,Customer> customerTabel=new Hashtable<>();
    static Hashtable<String,String> customerLoginInfo=new Hashtable<>();
    public static void main(String[] args) throws IOException {
        loadCustomerInfo();
        loadLoginInfo();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1. Login In\n2. Sign Up\n0.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Login login=new Login(args);
                    return;
                case 2:
                    Register register=new Register(args);
                    return;
                case 0:
                    System.out.println("Thank You!, For Using Food Odering System");
                    return;
                default:
                    System.out.println("Enter Valid Choice");
                    System.out.println();
                    break;
            }
        }
    }

    public static void loadCustomerInfo() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("P:\\Food_Odering_System\\Customer.txt"));
            String line=reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data=line.split(",");
                Address address=new Address(data[4],data[5], data[6], data[7], data[8], data[9]);
                Customer customer=new Customer(data[0],data[1],data[2],data[3],address);
                customerTabel.put(data[0],customer);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file!");
            e.printStackTrace();
        }
    }

    public static void loadLoginInfo() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("P:\\Food_Odering_System\\LoginInfo.txt"));
            String line=reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data=line.split(",");
                customerLoginInfo.put(data[0],data[1]);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file!");
            e.printStackTrace();
        }
    }
}


