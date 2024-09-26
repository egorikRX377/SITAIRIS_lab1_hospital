package PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5;

import PACKAGE_LAB1_SITAIRIS.I1.HospitalOperation;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;

public interface BillingManager extends HospitalOperation
{
    void BillOperation(Patient patient, double bills);
}
