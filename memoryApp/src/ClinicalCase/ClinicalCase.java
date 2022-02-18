/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicalCase;

/**
 *
 * @author ebrue
 */
public class ClinicalCase {
    private String patient_id;
    private String patient_name;
    private String patient_surname;
    private int age;
    private String gender;
    
    
    public ClinicalCase(String patient_id, String patient_name, String patient_surname, int age, String gender){
        this.age = age;
        this.gender = gender;
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_surname = patient_surname;  
    }
    
    @Override
    public String toString(){
        return "\nPatient Id: "+patient_id+"\nPatient Name: "+patient_name+"\nPatient Surname: "+patient_surname+
                "\nAge: "+age+"\nGender: "+gender;
    }
    
    public String getPatient_id(){
        return patient_id;
    }
}
