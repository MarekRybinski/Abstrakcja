package Zadanie_Funkcja.PassExam;

public abstract class FinalExam {

    public enum ExamStatus {
        FAILED, PASSED
    }

    public enum ExamTime {
        FEBRUARY, MAY
    }

    private String examTime;

    private ExamStatus status;

    public FinalExam(String examTime, ExamStatus status) {
        this.examTime = examTime;
        this.status = status;
    }

    public String getExamTime() {
        return examTime;
    }

    public ExamStatus getStatus() {
        return status;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    public void setStatus(ExamStatus status) {
        this.status = status;
    }

    abstract public void examResult();

}
