package model;

public class Location {
    private String state;
    private String city;
    private String address;
    private int pincode;

    public Location(String state, String city, String address, int pincode) {
        this.state = state;
        this.city = city;
        this.address = address;
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public int getPincode() {
        return pincode;
    }
}
