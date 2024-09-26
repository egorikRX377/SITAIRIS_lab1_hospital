package PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL6AKL7;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;

public abstract class RecordManager implements PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.PatientRecordManager<Patient> {
    protected String recordName;
    protected Patient patient;
    protected String details;

    public RecordManager(String recordName, Patient patient, String details) {
        this.recordName = recordName;
        this.patient = patient;
        this.details = details;
    }

    public String getRecordName() {
        return recordName;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDetails() {
        return details;
    }

    public abstract void displayInfo();
}
