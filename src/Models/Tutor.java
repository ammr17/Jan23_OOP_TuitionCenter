package Models;

public class Tutor {

    //attributes
    private Name name = new Name();
    private String ic;
    private Address address = new Address();
    private String qualification;
    private int yearsExp;
    private Date dateJoined = new Date();
    private int yearsInCenter;

    //constructors
    public Tutor() {

    }

    public Tutor(Name name, String ic, Address address, String qualification, int yearsExp, Date dateJoined, int yearsInCenter) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.qualification = qualification;
        this.yearsExp = yearsExp;
        this.dateJoined = dateJoined;
        this.yearsInCenter = yearsInCenter;
    }

    //methods
    public String getName() {
        return name.toString();
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setName(String fName, String mName, String lName){
        this.name.setfName(fName);
        this.name.setmName(mName);
        this.name.setlName(lName);
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getAddress() {
        return address.toString();
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAddress(String unit, String street, String postcode, String state){
        this.address.setUnit(unit);
        this.address.setStreet(street);
        this.address.setPostcode(postcode);
        this.address.setState(state);
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getYearsExp() {
        return yearsExp;
    }

    public void setYearsExp(int yearsExp) {
        this.yearsExp = yearsExp;
    }

    public String getDateJoined() {
        return dateJoined.toString();
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public void setDateJoined(int day, int month, int year){
        this.dateJoined.setDay(day);
        this.dateJoined.setMonth(month);
        this.dateJoined.setYear(year);
    }

    public int getYearsInCenter() {
        return yearsInCenter;
    }

    public void setYearsInCenter(int yearsInCenter) {
        this.yearsInCenter = yearsInCenter;
    }
}
