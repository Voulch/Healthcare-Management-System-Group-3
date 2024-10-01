package Healthcare;

import java.util.Scanner;



public class Health {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Patient patient = createPatient(scanner);
        Doctor doctor = createDoctor(scanner);
        Nurse nurse = createNurse(scanner);

        MedicalLog log1 = createMedicalLog(scanner, patient);
        patient.addLog(log1);

        patient.viewBilling();
    }

    private static Patient createPatient(Scanner scanner) {
        System.out.println("======== Enter Patient details ========");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Patient ID: ");
        String patientId = scanner.nextLine();
        System.out.print("Date of Birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("=======================================");

        return new Patient(patientId, name, dateOfBirth, phoneNumber);
    }

    private static Doctor createDoctor(Scanner scanner) {
        System.out.println("\n======== Enter Doctor details =========");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Doctor ID: ");
        String doctorId = scanner.nextLine();
        System.out.print("Date of Birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Specialization: ");
        String specialization = scanner.nextLine();
        System.out.println("=======================================");

        return new Doctor(doctorId, name, dateOfBirth, phoneNumber, specialization);
    }

    private static Nurse createNurse(Scanner scanner) {
        System.out.println("\n========= Enter Nurse details =========");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Nurse ID: ");
        String nurseId = scanner.nextLine();
        System.out.print("Date of Birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.println("========================================");

        return new Nurse(nurseId, name, dateOfBirth, phoneNumber, department);
    }

    private static MedicalLog createMedicalLog(Scanner scanner, Patient patient) {

        System.out.println("\n====== Enter Medical log details =======");
        System.out.print("Log ID: ");
        String logId = scanner.nextLine();
        System.out.println("========================================");

        MedicalLog log = new MedicalLog(logId, patient);

        System.out.println("\n========================================");
        System.out.print("Add prescription [Yes/No]: ");
        String response = scanner.nextLine();
        
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Prescription: ");
            String prescription = scanner.nextLine();
            log.addPrescription(prescription);
            System.out.println("========================================");
        }

        System.out.println("\n========================================");
        System.out.print("Add test result [Yes/No]: ");
        response = scanner.nextLine();
        System.out.println("========================================");
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("\n========================================");
            System.out.print("Test Result: ");
            String testResult = scanner.nextLine();
            log.addTestResult(testResult);
            System.out.println("========================================");
        }

        return log;
    }

}