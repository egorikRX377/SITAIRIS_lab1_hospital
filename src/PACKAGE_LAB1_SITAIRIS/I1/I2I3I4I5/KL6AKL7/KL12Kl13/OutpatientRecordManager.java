package PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL6AKL7.KL12Kl13;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL6AKL7.RecordManager;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;

public class OutpatientRecordManager extends RecordManager {
    private String visitDate;
    private String doctorID;

    public OutpatientRecordManager(String recordName, Patient patient, String details, String visitDate, String doctorID) {
        super(recordName, patient, details);
        this.visitDate = visitDate;
        this.doctorID = doctorID;
    }

    @Override
    public void displayInfo() {
        System.out.println("Работает метод displayInfo класса OutpatientRecordManager");
        System.out.println("Outpatient Record ID: " + recordName);
        System.out.println("Patient ID: " + patient);
        System.out.println("Details: " + details);
        System.out.println("Visit Date: " + visitDate);
        System.out.println("Doctor ID: " + doctorID);
    }

    @Override
    public String performOperation() {
        return "Operation performed for outpatient record.";
    }
}
