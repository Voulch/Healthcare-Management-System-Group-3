package Healthcare;

public class Appointment {
    private final String appointmentID;
    private final Patient patient;
    private final Person provider;
    private final String dateTime;

    public Appointment(String appointmentID, Patient patient, Person provider, String dateTime) {
        this.appointmentID = appointmentID;
        this.patient = patient;
        this.provider = provider;
        this.dateTime = dateTime;
    }

    public String getAppointmentDetails() {
        return "Appointment ID: " + appointmentID + ", Patient: " + patient.name + ", Provider: " + provider.name + ", DateTime: " + dateTime;
    }

    public void schedule() {
        System.out.println("Appointment scheduled: " + getAppointmentDetails());
    }

    public void cancel() {
        System.out.println("Appointment cancelled: " + getAppointmentDetails());
    }
}