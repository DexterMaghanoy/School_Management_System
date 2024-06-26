
import java.util.*;

public class School_Management_System {

    public static Scanner in = new Scanner(System.in).useDelimiter("\n");
    public static Scanner inn = new Scanner(System.in).useDelimiter("\n");
    public static int id, age, option, x, z = 0, y, r;
    public static long contact;
    public static String name, gender, course, Search, mname, lname, input, a, sage, sy, sx, sr, contacts, fname;
    public static boolean loop = true;

    public static List<Students> studentList = new ArrayList<>();
    public static Students students;

    private static void addNewStudents(Students students) {

        studentList.add(students);
    }

    private static void searchByName() {

        do {
            System.out.println("\n--------Search Students By Name-------- ");
            System.out.print("\nEnter First Name: ");
            name = inn.nextLine();

            while (name.isEmpty() || name.isBlank()) {
                System.out.print("\nFirst Name should not be blank!! Try again!!\n");
                System.out.print("Enter Student Name: ");
                name = inn.nextLine();
            }

            System.out.print("\nEnter Middle Name: ");
            mname = inn.nextLine();

            System.out.print("\nEnter Last Name: ");
            lname = inn.nextLine();

            while (lname.isEmpty() || lname.isBlank()) {
                System.out.print("\nLast Name should not be blank!! Try again!!\n");
                System.out.print("Enter Student Last Name: ");
                lname = inn.nextLine();

            }

            System.out.println("\n\n\n\n   -----------Student Details-----------\n");

            fname = name + " " + mname + " " + lname;
            System.out.println("Search Result(s) for: '" + fname + "'\n");

            for (Students students : studentList) {

                if (students.getMName().equalsIgnoreCase(mname) || students.getName().equalsIgnoreCase(name)
                        || students.getLName().equalsIgnoreCase(lname) || students.getName().equalsIgnoreCase(lname)
                        || students.getLName().equalsIgnoreCase(name)) {

                    System.out.println(
                            "\n     Id: " + students.getId()
                                    + "\n     Name: " + students.getName() + " " + students.getMName() + " "
                                    + students.getLName()
                                    + "\n     Gender: " + students.getGender()
                                    + "\n     Age: " + students.getAge()
                                    + "\n     Course: " + students.getCourse()
                                    + "\n     Contact: 0" + students.getContact());
                    z++;
                }
            }

            if (z == 0) {
                System.out.println("\nName not found!!!\n");

            }

            System.out.println("\n_______________________________________");
            System.out.println("\nDo you want to search other Students by Name?   [1] Yes  [2] No");
            z = 0;

            do {
                x = 0;
                try {

                    System.out.println("Enter choice: ");

                    sx = in.next();
                    x = Integer.parseInt(sx);

                    while (x != 1 && x != 2) {
                        System.out.println("\n\nInvalid Choice!!! Try Again!!!\nEnter choice: ");

                        x = in.nextInt();
                    }
                    if (x == 1) {
                        searchByName();
                    }
                    if (x == 2) {
                        mainfunction();
                    }

                    loop = false;
                } catch (Exception e) {

                    System.out.println("\n\nIncorrect input! Try Again!!!");
                    loop = true;

                }
            } while (loop);

            if (x == 1) {
                searchByName();
            }
            if (x == 2) {
                mainfunction();
            }

        } while (loop);

    }

