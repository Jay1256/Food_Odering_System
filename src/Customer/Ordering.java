package Customer;
import java.util.*;

public class Ordering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.==>To Search by Food");
            System.out.println("2.==>To Search by Restaurant");
            System.out.println("3.==>For Tracking Order");
            System.out.println("4.==>To View Profile");
            System.out.println("0.==>For Exit");
            System.out.println("<----ENTER YOUR CHOICE---->");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your food Name");
                    //Pending
                    break;
                case 2 :
                    System.out.println("Enter Restaurant Name");
                    //Pending
                    break;
                case 3 :
                    System.out.println("Enter your order id");
                    //Pending
                    break;
                case 4 :
                    while (true) {
                        System.out.println("1.->To update profile");
                        System.out.println("2.->To see Your Order History");
                        System.out.println("0.->To Exit Profile");
                        System.out.println("<=== Enter Your choice ===>");
                        int choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1 :
                                //ask profile name or id
                                break;
                            case 2 :
                                System.out.println("Your Past Orders");
                                break;
                            case 0 :
                                System.out.println("<==== Profile Exited ====>");    
                                break;
                            default: System.out.println("Enter Valid Choice");
                                break;
                        }
                        if(choice1 == 0){
                            break;
                        }
                    }
                    break;
                case 0 :
                System.out.println("<-------------Thank You \t Visit Again------------->");
                    return;
                default: System.out.println("Enter Valid Choice");
                    break;
            }
        }
    }
}
