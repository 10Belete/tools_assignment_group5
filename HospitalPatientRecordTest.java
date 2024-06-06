import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HospitalPatientRecordTest {

    @Test
    public void testCreatePatientRecord() {
        HospitalPatientRecord.createPatientRecord();
        assertEquals(1, HospitalPatientRecord.patientRecords.size());
    }

    @Test
    public void testReadPatientRecords() {
        HospitalPatientRecord.readPatientRecords();
    }

    @Test
    public void testUpdatePatientRecord() {
        HospitalPatientRecord.patientRecords.add("selemon dawit");
        HospitalPatientRecord.updatePatientRecord();
        assertEquals("Updated Name", HospitalPatientRecord.patientRecords.get(0));
    }

    @Test
    public void testDeletePatientRecord() {
        HospitalPatientRecord.patientRecords.add("Alice ali ");
        HospitalPatientRecord.deletePatientRecord();
        assertEquals(0, HospitalPatientRecord.patientRecords.size());
    }
}