    private static void removeStudentById() {
        do {
            try {

                System.out.println("\n----------Remove Student by Id----------");

                System.out.print("Enter ID:  ");
                id = in.nextInt();

                for (Students students : studentList) {

                    if (students.getId() == id) {

                        if (students.getId() == id) {
                            System.out.println("\nName: " + students.getName() + " " + students.getMName() + " "
                                    + students.getLName()
                                    + "\nId: " + students.getId()
                                    + "\nAge: " + students.getAge()
                                    + "\nGender: " + students.getGender()
                                    + "\nCourse: " + students.getCourse()
                                    + "\nContact Number: 0" + students.getContact() + "\n");
                            System.out.println("------------------------------");
                            System.out.println("\nAre you sure you want to remove this student? [1] Yes   [2] No");

                            do {
                                try {
                                    System.out.print("\nEnter choice:");

                                    sx = in.next();

                                    switch (sx) {
                                        case "1":

                                            studentList.remove(students);
                                            System.out.println("\n------------------------------\n\n");
                                            System.out.println("Successfully Removed Student by ID! ");
                                            System.out.println("\n_____________________________________\n\n");

                                            System.out.println(
                                                    "Do you want to remove another student by ID? [1] Yes  [2] No ");

                                            do {
                                                try {
                                                    System.out.print("\nEnter choice:  ");
                                                    sr = in.next();
                                                    r = Integer.parseInt(sr);

                                                    while (r != 1 && r != 2) {
                                                        System.out
                                                                .print("Invalid choice!! Try Again!!\nEnter choice:  ");
                                                        r = in.nextInt();
                                                    }

                                                    if (r == 1) {
                                                        removeStudentById();
                                                    } else if (r == 2) {
                                                        mainfunction();
                                                    }
                                                } catch (Exception e) {

                                                    System.out.print("Incorrect input!!! Try Again!!! ");
                                                    loop = true;
                                                }
                                            } while (loop);

                                            break;

                                        case "2":

                                            System.out.println("\n------------------------------\n\n");
                                            System.out.println("Removed Student by ID Cancelled! ");
                                            System.out.println("\n_____________________________________\n\n");

                                            System.out.println(
                                                    "Do you want to remove another student by ID? [1] Yes [2] No ");

                                            do {
                                                try {
                                                    System.out.print("\nEnter choice:  ");
                                                    sr = in.next();
                                                    r = Integer.parseInt(sr);

                                                    while (r != 1 && r != 2) {
                                                        System.out
                                                                .print("Invalid choice!! Try Again!!\nEnter choice:  ");
                                                        r = in.nextInt();
                                                    }

                                                    if (r == 1) {
                                                        removeStudentById();
                                                    } else if (r == 2) {
                                                        mainfunction();
                                                    }
                                                } catch (Exception e) {

                                                    System.out.print("Incorrect input!!! Try Again!!! ");
                                                    loop = true;
                                                }
                                            } while (loop);

                                            while (r != 1 && r != 2) {
                                                System.out.print("Invalid choice!! Try Again!!\nEnter choice:  ");
                                                r = in.nextInt();
                                            }

                                            if (r == 1) {
                                                removeStudentById();

                                            } else if (r == 2) {
                                                mainfunction();
                                            }
                                            break;

                                        default:
                                            System.out.print("Invalid input!! Try Again!!  ");
                                            loop = true;

                                            break;

                                    }
                                } catch (Exception e) {

                                    System.out.print("Invalid choice!! Try Again!!\nEnter choice:  ");
                                    loop = true;
                                    break;

                                }

                            } while (x != 1 && x != 2);
                        }
                    }

                }

                System.out.println("\n\nID not found!!!\n\n");
                System.out.println("--------------------------------------------------------");

                System.out.println("Do you want to remove another student by ID? [1] Yes  [2] No ");
                System.out.print("Enter choice:  ");
                r = in.nextInt();

                while (r != 1 && r != 2) {
                    System.out.print("Invalid choice!! Try Again!!\nEnter choice:  ");
                    r = in.nextInt();
                    loop = false;
                }

                if (r == 1) {
                    removeStudentById();
                } else if (r == 2) {
                    mainfunction();
                }

            } catch (Exception e) {

                System.out.print("\n\n\nIncorrect Input!! Try Again!!");
                in.next();
                loop = true;

            }
        } while (loop);

    }

