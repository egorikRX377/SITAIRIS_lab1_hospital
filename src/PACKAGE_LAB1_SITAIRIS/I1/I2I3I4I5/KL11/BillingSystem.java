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
        System.out.println("Пациент успешно добавлен в систему бухгалтерии.");
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
        System.out.println("Счет успешно обновлён для пациента: " + patient.getName());
    }

    @Override
    public String performOperation() {
        return null;
    }
}