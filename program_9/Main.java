import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Add students
        students.add(new Student("Aadarsh", 85));
        students.add(new Student("Riya", 92));
        students.add(new Student("Karan", 78));

        // Display all students using Iterator
        System.out.println("Student Marks List:");
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Update marks
        System.out.print("\n Enter name to update marks: ");
        String nameToUpdate = sc.nextLine();
        boolean found = false;
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(nameToUpdate)) {
                System.out.print("Enter new marks: ");
                int newMarks = sc.nextInt();
                s.setMarks(newMarks);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }

        // Delete student
        sc.nextLine(); // consume leftover newline
        System.out.print("\n Enter name to delete: ");
        String nameToDelete = sc.nextLine();
        students.removeIf(s -> s.getName().equalsIgnoreCase(nameToDelete));

        // Final list
        System.out.println("\n Final Student List:");
        for (Student s : students) {
            System.out.println(s);
        }

        sc.close();
    }
}
