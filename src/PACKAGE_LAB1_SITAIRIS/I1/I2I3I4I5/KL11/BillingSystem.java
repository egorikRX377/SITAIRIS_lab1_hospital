package PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL11;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.*;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;

import java.util.List;

public class BillingSystem implements PatientAdder, BillingManager
{
    public BillingSystem() {}
    @Override
    public void add(List<Patient> patients, Patient patient) {
        patients.add(patient);
    }

    @Override
    public void BillOperation(Patient patient, double bills)
    {
        if (bills < patient.getBills())
        {
            System.out.println("Недостаточная сумма для закрытия счета!");
        }
        else
        {
            patient.setBills(0);
        }
        System.out.println("Счет успешно закрыт для пациента: " + patient.getName());
    }

    @Override
    public String performOperation() {
        return null;
    }
}