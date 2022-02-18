/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memory;


public abstract class MemoryDeficit{
    
   protected String deficitId;
   protected String memoryLoss;
   
    private static int totalDeficit = 0;

    public MemoryDeficit(String deficitId,String memoryLoss){
        this.deficitId = deficitId;
        this.memoryLoss = memoryLoss;
       
        totalDeficit++;
    }

    @Override
    public String toString(){
        return "Deficit ID: " + deficitId + "\nMemory Loss: " 
                + memoryLoss ;
    }

    public static int getTotalDeficit(){
        return totalDeficit;
    }
    
    public boolean getDeficit_id(String deficitId){
        if(this.deficitId.equals(deficitId))
            return true;
        else
            return false;                            
     }
}

