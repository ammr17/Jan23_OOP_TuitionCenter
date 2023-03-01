import Models.*;

public class Main {

    public static void main(String[] args) {

        //create tuition center
        TuitionCenter TuitionKL1 = new TuitionCenter();
        TuitionKL1.setName("KL Tuition Center Jaya");
        TuitionKL1.setAddress("Lot 10", "Taman UK", "98939", "Kuala Lumpur");
        TuitionKL1.setHeadMaster("Mr Aaron");

        //create first tutor
        Tutor tutor1 = new Tutor();
        tutor1.setName("Abu", "Bakar", "Ali");
        tutor1.setAddress("56", "Taman Jaya", "36789", "Selangor");
        tutor1.setIc("781223029377");
        tutor1.setQualification("Bachelor Degree");
        tutor1.setYearsExp(10);
        tutor1.setDateJoined(12, 6, 2020);
        tutor1.setYearsInCenter(3);
        TuitionKL1.setTutors(tutor1);

        //create second tutor
        Tutor tutor2 = new Tutor();
        tutor2.setName("Siti", "Aishah", "Sofi");
        tutor2.setAddress("77", "Taman Wang", "47749", "Selangor");
        tutor2.setIc("821022023394");
        tutor2.setQualification("Masters");
        tutor2.setYearsExp(15);
        tutor2.setDateJoined(15, 1, 2021);
        tutor2.setYearsInCenter(2);
        TuitionKL1.setTutors(tutor2);

        //create first student
        Student stud1 = new Student();
        stud1.setName("Muhd", "Fakhri", "Ismet");
        stud1.setIc("050706040669");
        stud1.setAddress("33", "Taman Hutan", "44758", "Selangor");
        stud1.setYear(2023);
        stud1.setTutor(tutor1);
        stud1.setSchool("SMK KL", "Jalan Tunku", "Kuala Lumpur");
        for (int i = 0; i < 5; i++){
            stud1.setMarks((int) (Math.random()*99+1));
        }

        //create second student
        Student stud2 = new Student();
        stud2.setName("Ahmad", "Naim", "Khai");
        stud2.setIc("051123145563");
        stud2.setAddress("78", "Taman Gemilang", "44435", "Selangor");
        stud2.setYear(2022);
        stud2.setTutor(tutor2);
        stud2.setSchool("SMK Putra", "Jalan Putra", "Kuala Lumpur");
        for (int i = 0; i < 5; i++){
            stud2.setMarks((int) (Math.random()*99+1));
        }

        //create a student batch and assign stud1 and stud2
        StudentBatch klBranchBatch1 = new StudentBatch();
        klBranchBatch1.add(stud1);
        klBranchBatch1.add(stud2);
        TuitionKL1.setStudents(klBranchBatch1);

        //create tuition list and assign first tuition center
        TuitionCenterList KLBranch = new TuitionCenterList();
        KLBranch.setCenters(TuitionKL1);

        //count number of students and tutors at tuition center
        System.out.println("Number of Students in " + TuitionKL1.getName() + ": " + TuitionKL1.countStudents());
        System.out.println("Number of Tutors in " + TuitionKL1.getName() + ": " + TuitionKL1.countTutors());

        //display marks for stud1 and stud2 and calculate average
        System.out.println("\nMarks for " + stud1.getName() + ": " + stud1.getMarks());
        System.out.println("Marks for " + stud2.getName() + ": " + stud2.getMarks());
        System.out.println("\nAverage marks for " + TuitionKL1.getName() + ": " + TuitionKL1.calcAvg());

        //display max and min marks from tuition center
        System.out.println("Maximum mark for " + TuitionKL1.getName() + ": " + TuitionKL1.calcMax());
        System.out.println("Minimum mark for " + TuitionKL1.getName() + ": " + TuitionKL1.calcMin());

        //display tutors background
        System.out.println("\nBackground of tutors from " + TuitionKL1.getName() + ": " + TuitionKL1.tutorBackgrounds());

    }

}