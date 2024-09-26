package PACKAGE_LAB1_SITAIRIS.OtherClasses;

public class MedicalRecord {
    private String diagnosis;
    private String treatment;

    public MedicalRecord(String diagnosis, String treatment)
    {
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public String getDiagnosis()
    {
        return diagnosis;
    }

    public String getTreatment()
    {
        return treatment;
    }

    @Override
    public String toString()
    {
        return "Диагноз: " + diagnosis + ", Лечение: " + treatment;
    }
}