package assignment_501.controller;

import assignment_501.model.Course;
import assignment_501.service.CourseService;
import assignment_501.view.MenuUtil;

import java.util.Scanner;

public class Main {
    private static final CourseService courseService = new CourseService();

    public static void main(String[] args) throws IllegalAccessException {
        int menu;

        do {
            menu = MenuUtil.getInstance().mainMenu();

            switch (menu) {
                case 0:
                    break;
                case 1:
                    courseService.save();
                    break;
                case 2:
                    courseService.displayAll();
                    break;
                case 3:
                    courseService.findCourseByAttribute();
                    break;
                case 4:
                    break;
            }
        } while (menu != 0);
    }
}
