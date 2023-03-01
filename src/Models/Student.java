package Models;

import java.util.ArrayList;

public class Student {

    //attributes
    private Name name = new Name();
    private String ic;
    private Address address = new Address();
    private int year;
    private Tutor tutor = new Tutor();
    private School school = new School();
    public ArrayList<Float> marks = new ArrayList<Float>();

    //constructors
    public Student() {

    }

    public Student(Name name, String ic, Address address, int year, Tutor tutor, School school, ArrayList<Float> marks) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.year = year;
        this.tutor = tutor;
        this.school = school;
        this.marks = marks;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setSchool(String name, String address1, String address2){
        this.school.setName(name);
        this.school.setAddress1(address1);
        this.school.setAddress2(address2);
    }

    public ArrayList<Float> getMarks() {
        return marks;
    }

    public float getMarks(int i){
        return marks.get(i);
    }

    public void setMarks(ArrayList<Float> marks) {
        this.marks = marks;
    }

    public void setMarks(float mark){
        this.marks.add(mark);
    }

    public int getMarksSize(){
        return marks.size();
    }

    public float calcTotalMarks(){
        float total = 0f;

        for (int i = 0; i < marks.size(); i++){
            total += marks.get(i);
        }

        return total;
    }
}