    public static void ExistingF() {

        id = 1;
        // Long can store 10 digit easily. Long phoneNumber = 1234567890
        // The int type in Java can be used to represent any whole number from
        // -2147483648 to 2147483647.

        Students student1 = new Students(id++, "Rhon", "M", "Trazo", "Male", 19, "BSIT", 923432425);
        Students student2 = new Students(id++, "Dexter", "P", "Maghanoy", "Male", 22, "BSIT", 91584325);
        Students student3 = new Students(id++, "Althea", "D", "Dewites", "Female", 19, "BSIT", 955668049);
        Students student4 = new Students(id++, "Angelo", "D", "Castro", "Male", 19, "BSIT", 987465564);
        Students student5 = new Students(id++, "Charls", "L ", "Opiso", "Male", 19, "BSIT", 957642344);
        Students student6 = new Students(id++, "Ernest", "M ", "Carton", "Male", 19, "BSIT", 875649456);
        Students student7 = new Students(id++, "Mary", "L", "Sulilawan", "Female", 19, "BSIT", 986745764);
        Students student8 = new Students(id++, "Joel", "L", "Egama", "Male", 20, "BSIT", 987653986);
        Students student9 = new Students(id++, "Anadyl", "S", "Amidala", "Female", 20, "BSIT", 935264234);
        Students student10 = new Students(id++, "Fitz", "C", "Saarenes", "Male", 20, "BSIT", 935262654);
        Students student11 = new Students(id++, "Andrew", "R", "Panandigan", "Male", 19, "BSIT", 983765345);
        Students student12 = new Students(id++, "Serafino", "F", "Macabidar", "Male", 20, "BSIT", 948324345);
        Students student13 = new Students(id++, "Hannah", "D", "Mamugay", "Female", 19, "BSIT", 998474523);
        Students student14 = new Students(id++, "Tristan", "B", "Centes", "Female", 19, "BSIT", 976454763);
        Students student15 = new Students(id++, "James", "H", "Guimba", "Male", 19, "BSIT", 945634342);
        Students student16 = new Students(id++, "JayAnne", "N", "Aluba", "Female", 19, "BSIT", 988746242);
        Students student17 = new Students(id++, "Christian", "M", "Dela Vega", " Male", 19, "BSIT", 987463284);
        Students student18 = new Students(id++, "Joshua", "U", "Roaya", "Male", 21, "BSIT", 997382316);
        Students student19 = new Students(id++, "Joyce", "V", "Sagaral", "Male", 19, "BSIT", 907583559);
        Students student20 = new Students(id++, "Joleah", "M", "Pana", "Female", 20, "BSIT", 906321757);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        studentList.add(student11);
        studentList.add(student12);
        studentList.add(student13);
        studentList.add(student14);
        studentList.add(student15);
        studentList.add(student16);
        studentList.add(student17);
        studentList.add(student18);
        studentList.add(student19);
        studentList.add(student20);

        mainfunction();

    }

    private static void showAllStudentEnrolled() {

        System.out.println("_______________________________________");
        System.out.println("\n\n   ----------Student List-----------     ");
        for (Students students : studentList) {

            System.out.println("\n     Id: " + students.getId()
                    + "\n     Name: " + students.getName() + " " + students.getMName() + " " + students.getLName()
                    + "\n     Gender: " + students.getGender()
                    + "\n     Age: " + students.getAge()
                    + "\n     Course: " + students.getCourse()
                    + "\n     Contact Number: 0" + students.getContact());

        }
        System.out.println("_______________________________________");

        mainfunction();
    }

    public static boolean NameCheck(String name) {

        for (int x = 0; x < name.length(); x++) {
            if (Character.isDigit(name.charAt(x))) {
                return true;
            } else if (name.matches("0-9")) {
                return true;
            }

        }

        return false;

    }

