import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Menu: ");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm học sinh mới");
            System.out.println("3. Xoá sinh viên");
            System.out.println("4. Hiển thị danh sách học sinh có GPA > 8");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    displayStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    displayStudentsWithHighGPA();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại.");
            }
        }
    }
    private static void displayStudents() {
        System.out.println("Danh sách học sinh:");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("ID: " + student.getId() + ", Tên hs: " + student.getName() + ", Email: " + student.getEmail() + ", GPA: " + student.getGPA());
        }
    }
    private static void addStudent() {
        System.out.print("Nhập ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập GPA: ");
        double gpa = scanner.nextDouble();
        students.add(new Student(id, name, email, gpa));
        System.out.println("Hoọc sinh đã được thêm vào danh sách.");
    }
    private static void deleteStudent() {
        System.out.print("Nhập ID của học sinh cần xoá: ");
        int id = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                found = true;
                System.out.println("Xóa thành công");
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh có ID : " + id);
        }
    }
    private static void displayStudentsWithHighGPA() {
        System.out.println("Danh sách học sinh có GPA > 8:");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getGPA() > 8) {
                System.out.println("ID: " + student.getId() + ", Tên HS: " + student.getName() + ", Email: " + student.getEmail() + ", GPA: " + student.getGPA());
            }
        }
    }
}

