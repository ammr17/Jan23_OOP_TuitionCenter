package Models;

import java.util.ArrayList;

public class TuitionCenter {

    //attributes
    private String name;
    private Address address = new Address();
    private String headMaster;
    private ArrayList<Tutor> tutors = new ArrayList<Tutor>();
    private StudentBatch batch = new StudentBatch();

    //constructors
    public TuitionCenter() {

    }

    public TuitionCenter(String name, Address address, String headMaster, ArrayList<Tutor> tutors, StudentBatch batch) {
        this.name = name;
        this.address = address;
        this.headMaster = headMaster;
        this.tutors = tutors;
        this.batch = batch;
    }

    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getHeadMaster() {
        return headMaster;
    }

    public void setHeadMaster(String headMaster) {
        this.headMaster = headMaster;
    }

    public ArrayList<Tutor> getTutors() {
        return tutors;
    }

    public void setTutors(ArrayList<Tutor> tutors) {
        this.tutors = tutors;
    }

    public void setTutors(Tutor tutor){
        this.tutors.add(tutor);
    }

    public StudentBatch getStudents() {
        return batch;
    }

    public void setStudents(StudentBatch batch) {
        this.batch = batch;
    }

    public int countTutors(){
        return tutors.size();
    }

    public int countStudents(){
        return  batch.getBatchSize();
    }

    public float calcAvg(){

        float totalAll = 0f;

        for (int i = 0; i < batch.getBatchSize(); i++){

            float indAvg;

            indAvg = batch.getBatch().get(i).calcTotalMarks() / batch.getBatch().get(i).getMarksSize();

            totalAll += indAvg;

        }

        float average = totalAll / batch.getBatchSize();

        return average;
    }

    public float calcMax(){
        float max = this.batch.getBatch().get(0).getMarks(0);

        for (int i = 0; i < batch.getBatch().size(); i++){

            for (int j = 0; j < batch.getBatch().get(i).getMarksSize(); j++){
                if (batch.getBatch().get(i).getMarks(j) > max){
                    max = batch.getBatch().get(i).getMarks(j);
                }
            }

        }

        return max;
    }

    public float calcMin(){
        float min = this.batch.getBatch().get(0).getMarks(0);

        for (int i = 0; i < batch.getBatch().size(); i++){

            for (int j = 0; j < batch.getBatch().get(i).getMarksSize(); j++){
                if (batch.getBatch().get(i).getMarks(j) < min){
                    min = batch.getBatch().get(i).getMarks(j);
                }
            }
        }

        return min;
    }

    public ArrayList<String> tutorBackgrounds(){
        ArrayList<String> backgroundSummary = new ArrayList<String>();

        for (int i = 0; i < tutors.size(); i ++){
            backgroundSummary.add(tutors.get(i).getQualification());
        }

        return backgroundSummary;
    }
}