    private static Students inputNewStudents() {

        do {
            for (Students students : studentList) {

                if (students.getId() == id) {

                    id++;
                    loop = true;
                } else {
                    loop = false;
                }

            }
        } while (loop);

        System.out.println("\n-----------Input New Students-----------\n");
        System.out.println("Student ID: " + id);

        System.out.print("\nEnter Student First Name: ");

        name = in.next();

        while (NameCheck(name) == true) {

            System.out.print("\nInvalid Name!! Try Again!!  ");
            System.out.print("\nEnter Student First Name: ");
            name = in.next();

        }
        while (name.isEmpty()
                || name.isBlank()) {
            System.out.print("\nName should be not blank!! Try again!!\n");
            System.out.print("\nEnter Student First Name: ");
            name = in.next();

            while (NameCheck(name) == true) {

                System.out.print("\nInvalid Name!! Try Again!!  ");
                System.out.print("\nEnter Student First Name: ");
                name = in.next();

            }

        }

        System.out.print("Enter Student Middle Name: ");

        mname = in.next();

        while (NameCheck(mname) == true) {

            System.out.print("Invalid Middle Name!! Try Again!!  ");
            System.out.print("\nEnter Student Middle Name: ");
            mname = in.next();

        }

        System.out.print("Enter Student Last Name: ");

        lname = in.next();

        while (NameCheck(lname) == true) {

            System.out.print("Invalid Name!! Try Again!!  ");
            System.out.print("\nEnter Student Last Name: ");
            lname = in.next();

        }

        while (lname.isEmpty() || lname.isBlank()) {
            System.out.print("Last Name should not be blank!! Try again!!\n");
            System.out.print("\nEnter Student Last Name: ");
            lname = in.next();
            while (NameCheck(lname) == true) {

                System.out.print("Invalid Name!! Try Again!!  ");
                System.out.print("\nEnter Student Last Name: ");
                lname = in.next();

            }

        }

        for (Students students : studentList) {

            if (students.getName().equalsIgnoreCase(name) && students.getMName().equalsIgnoreCase(mname)
                    && students.getLName().equalsIgnoreCase(lname)) {
                System.out.print("\nThe name you entered is already in the system!!! Try Again!!!\n\n");

                do {
                    try {
                        System.out.println("Do you want to add new student? [1] Yes  [2] No");
                        System.out.print("Enter choice: ");
                        sy = in.next();
                        y = Integer.parseInt(sy);

                        while (y != 1 && y != 2) {

                            System.out.println("Invalid choice!! Try Again!!");
                            System.out.print("Enter choice: ");
                            sy = in.next();
                            y = Integer.parseInt(sy);
                        }
                        if (y == 1) {
                            inputNewStudents();

                        } else if (y == 2) {

                            mainfunction();
                        }

                    } catch (Exception e) {

                        System.out.println("Invalid Input!! Try Again!!");
                        loop = true;

                    }
                } while (loop);
            }

        }

        do {
            System.out.print("Enter Student Age: ");
            
            try {
                String input = in.nextLine();

                age = Integer.parseInt(input);

                if (age < 1) {
                    System.out.println("Invalid Age. Age must be 1 or older.");
                } else {
                    System.out.println("Age: " + age);
                    break; // Exit the loop if age is valid
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        } while (true);

        System.out.print(
                "\n'Male or Female'\nEnter Student Gender: ");

        gender = in.next();

        while (!gender.equalsIgnoreCase(
                "Male") && !gender.equalsIgnoreCase("Female")) {

            System.out.println("Invalid Gender!!! Try Again!!! ");
            System.out.print("\nEnter Student Gender: ");
            gender = in.next();
        }

        System.out.print(
                "\nCourses\n[1] BSIT\n[2] BSMT\n[3] Tourism\n[4] BSEE\n[5] Nursing\n[6] Criminology\nEnter Student Course: ");

        course = in.next();

        while (!course.equals(
                "1") && !course.equals("2") && !course.equals("3") && !course.equals("4") && !course.equals("5")
                && !course.equals("6")) {
            System.out.println("Invalid choice!! Try Again!!");
            System.out.print("Enter course: ");
            course = in.next();
        }

        if (course.equals(
                "1")) {
            course = "BSIT";
        }

        if (course.equals(
                "2")) {
            course = "BSMT";
        }

        if (course.equals(
                "3")) {
            course = "Tourism";
        }

        if (course.equals(
                "4")) {
            course = "BSEE";
        }

        if (course.equals(
                "5")) {
            course = "Nursing";
        }

        if (course.equals(
                "6")) {
            course = "Criminology";
        }

        do {
            try {
                System.out.println("\nEnter Student Contact number: ");
                // 2147483647
                contact = in.nextLong();
                // contact = Long.parseLong(contacts);

                loop = false;
            } catch (Exception e) {

                System.out.println("\n\nIncorrect Contact Number! Try Again!!!");
                loop = true;

            }

        } while (loop);

        Students students = new Students(id, name, mname, lname, gender, age, course, contact);

        System.out.println(
                "\n_______________________________________\n"
                        + "\n\n     STUDENT SUCCESSFULY ADDED!\n"
                        + "\n     Id: " + students.getId()
                        + "\n     Name: " + students.getName() + " " + students.getMName() + " " + students.getLName()
                        + "\n     Gender: " + students.getGender()
                        + "\n     Age: " + students.getAge()
                        + "\n     Course: " + students.getCourse()
                        + "\n     Contact: 0" + students.getContact() + "\n_______________________________________");

        id++;
        do {
            try {
                System.out.println("Do you want to add new student? [1] Yes  [2] No");
                System.out.print("Enter choice: ");
                sy = in.next();
                y = Integer.parseInt(sy);

                while (y != 1 && y != 2) {

                    System.out.println("Invalid choice!! Try Again!!");
                    System.out.print("Enter choice: ");
                    sy = in.next();
                    y = Integer.parseInt(sy);
                }
                if (y == 1) {
                    addNewStudents(students);
                    students = inputNewStudents();

                } else if (y == 2) {

                    addNewStudents(students);
                    mainfunction();
                }

            } catch (Exception e) {

                System.out.println("Invalid Input!! Try Again!!");
                loop = true;

            }
        } while (loop);

        return students;
    }

    private static void option() {

        System.out.println(
                "\n\n_______________________________________\n~~Welcome to School Management System~~\n\n      Option"
                        + "\n         [1]Input New Student"
                        + "\n         [2]Show all Students List"
                        + "\n         [3]Search Students by Name"
                        + "\n         [4]Remove Students by Id"
                        + "\n         [5]Exit\n_______________________________________");
    }

    private static void mainfunction() {
        do {
            option();
            System.out.print("   Enter: ");
            input = in.next().trim(); // Trim any leading or trailing whitespace

            switch (input) {
                case "1":
                    inputNewStudents();
                    break;
                case "2":
                    showAllStudentEnrolled();
                    break;
                case "3":
                    searchByName();
                    break;
                case "4":
                    removeStudentById();
                    break;
                case "5":
                    exitSystem();
                    break;
                default:
                    System.out.println("\n\n\nInput invalid!! Try Again!!\n");
                    break;
            }
        } while (true); // Loop indefinitely until an explicit exit
    }

    private static void exitSystem() {
        do {
            try {
                System.out.print("\nAre you sure you want to exit? [1] Yes      [2] No\n");
                System.out.print("Enter choice: ");
                int choice = in.nextInt();

                if (choice == 1) {
                    System.exit(0);
                } else if (choice == 2) {
                    return; // Return to the main menu
                } else {
                    System.out.println("Invalid choice!! Try Again!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!! Try Again!!");
                in.next(); // Consume the invalid input
            }
        } while (true);
    }

    // diri mag start ang pag read sa code sa main
    public static void main(String[] args) {

        // proceed siya sa function na ExistingF();
        ExistingF();

    }

}