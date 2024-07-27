import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        int[][] marks = new int[100][3];

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add student marks: add [studentID]");
            System.out.println("2. Update student mark: update [studentID] [subjectID]");
            System.out.println("3. Get the average for a subject: average_s [subjectID]");
            System.out.println("4. Get the average for a student: average [studentID]");
            System.out.println("5. Get the total mark of a student: total [studentID]");
            System.out.println("6. Display grades: grades");
            System.out.println("7. Exit");
            System.out.print("Enter your command: ");

            String command = scanner.next();
            switch (command) {
                case "add":
                    int studentID = scanner.nextInt();
                    if (studentID < 1 || studentID > n + 1) {
                        System.out.println("Invalid student ID.");
                    } else {
                        System.out.print("Enter marks for Mathematics: ");
                        marks[studentID - 1][0] = scanner.nextInt();
                        System.out.print("Enter marks for Chemistry: ");
                        marks[studentID - 1][1] = scanner.nextInt();
                        System.out.print("Enter marks for Physics: ");
                        marks[studentID - 1][2] = scanner.nextInt();
                        System.out.println("Marks added successfully.");
                        n++;
                    }
                    break;

                case "update":
                    studentID = scanner.nextInt();
                    int subjectID = scanner.nextInt();
                    if (studentID < 1 || studentID > n || subjectID < 1 || subjectID > 3) {
                        System.out.println("Invalid student ID or subject ID.");
                    } else {
                        System.out.print("Enter new mark: ");
                        marks[studentID - 1][subjectID - 1] = scanner.nextInt();
                        System.out.println("Mark updated successfully.");
                    }
                    break;

                case "average_s":
                    subjectID = scanner.nextInt();
                    if (subjectID < 1 || subjectID > 3) {
                        System.out.println("Invalid subject ID.");
                    } else {
                        double sum = 0;
                        for (int i = 0; i < n; i++) {
                            sum += marks[i][subjectID - 1];
                        }
                        double average = sum / n;
                        System.out.println("The average mark for subject " + subjectID + " is " + average);
                    }
                    break;

                case "average":
                    studentID = scanner.nextInt();
                    if (studentID < 1 || studentID > n) {
                        System.out.println("Invalid student ID.");
                    } else {
                        double sum = 0;
                        for (int i = 0; i < 3; i++) {
                            sum += marks[studentID - 1][i];
                        }
                        double average = sum / 3;
                        System.out.println("The average mark for student " + studentID + " is " + average);
                    }
                    break;

                case "total":
                    studentID = scanner.nextInt();
                    if (studentID < 1 || studentID > n) {
                        System.out.println("Invalid student ID.");
                    } else {
                        int total = 0;
                        for (int i = 0; i < 3; i++) {
                            total += marks[studentID - 1][i];
                        }
                        System.out.println("The total mark for student " + studentID + " is " + total);
                    }
                    break;

                case "grades":
                    displayGrades(marks, n);
                    break;

                case "exit":
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }

    private static void displayGrades(int[][] marks, int n) {
        System.out.println("Student ID | Mathematics | Chemistry | Physics");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "          | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(getGrade(marks[i][j]) + "          | ");
            }
            System.out.println();
        }
    }

    private static String getGrade(int mark) {
        if (mark >= 90) {
            return "A";
        } else if (mark >= 80) {
            return "B";
        } else if (mark >= 70) {
            return "C";
        } else if (mark >= 60) {
            return "D";
        } else {
            return "Fail";
        }
    }
}
