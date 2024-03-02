package com.epam.mjc;


public class StudentManager {

    private static final long[] IDs={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) {
        return Student.getValueOf(studentID);
    }

    public static void main(String[] args) {
        StudentManager manager=new StudentManager();

        for (int i=0; i < IDs.length; i++) {
            try {
                Student student=manager.find(IDs[i]);
                if (student != null) {
                    System.out.println("Student name: " + student.getName());
                } else {
                    throw new CustomException("Student not found in our database");
                }
            } catch (CustomException e) {
                System.err.println("Exception caught: " + e.getMessage());
            }
        }
    }
}