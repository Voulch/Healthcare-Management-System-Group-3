package Healthcare;

import java.util.ArrayList;
import java.util.List;

public class Nurse extends Person {
    private final String specialty;
    private final List<Patient> patients;

    public Nurse(String id, String name, String dateofBirth, String contact, String specialty) {
        super(id, name, dateofBirth, contact);
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    public void assistPatient(Patient patient) {
        System.out.println("Assisting patient: " + patient.name);
    }

    public void updateRecord(MedicalLog record) {
        System.out.println("Updating record: " + record.getRecordDetails());
    }

    public void scheduleAppointment(Appointment appointment) {
        System.out.println("Appointment scheduled: " + appointment.getAppointmentDetails());
    }
}
