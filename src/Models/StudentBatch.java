package Models;

import java.util.ArrayList;

public class StudentBatch {

    //attributes
    public ArrayList<Student> batch = new ArrayList<Student>();

    //constructors
    public StudentBatch() {

    }

    public StudentBatch(ArrayList<Student> batch) {
        this.batch = batch;
    }

    //methods
    public ArrayList<Student> getBatch() {
        return batch;
    }

    public void setBatch(ArrayList<Student> batch) {
        this.batch = batch;
    }

    public void setBatch(Student student){
        this.batch.add(student);
    }

    public int getBatchSize(){
        return batch.size();
    }

    public void add(Student student){
        this.batch.add(student);
    }
}
