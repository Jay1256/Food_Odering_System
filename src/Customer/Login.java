package Customer;
import java.io.IOException;
import java.util.*;

public class Login{
    public Login(String[] args) throws IOException{
        Login.main(args);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean choice =true;
        while(choice){
            System.out.print("Enter Username: ");
            String username=sc.nextLine();
            choice=hasUsername(username);
        }
        choice=true;
        while(choice){
            System.out.print("Enter Password: ");
            String password=sc.nextLine();
            choice=chechPassword(password);
        }
    }
    
    public static boolean hasUsername(String username) throws IOException{
        User user=new User();
        if(user.customerTabel.containsKey(username)){
            return false;
        }
        else{
            System.out.println("Username does not Exists.");
            return true;
        }
    }

    public static boolean chechPassword(String password) throws IOException{
        User user=new User();
        Hashtable ht=user.customerLoginInfo;
        Set<String> setOfKeys = ht.keySet();
        for (String key : setOfKeys) {
            if(ht.get(key).equals(password)){
                return false;
            }
        }
        System.out.println("Wrong Password!");
        return true;
    }
}

