package PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL11.KL14;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL11.BillingSystem;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL8AKL9KL10.*;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;

import java.util.List;

public class Registry {
    List<Patient> patients;
    private PatientCareManager patientCareManager;
    private BillingSystem billingSystem;

    public Registry( List<Patient> patients, BillingSystem billingSystem)
    {
        this.patients = patients;
        this.patientCareManager = new PatientCareManager(patients);
        this.billingSystem = billingSystem;
    }

    public void addPatientToBillingSystem(Patient patient)
    {
        System.out.println("Работает метод addPatientToBillingSystem класса Registry");
        billingSystem.add(patients, patient);
        System.out.println("Пациент " + patient.getName() + " добавлен в систему бухгалтерии регистартуры.");
    }

    public void addPatientToDoctor(Doctor doctor, Patient patient)
    {
        System.out.println("Работает метод addPatientToDoctor класса Registry");
        patientCareManager.add(doctor.getPatients(), patient);
    }

    public void closeBill(Patient patient, double value)
    {
        System.out.println("Работает метод closeBill класса Registry");billingSystem.BillOperation(patient, value);
    }

    public void openBill(Patient patient, double value)
    {
        System.out.println("Работает метод openBill класса Registry");patientCareManager.BillOperation(patient, value);
    }

}