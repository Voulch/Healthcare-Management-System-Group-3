package Healthcare;

import java.util.ArrayList;
import java.util.List;

public class MedicalLog {
    private final String recordID;
    private final Patient patient;
    private final List<String> prescriptions;
    private final List<String> testResults;
    private String billingInfo;

    public MedicalLog(String recordID, Patient patient) {
        this.recordID = recordID;
        this.patient = patient;
        this.prescriptions = new ArrayList<>();
        this.testResults = new ArrayList<>();
    }

    public void addPrescription(String prescription) {
        prescriptions.add(prescription);
    }

    public void addTestResult(String result) {
        testResults.add(result);
    }

    public String generateInvoice() {
        return "Invoice for " + patient.name + ": $" + billingInfo;
    }

    public String getRecordDetails() {
        return "Record ID: " + recordID + ", Patient: " + patient.name;
    }
}

