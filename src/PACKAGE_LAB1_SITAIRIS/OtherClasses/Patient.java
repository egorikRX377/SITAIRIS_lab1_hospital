package PACKAGE_LAB1_SITAIRIS.OtherClasses;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String id;
    private String name;
    private String phoneNumber;
    private List<MedicalRecord> medicalRecords;

    double bills;

    // Конструктор
    public Patient(String id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.medicalRecords = new ArrayList<>();
        this.bills = 0;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBills() { return bills; }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setBills(double bills) { this.bills = bills; }

    public List<MedicalRecord> getMedicalRecords() { return this.medicalRecords; }

    @Override
    public String toString() {
        return "Пациент: " + name + " (ID: " + id + "), Телефон: " + phoneNumber;
    }
}