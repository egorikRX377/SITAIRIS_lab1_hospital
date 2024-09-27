package PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL6AKL7;

import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.PatientRecordManager;

import java.util.ArrayList;
import java.util.List;

import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;

public class PatientDatabase implements PatientRecordManager<Patient>
{
    private List<Patient> patients;

    public PatientDatabase(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Работает функция displayInfo класса PatientDatabase");
        System.out.println("=-------------------------=");
        for (Patient patient : patients)
        {
            System.out.println("ФИО пациента: " + patient.getName());
            System.out.println("Номер телефона: " + patient.getPhoneNumber());
            System.out.println("=-------------------------=");
        }
    }

    @Override
    public String performOperation() {
        return null;
    }

    public List<Patient> getAllPatients() {
        return patients;
    }
}
