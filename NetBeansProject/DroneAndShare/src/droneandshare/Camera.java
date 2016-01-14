/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare;

/**
 * This Class models a new camera and define picture's name
 * @author Valerio e Santo
 */
public class Camera {
   private int count = 0;
   private String modelName; 
   
    /**
     * Camera constructor that specifies the creation of a new camera and its name
     * @param modelName camera's modelName
     */
    public Camera(String modelName){
        this.modelName = modelName;
        System.out.println("New camera created!! Model name: "+ modelName);
    }

    /**
     * shoot a picture and give it a name
     * @return return a Picture Objects
     */
    public Picture shotAPicture() {
        
        Picture p = new Picture(Integer.toString(count)+".jpg");
        System.out.println("Camera "+ modelName + "has shot photo "+p.getFname());
        count++;
        return p;
    }
    
    public String getModelName(){
    
        return modelName;
    }
    
   @Override
        public String toString(){
        return "Model name: "+ modelName;
    }
}
