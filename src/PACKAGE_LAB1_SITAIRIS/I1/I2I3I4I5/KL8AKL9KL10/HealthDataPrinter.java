package PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL8AKL9KL10;

import java.util.List;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.*;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.MedicalRecord;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;


public class HealthDataPrinter implements PatientRecordManager<Patient>, MedicalRecordManager {
    private List<Patient> patients;

    public HealthDataPrinter(List<Patient> patients) {
        this.patients = patients;
    }


    @Override
    public void displayInfo() {
        for (Patient patient : patients) {
            System.out.println(patient);
            System.out.println("------------------------------------");
        }
    }

    @Override
    public void displayMedicalRecords() {
        System.out.println("------------------------------------");
        for (Patient patient : patients) {
            System.out.println("Истории болезней пациентов: ");
            System.out.println("Пациент: " + patient.getName());
            for (MedicalRecord medicalRecord : patient.getMedicalRecords())
            {
                System.out.println(medicalRecord);
            }
            System.out.println("------------------------------------");
        }
    }

    @Override
    public String performOperation() {
        return null;
    }
}