package DeitelJavaExcercises.src.chapterSeven;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        System.out.println("Enter the number of subjects: ");
        Scanner userInput = new Scanner(System.in);
        int subjectsSize = userInput.nextInt();
//        int subjectsArray[] = new int [subjectsSize];

        System.out.println("Enter the total number  of studentss: ");
        Scanner inputForNumberOfStudents = new Scanner(System.in);
        int totalStudents = inputForNumberOfStudents.nextInt();

        String names[] = new String[totalStudents];
        int marks[][] = new int[totalStudents][subjectsSize];

        int i = 0, j = 0;

        for (i=0; i < totalStudents; i++) {
            System.out.println("Student " + (i + 1) + "details:");
            System.out.print("Name: ");
//            names[i]
        }
    }
}
