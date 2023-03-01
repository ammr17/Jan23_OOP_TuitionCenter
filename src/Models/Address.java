package Models;

public class Address {

    //attributes
    private String unit;
    private String street;
    private String postcode;
    private String state;

    //constructors
    public Address() {
    }

    public Address(String unit, String street, String postcode, String state) {
        this.unit = unit;
        this.street = street;
        this.postcode = postcode;
        this.state = state;
    }

    //methods
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return unit + ' ' + street + ' ' + postcode + ' ' + state;
    }
}
