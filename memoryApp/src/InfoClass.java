/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Memory.*;
import java.util.ArrayList;

public class InfoClass {
    public static ArrayList<MemoryDeficit> memoryArrayList = new ArrayList<>();
    
    public static void addMemory(MemoryDeficit def){
        memoryArrayList.add(def);
        
    }
    
    public static String getAllMemory(){
        String result = "";
        
        for(int i = 0; i < memoryArrayList.size(); i++){
            result += memoryArrayList.get(i).toString() +"\n";
        }
            return result;     
    }
    
    public static String getAmnesia(){
       String result = "";
       for(int i = 0; i < memoryArrayList.size(); i++)
           if(memoryArrayList.get(i) instanceof Amnesia)
               result += memoryArrayList.get(i).toString() + "\n";
       return result;
   }
   
   public static String getAlzheimer(){
       String result = "";
       for(int i = 0; i < memoryArrayList.size(); i++)
           if(memoryArrayList.get(i) instanceof Alzheimer)
               result += memoryArrayList.get(i).toString() + "\n";
       return result;
   }
   
   public static MemoryDeficit searchMemory(String id){
       for(int i=0; i<memoryArrayList.size(); i++)
        {
            MemoryDeficit m = memoryArrayList.get(i);
            if(m.getDeficit_id(id)){
                memoryArrayList.get(i);
                return m;
            }
        } 
       return null;
    }
    
    public static String showTotalMemory(){
        return "" + MemoryDeficit.getTotalDeficit();
    }
            
   
    
    
    
    
    
    
    
}
