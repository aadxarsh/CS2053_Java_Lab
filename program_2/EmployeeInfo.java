// Class: EmployeeInfo
// Demonstrates String handling, Scanner input, and command-line arguments

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== 🧾 Employee Information System ===");

        // Accepting employee details using Scanner
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        // String Handling Example
        String upperName = name.toUpperCase();
        String deptShort = department.substring(0, Math.min(3, department.length())).toUpperCase();

        System.out.println("\n✅ Employee Record Created Successfully!");
        System.out.println("------------------------------------------");
        System.out.println("Employee Name (Uppercase): " + upperName);
        System.out.println("Employee ID              : " + empId);
        System.out.println("Department (Short Code)  : " + deptShort);
        System.out.println("Salary                   : ₹" + salary);
        System.out.println("------------------------------------------");

        // Command-line Arguments for batch updates
        if (args.length > 0) {
            System.out.println("\n📦 Batch Updates from Command-line Arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Update " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("\n(No batch updates provided through command-line arguments)");
        }

        sc.close();
    }
}