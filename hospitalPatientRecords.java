import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalPatientRecord {

    private static List<String> patientRecords = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Create Patient Record");
            System.out.println("2. Read Patient Records");
            System.out.println("3. Update Patient Record");
            System.out.println("4. Delete Patient Record");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
        
    public static void createPatientRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        patientRecords.add(name);
        System.out.println("Patient record created successfully.");
    }

    public static void readPatientRecords() {
        System.out.println("Patient Records:");
        for (String record : patientRecords) {
            System.out.println(record);
        }
    }

    public static void updatePatientRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the record to update: ");
        int index = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter updated patient name: ");
        String updatedName = scanner.nextLine();
        if (index >= 0 && index < patientRecords.size()) {
            patientRecords.set(index, updatedName);
            System.out.println("Patient record updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void deletePatientRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the record to delete: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < patientRecords.size()) {
            patientRecords.remove(index);
            System.out.println("Patient record deleted successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}