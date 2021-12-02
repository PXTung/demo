package assignment_501.service;

import assignment_501.model.Course;

import java.lang.reflect.Field;
import java.util.Scanner;

public class CourseService {
    private Scanner sc = new Scanner(System.in);
    private static Course[] courses = new Course[10];
    private static int count = 0;

    public void save() {
        if (count == 10) {
            System.out.println("LIST COURSES IS FULL!!!");
        } else {
            System.out.println("INPUT COURSE INFORMATION!!!");
            Course course = new Course();
            course.input(sc);
            courses[count++] = course;
        }
    }

    public void displayAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(courses[count]);
        }
    }

    public void findCourseByAttribute() {

    }
}
