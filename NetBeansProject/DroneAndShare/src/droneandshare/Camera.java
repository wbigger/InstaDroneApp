/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare;

/**
 *
 * @author corso
 */
public class Camera {
   private int count = 0;//test 
  // private String mPictureName;
   private String modelName; 
   
    public Camera(String modelName){
        this.modelName = modelName;
        System.out.println("New camera created!! Model name: "+ modelName);
    }
    public Picture shotAPicture() {
        
      //System.out.println("Ho scattato una foto: "+mPictureName);
      
      Picture p = new Picture(Integer.toString(count)+".jpg");
      
      //test
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
