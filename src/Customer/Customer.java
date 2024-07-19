package Customer;
import restaurant.*;
import java.io.IOException;

public class Customer extends Thread{
    public static final String Login = null;
    public int userId;
    public String userName;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    Address address;
    Website w;
    Order o;
    Customer(Website w,Order o){
        this.w = w;
        this.o = o;
    }

    public Customer(String userName, String name,String email, String phoneNumber, Address address) throws IOException {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userId = userId++;
        this.userName=userName;
        this.address=address;
    }
    // part of consumer producer problem
    public void run(){
        for(int i=1;i<=w.size;i++){
            try {
                w.consume(o);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    //setting password
    public void setPassword(String password) {
        this.password = password;
    }
    //returns name of customer
    public String get_Name() {
        return name;
    }
    //returns email of customer
    public String getEmail() {
        return email;
    }
    //returns PhoneNumber of customer
    public String getPhoneNumber() {
        return phoneNumber;
    }
    //returns password of customer
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return  userName + "," + name + "," + email + "," + phoneNumber + "," + address ;
    }
    
}

