package oopIntro;

public class Course {

    private String courseName;
    private String coursePrice;
    private String instructor;

    public Course() {
    }

    public Course(String courseName, String coursePrice, String instructor) {
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}