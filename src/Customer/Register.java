package Customer;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register{
    public Register(String[] args) throws IOException{
        Register.main(args);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean choice=true;
        System.out.println("-------------------------Registration------------------------------");
        System.out.print("Enter your name: ");
        String name=sc.nextLine().trim();
        System.out.print("Enter your E-Mail: ");
        String email=sc.nextLine().trim();

        String phoneNumber="";
        while (choice) {
            System.out.print("Enter your Phone Number: ");
            phoneNumber=sc.nextLine().trim();
            choice = ! isValidMobileNo(phoneNumber);
            if(choice)
                System.out.println("--------Enter Valid Number!");
        }
        choice=true;
        String api="JDcHwRCt7ZoQSnyTxYrFjBeN8hqIUzgXlf0W2MOmaG4pK16k3d5gJ7fIpKrSsW6iveYhN1FbkZt42mBz";
        String message="Hey this message is for Verification of Your Phone Number by Food Odering System \nyour OTP is :";
        

        String username="";
        while(choice){
            System.out.print("Enter Username: ");
            username = sc.nextLine().trim();
            choice=getUsername(username);
        }
        choice=true;

        String password="";
        while (choice) {
            System.out.print("Enter Password: ");
            password=sc.nextLine();   
            System.out.print("Confirm Password: ");
            String confirmPassword=sc.nextLine();
            if(password.equals(confirmPassword))
                choice =false;
            else
                System.out.println("--------Password is not same ");
        }
        
        System.out.println("---------------------------Address Details---------------------------");
        System.out.print("Enter your Appartment/Flat No: ");
        String appartNo=sc.nextLine().trim();
        System.out.print("Enter your Buliding name: ");
        String bulidingName=sc.nextLine().trim();
        System.out.print("Enter your Street: ");
        String street=sc.nextLine().trim();
        System.out.print("Enter your City: ");
        String city=sc.nextLine().trim();
        System.out.print("Enter your State: ");
        String state=sc.nextLine().trim();
        System.out.print("Enter your Pincode: ");
        String pincode=sc.nextLine().trim();

        Address address=new Address(appartNo, bulidingName, street, city, state, pincode);
        Customer customer=new Customer(username, name, email, phoneNumber, address);
        saveCustomers(customer);
        loginInfo(customer);
    }

    //function to check if the mobile number is valid or not      
    public static boolean isValidMobileNo(String str)  
    {  
        //(0/91): number starts with (0/91)  
        //[7-9]: starting of the number may contain a digit between 0 to 9  
        //[0-9]: then contains digits 0 to 9  
        Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");  
        //the matcher() method creates a matcher that will match the given input against this pattern  
        Matcher match = ptrn.matcher(str);  
        //returns a boolean value  
        return (match.find() && match.group().equals(str));   
    }  

    public static void saveCustomers(Customer customer) {
        try  {
            FileWriter writer = new FileWriter("Customer.txt",true);
                writer.write(customer.toString() + "\n");
                writer.close();
        } catch (IOException e) {
            System.out.println("Error saving customer file: " + e.getMessage());
        }

    }

    public static void loginInfo(Customer customer) {
        try  {
            FileWriter writer = new FileWriter("LoginInfo.txt",true);
                writer.write(customer.userName+","+customer.getPassword()+ "\n");
                writer.close();
        } catch (IOException e) {
            System.out.println("Error saving customer file: " + e.getMessage());
        }

    }

    public static boolean getUsername(String username) throws IOException {
        User user=new User();
        if(user.customerTabel.containsKey(username)) {
            System.out.println("---------Name Already Exist! Enter Unique Name");
            return true;
    }
        else return false;
    }
}
