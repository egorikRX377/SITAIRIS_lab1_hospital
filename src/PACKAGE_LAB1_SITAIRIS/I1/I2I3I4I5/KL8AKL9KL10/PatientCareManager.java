package PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL8AKL9KL10;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.*;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;

import java.util.*;

public class PatientCareManager implements MedicalRecordManager, BillingManager, PatientAdder
{
    private List<Patient> patients;

    public PatientCareManager(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public void displayMedicalRecords()
    {
        System.out.println("------------------------------------");
        System.out.println("---------Пациенты и их счета--------");
        System.out.println("------------------------------------");
        for (Patient patient : patients)
        {
            System.out.println("Пациент: " + patient.getName());
            System.out.println("Cчёт: " + patient.getBills());
            System.out.println("------------------------------------");
        }
    }

    @Override
    public void BillOperation(Patient patient, double bills) {
        patient.setBills(bills);
        System.out.println("Счёт успешно выставлен!");
    }

    @Override
    public void add(List<Patient> patients, Patient patient)
    {
        patients.add(patient);
        System.out.println("Пациент успешно закреплен за доктором!");
    }

    @Override
    public String performOperation() {
        return null;
    }
}