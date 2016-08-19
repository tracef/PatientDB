
package patientdb;
import java.util.*;

public class PatientDemographic 
{
    private int patientID;
    private int medicalRecordNum;
    private int altMedicalRecordNum;
    private String lastName;
    private String firstName;
    private char middleInit;
    private String streetAddress;
    private String city;
    private String state;
    private int zip;
    private String bday;
    private int age;
    private int homePhone;
    private int workPhone;
    private String email;
    private String nextOfKin;
    private String nextofKinInfo;
    private String notes;
    
    public PatientDemographic(int patientID, int medicalRecordNum, 
            int altMedicalRecordNum, String lastName, String firstName, 
            char middleInit, String streetAddress, String city, String state, 
            int zip, String bday, int homePhone, int workPhone, String email, 
            String nextOfKin, String nextOfKinInfo, String notes)
    {
        this.patientID = patientID;
        this.medicalRecordNum = medicalRecordNum;
        this.altMedicalRecordNum = altMedicalRecordNum;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleInit = middleInit;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.bday = bday;
        this.age = calcAge(bday);
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.email = email;
        this.nextOfKin = nextOfKin;
        this.nextofKinInfo = nextOfKinInfo;
        this.notes = notes;
    }
    public int calcAge(String bday)
    {
        int age;
        String[] bdayParts = bday.split("/");
        int bdayMonth = Integer.parseInt(bdayParts[0]);
        int bdayDay = Integer.parseInt(bdayParts[1]);
        int bdayYear = Integer.parseInt(bdayParts[2]);
        GregorianCalendar c1 = new GregorianCalendar();
        int currentMonth = c1.get(Calendar.MONTH);
        int currentDay = c1.get(Calendar.DAY_OF_MONTH);
        int currentYear = c1.get(Calendar.YEAR);
        age = currentYear - bdayYear;
        if(bdayMonth > currentMonth)
        {
            if(bdayDay > currentDay)
            {
                age--;
            }
            
            age--;
        }
        return age;
    }
}
