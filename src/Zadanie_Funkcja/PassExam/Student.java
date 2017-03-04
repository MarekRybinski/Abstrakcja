package Zadanie_Funkcja.PassExam;


public class Student extends FinalExam{

    public Student(String examTime, ExamStatus status) {
        super(examTime, status);
    }

    @Override
    public void examResult() {
        String student = "Student 1";
        String  studentresult= "85%";

        System.out.println("To jest student: "+ student + " z wynikiem: " + studentresult +" o godzinie:: "+ getExamTime());
    }


}
