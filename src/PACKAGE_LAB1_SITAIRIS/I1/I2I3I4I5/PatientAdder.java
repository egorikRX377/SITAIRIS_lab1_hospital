package PACKAGE_LAB1_SITAIRIS.I1.I2I3I4I5;
import PACKAGE_LAB1_SITAIRIS.I1.HospitalOperation;
import PACKAGE_LAB1_SITAIRIS.OtherClasses.Patient;

import java.util.*;

public interface PatientAdder extends HospitalOperation
{
    void add(List<Patient> patients, Patient patient);
}
