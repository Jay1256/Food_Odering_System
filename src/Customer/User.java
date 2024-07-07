package Customer;
import java.util.*;

class Login{
    public Login(String[] args){
        Login.main(args);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username=sc.nextLine();
        System.out.print("Enter Password: ");
        String password=sc.nextLine();
    }
    // Verfication Pending From HashTable
}

class Register{
    public Register(String[] args){
        Register.main(args);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        while(true){
            System.out.print("Enter User Name: ");
            String username=sc.nextLine();
            break;
        }
        //Work In Progress
    }
}
public class User {
    public static void main(String[] args) {
        Hashtable<String,Customer> customerTabel;
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
}


