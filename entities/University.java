package entities;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class University {
    // Static fields
    private static  ArrayList<Course> courses;
    private static ArrayList<Section> sections;
    private static ArrayList<Student> students;
    private static ArrayList<Teacher> teachers;
    private static ArrayList<Attendance> attendances;
    private static ArrayList<Course_Enrollment> courseEnrollments;

    // Static block for initialization
    static {
        courses = new ArrayList<>();
        sections = new ArrayList<>();
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        attendances = new ArrayList<>();
        courseEnrollments = new ArrayList<>();
    }

    // Methods to manage the entities

    // Add a course
    public static void addCourse(Course c) {
        if (c != null) {
            courses.add(c);
        } else {
            showErrorMessage("Course data not received");
        }
    }

    // Add a section
    public static void addSection(Section s) {
        if (s != null) {
            sections.add(s);
        } else {
            showErrorMessage("Section data not received");
        }
    }

    // Add a student
    public static void addStudent(Student s) {
        if (s != null) {
            students.add(s);
        } else {
            showErrorMessage("Student data not received");
        }
    }

    // Add a teacher
    public static void addTeacher(Teacher t) {
        if (t != null) {
            teachers.add(t);
        } else {
            showErrorMessage("Teacher data not received");
        }
    }

    // Add attendance
    public static void addAttendance(Attendance a) {
        if (a != null) {
            attendances.add(a);
        } else {
            showErrorMessage("Attendance data not received");
        }
    }

    // Add a course enrollment
    public static void addCourseEnrollment(Course_Enrollment ce) {
        if (ce != null) {
            courseEnrollments.add(ce);
        } else {
            showErrorMessage("Course Enrollment data not received");
        }
    }

    // Example of a method to search a student by ID
    public static Student searchStudentById(String sid) {
        for (Student s : students) {
            if (s.getSid().equalsIgnoreCase(sid)) {
                return s;
            }
        }
        showErrorMessage("Student not found");
        return null;
    }

    // Show error message
    public static void showErrorMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    // Get all students
    public static ArrayList<Student> getAllStudents() {
        return students;
    }

    // Get all courses
    public static ArrayList<Course> getAllCourses() {
        return courses;
    }

   
}
