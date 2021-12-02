package assignment_501.util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUtil {
    private static ValidateUtil instance;
    private Scanner sc = new Scanner(System.in);

    public static ValidateUtil getInstance() {
        if (instance == null) {
            instance = new ValidateUtil();
        }

        return instance;
    }


    public String validCourseCode() {
        String courseCode = sc.nextLine();
        if (Pattern.compile("^FW\\d{3}$").matcher(courseCode).find()) {
            return courseCode;
        } else {
            System.out.println("INCORRECT COURSE CODE!!!");
            return validCourseCode();
        }
    }

    public double validDuration() {
        if (sc.hasNextInt()) {
            double duration = sc.nextDouble();
            sc.nextLine();
            return duration;
        }

        sc.nextLine();
        System.out.println("INCORRECT DURATION!!!");
        return validDuration();
    }

    public int validOption(String type, int min, int max) {
        if (sc.hasNextInt()) {
            int option = sc.nextInt();
            if (option >= min && option <= max) {
                sc.nextLine();
                return option;
            }
        }

        sc.nextLine();
        System.out.println("INCORRECT " + type + " !!!");
        return validOption(type, min, max);
    }
}
