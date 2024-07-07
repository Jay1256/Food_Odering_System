package Customer;

public class Customer{
    public int userId;
    public String userName;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    Address address;

    public Customer(String name, String email, String phoneNumber, String password,Address address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userId = userId++;
        this.userName=createUserName();
        this.password=password;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    // for testing is it Working or Not 
    //Later Will Give option to Enter username or Auto Generate
    public String createUserName() {
        return name + email.substring(email.indexOf('@') + 1);
    }
    //Just For  Testing Gonna Update it
    @Override
    public String toString() {
        return "Customer [userName=" + userName + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
                + ", password=" + password + ", address=" + address + "]";
    }
    
}

