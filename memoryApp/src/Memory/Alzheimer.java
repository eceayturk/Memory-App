/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memory;

import ClinicalCase.*;

public class Alzheimer extends MemoryDeficit {
    private String declining_area;
    private static int totalAlzheimer = 0;
    
    private ClinicalCase clin;
    
    public Alzheimer(String deficitId, String memoryLoss, String declining_area, 
            String patientId, String patientName, String patientSurname,
            int age, String gender){
        super(deficitId, memoryLoss);
        this.declining_area = declining_area;
        
        clin = new ClinicalCase(patientId,patientName,
                patientSurname,age, gender);
        totalAlzheimer++;
    }
    
    public String toString(){
        return "\n" + super.toString()+ clin+
                "\nDeclining Area: "+declining_area;
    }
    
    public static int getTotalAlzheimer(){
        return totalAlzheimer;
    }
    
}
