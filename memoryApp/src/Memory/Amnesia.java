/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memory;

import ClinicalCase.*;

public class Amnesia extends MemoryDeficit{
    private String amnesia_type;
    private String cause;
    private String location;
    
    private ClinicalCase clin;
    
    private static int totalAmnesia = 0;
    
    public Amnesia(String deficitId,String memoryLoss,
            String amnesiaType, String cause, String location,
            String patientId, String patientName, 
            String patientSurname,int age, String gender) {
        super(deficitId,memoryLoss);
        this.amnesia_type = amnesiaType;
        this.cause = cause;
        this.location = location;
        clin = new ClinicalCase(patientId,patientName,
                patientSurname,age, gender);
        totalAmnesia++;
    }
    
    public String toString(){
        return "\n" + clin+ super.toString()+
                "\nAmnesia Type: "+amnesia_type+"\nCause: "+cause+"\nLocation: "+location;
    }
    
    public static int getTotalAmnesia(){
        return totalAmnesia;
    }
    
}
