package Healthcare;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
    private String specialty;
    private List<Patient> patients;

    public Doctor(String id, String name, String dateofBirth, String contact, String specialty) {
        super(id, name, dateofBirth, contact);
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    public void prescribeMedication(Patient patient, String prescription) {
        for (MedicalLog log : patient.getMedicalHistory()) {
            log.addPrescription(prescription);
        }
    }

    public void scheduleAppointment(Appointment appointment) {
        System.out.println("Appointment scheduled: " + appointment.getAppointmentDetails());
    }
}
