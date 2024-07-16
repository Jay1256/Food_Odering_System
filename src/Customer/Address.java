package Customer;
public class Address {
    private String appartNo;
    private String bulidingName;
    private String city;
    private String street;
    private String state;
    private String zipCode;

    public Address(String appartNo, String bulidingName, String street, String city, String state, String zipCode) {
        this.appartNo = appartNo;
        this.bulidingName = bulidingName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getAppartNo() {
        return appartNo;
    }

    public String getBulidingName() {
        return bulidingName;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
    
    @Override
    public String toString() {
        return appartNo + ", " + bulidingName +  ", " + street +  ", " + city + ", " + state + ", " + zipCode ;
    }

    

}