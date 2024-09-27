import PACKAGE_LAB1_SITAIRIS.I1.HospitalOperation;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL11.BillingSystem;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL11.KL14.Registry;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL6AKL7.KL12Kl13.InpatientRecordManager;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL6AKL7.KL12Kl13.OutpatientRecordManager;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL6AKL7.PatientDatabase;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL8AKL9KL10.Doctor;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL8AKL9KL10.HealthDataPrinter;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL8AKL9KL10.KL15.Surgeon;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.PatientRecordManager;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;
import java.util.*;

public class TEST_PACKAGE
{
    public static void main(String[] args)
    {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("1", "Балашенко Егор Алескандрович", "+375292464495"));
        patients.add(new Patient("2", "Иванов Иван Иванович", "+375298910027"));
        patients.add(new Patient("3", "Петров Петр Петрович", "+375297657134"));

        PatientRecordManager<Patient> pDatabase = new PatientDatabase(patients);
        pDatabase.displayInfo();

        PatientRecordManager<Patient> inRecordManager = new InpatientRecordManager("Номер 1", patients.get(0), "Детали 1", "Комната 1", "Неделю назад");
        PatientRecordManager<Patient> outRecordManager = new OutpatientRecordManager("Номер 2", patients.get(1), "Детали 2", "12.05.2023", "2");

        inRecordManager.displayInfo();
        outRecordManager.displayInfo();

        HealthDataPrinter healthDataPrinter = new HealthDataPrinter(patients);
        Doctor surgeon = new Surgeon("1", "Шилов Иван Петрович", "Травматолог", patients, healthDataPrinter);

        surgeon.addMedicalRecord(patients.get(0));
        ((Surgeon)surgeon).displayAllPatientRecords();
        ((Surgeon)surgeon).printPatientDetails();

        BillingSystem billingSystem = new BillingSystem();
        Registry registry = new Registry(patients, billingSystem);
        Patient patient4 = new Patient("4", "Ермолаев Илья Сергеевич", "+375292554495");
        registry.addPatientToDoctor(surgeon, patient4);
        registry.openBill(patients.get(0), 1000);
        registry.closeBill(patients.get(0), 1000);
        registry.addPatientToBillingSystem(patient4);
        
        HospitalOperation surgeon2 = new Surgeon("2", "Ильин Максим Юрьевич", "Кардиолог", patients, healthDataPrinter);
        surgeon2.performOperation();
    }
}