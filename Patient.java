package Healthcare;

import java.util.LinkedList;
import java.util.List;

public class Patient extends Person {
        private final LinkedList<MedicalLog> medicalLog;

        public Patient(String id, String name, String birthdate, String contact) {
                super(id, name, birthdate, contact);
                this.medicalLog = new LinkedList<>();
        }

        public void addLog(MedicalLog log) {
                medicalLog.add(log);
        }

        public List<MedicalLog> getMedicalHistory() {
                return medicalLog;
        }

        public void viewBilling() {
                for (MedicalLog log : medicalLog) {
                        System.out.println(log.generateInvoice());
                }
        }
}