package PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL8AKL9KL10.KL15;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL8AKL9KL10.*;

import PACKAGE_LAB1_SITAIRIS.OtherClasses.MedicalRecord;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;

import java.util.List;
import java.util.Scanner;

public class Surgeon extends Doctor {
    private PatientCareManager patientCareManager;
    private HealthDataPrinter healthDataPrinter;

    public Surgeon(String doctorID, String doctorName, String specialization, List<Patient> patients, HealthDataPrinter printer) {
        super(doctorID, doctorName, specialization, patients);
        this.patientCareManager = new PatientCareManager(patients);
        this.healthDataPrinter = printer;
    }

    @Override
    public void addMedicalRecord(Patient patient)
    {
        System.out.println("Работает метод addMedicalRecord класса Surgeon");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диагноз: ");
        String diagnosis = scanner.nextLine();
        System.out.println("Введите назначенное лечение: ");
        String treatment = scanner.nextLine();
        MedicalRecord newRecord = new MedicalRecord(diagnosis, treatment);
        patient.getMedicalRecords().add(newRecord);
        System.out.println("Медицинская запись добавлена для пациента: " + patient.getName());
    }

    public void addPatient(Patient patient)
    {
        patientCareManager.add(super.getPatients(), patient);
    }

    public void displayAllPatientRecords()
    {
        System.out.println("Работает метод displayAllPatientRecords класса Surgeon");displayMedicalRecords();
    }

    public void printPatientDetails()
    {
        healthDataPrinter.displayInfo();
    }

    public void printPatientMedicalRecords()
    {
        healthDataPrinter.displayMedicalRecords();
    }

    public PatientCareManager getPatientCareManager()
    {
        return patientCareManager;
    }

    public HealthDataPrinter getHealthDataPrinter()
    {
        return healthDataPrinter;
    }

    @Override
    public String performOperation()
    {
        System.out.println("Работает метод performOperation класса Surgeon");
        System.out.println("Хирург успешно записан на конференцию!");
        return "";
    }
}