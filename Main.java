import student.*;
import rate.*;

import java.util.ArrayList;
import java.util.Scanner; 


import material.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("INTTIC Semester Rate");
        System.out.println("-------------------");
        ArrayList<Student> students = addStudent(2);
        showStudentsInfos(students);
    }

    public static ArrayList<Student> addStudent(int lengthStudents) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int j = 1;
        while (j <= lengthStudents) {
            System.out.println("Student " + j + " Informations:");
            System.out.print("Enter FirstName: ");
            String firstNameInput = sc.next();
            System.out.print("Enter LastName: ");
            String lastNameInput = sc.next();
            System.out.print("Enter Level: ");
            int igeInput = sc.nextInt();
            System.out.println("Successfully created!");
            students.add(new Student(firstNameInput, lastNameInput, igeInput));
            j++;
        }
        return students;
    }

    public static void showStudentsInfos(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            students.get(i).getInfos();
            System.out.println("-------------------");
        }
    }
}