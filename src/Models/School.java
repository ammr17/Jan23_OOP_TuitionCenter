package Models;

public class School {

    //attributes
    private String name;
    private String address1;
    private String address2;

    //constructors
    public School() {

    }

    public School(String name, String address1, String address2) {
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
    }

    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Override
    public String toString() {
        return name + ',' + address1 + ',' + address2;
    }
}
