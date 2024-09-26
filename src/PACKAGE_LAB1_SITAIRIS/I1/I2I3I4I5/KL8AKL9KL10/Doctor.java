package PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL8AKL9KL10;

import PACKAGE_LAB1_SITAIRIS.OtherClasses.MedicalRecord;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.MedicalRecordManager;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;

import java.util.List;

public abstract class Doctor implements MedicalRecordManager {
    private String doctorID;
    private String doctorName;
    private String specialization;

    private List<Patient> patients;

    public Doctor(String doctorID, String doctorName, String specialization, List<Patient> patients) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.patients = patients;
    }

    public List<Patient> getPatients() { return this.patients; }

    @Override
    public void displayMedicalRecords()
    {
        System.out.println("------------------------------------");
        System.out.println("Врач: " + doctorName);
        for (Patient patient : patients) {
            System.out.println("Истории болезней ВАШИХ пациентов: ");
            System.out.println("Пациент: " + patient.getName());
            for (MedicalRecord medicalRecord : patient.getMedicalRecords())
            {
                System.out.println(medicalRecord);
            }
            System.out.println("------------------------------------");
        }
    }


    public abstract void addMedicalRecord(Patient patient);

    public String getDoctorID() {
        return doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }
}