package assignment_501.model;

import assignment_501.util.ValidateUtil;

import java.util.Scanner;

public class Course {
    private static final String[] STATUS = {"ACTIVE", "IN-ACTIVE"};
    private static final String[] FLAG = {"OPTIONAL", "MANDATORY", "N/A"};

    private String courseCode;
    private String courseName;
    private double duration;
    private String status;
    private String flag;

    public Course() {
    }

    public Course(String courseCode, String courseName, double duration, String status, String flag) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.duration = duration;
        this.status = status;
        this.flag = flag;
    }

    public void input(Scanner sc) {
        System.out.println("INPUT COURSE CODE - FORMAT FWXXX: ");
        this.courseCode = ValidateUtil.getInstance().validCourseCode();
        System.out.println("INPUT COURSE NAME: ");
        this.courseName = sc.nextLine();
        System.out.println("INPUT DURATION: ");
        this.duration = ValidateUtil.getInstance().validDuration();
        System.out.println("INPUT STATUS: ");
        System.out.println("1. ACTIVE\n2. IN-ACTIVE");
        this.status = STATUS[ValidateUtil.getInstance().validOption("STATUS", 1, 2) - 1];
        System.out.println("INPUT FLAG: ");
        System.out.println("1. OPTIONAL\n2. MANDATORY\n3. N/A");
        this.flag = FLAG[ValidateUtil.getInstance().validOption("FLAG", 1, 3) - 1];
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}
