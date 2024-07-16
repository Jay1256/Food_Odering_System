package Customer;

import java.io.IOException;

public class Customer{
    public static final String Login = null;
    public int userId;
    public String userName;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    Address address;

    public Customer(String userName, String name,String email, String phoneNumber, Address address) throws IOException {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userId = userId++;
        this.userName=userName;
        this.address=address;
    }
    //setting password
    public void setPassword(String password) {
        this.password = password;
    }
    //returns name of customer
    public String getName() {
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

