/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare;

/**
 *
 * @author CORSO
 */

public class Drone {
    
    private Camera mCamera;
    
    public Drone (Camera camera) {
        mCamera=camera;
        System.out.prinln("Loading new camera in progress! ");
              
    }
        public Drone () {
            this.mCamera=new Camera("insert in progress");
             System.out.prinln(" new camera inserted! ");
        }
        
    
    public void installNewCamera (Camera camera){
       mCamera=camera;
        System.out.println("La camera e' stata installata!! ");
        
    }

    public Camera getmCamera() {
        return mCamera;
    }

    public Picture shotAPicture(){
       return mCamera.shotAPicture();
    }
           
}
