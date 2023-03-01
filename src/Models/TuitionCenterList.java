package Models;

import java.util.ArrayList;

public class TuitionCenterList {

    //attributes
    private ArrayList<TuitionCenter> centers = new ArrayList<TuitionCenter>();

    //constructors
    public TuitionCenterList() {

    }

    public TuitionCenterList(ArrayList<TuitionCenter> centers) {
        this.centers = centers;
    }

    //methods
    public void setCenters(ArrayList<TuitionCenter> centers) {
        this.centers = centers;
    }

    public void setCenters(TuitionCenter center){
        this.centers.add(center);
    }

    public void getCenters(){
        String names[] = new String[centers.size()];

        for (int i = 0; i < centers.size(); i++){
            System.out.println(centers.get(i).getName());
        }
    }

}
