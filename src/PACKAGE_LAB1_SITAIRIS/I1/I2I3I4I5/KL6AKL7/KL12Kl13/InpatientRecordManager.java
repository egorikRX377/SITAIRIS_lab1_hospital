package PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL6AKL7.KL12Kl13;
import PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5.KL6AKL7.RecordManager;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;

public class InpatientRecordManager extends RecordManager
{
    private String roomNumber;
    private String admissionDate;

    public InpatientRecordManager(String recordName, Patient patient, String details, String roomNumber, String admissionDate) {
        super(recordName, patient, details);
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя записи: " + recordName);
        System.out.println("Пациент: " + patient);
        System.out.println("Детали: " + details);
        System.out.println("Номер палаты: " + roomNumber);
        System.out.println("Дата поступления: " + admissionDate);
    }

    @Override
    public String performOperation() {
        return null;
    }
}
