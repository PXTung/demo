package assignment_501.view;

import assignment_501.util.ValidateUtil;

public class MenuUtil {
    private static MenuUtil instance;

    public static MenuUtil getInstance() {
        if (instance == null) {
            instance = new MenuUtil();
        }
        return instance;
    }

    public int mainMenu() {
        System.out.println("--------MAIN MENU-----------");
        System.out.println("1. CREATE A NEW COURSE");
        System.out.println("2. DISPLAY ALL COURSE");
        System.out.println("3. FIND COURSE BY ATTRIBUTE");
        System.out.println("4. DISPLAY ALL MANDATORY COURSE");
        System.out.println("0. EXIT");

        return ValidateUtil.getInstance().validOption("MENU", 0, 4);
    }
}
