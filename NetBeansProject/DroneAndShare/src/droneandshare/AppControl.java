/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare;

/**
 *
 * @author CORSO2
 */
public class AppControl {
    
    private boolean mIsPro = false;
    private Drone mDrone;
    
    public AppControl(Drone drone) {
        this.mDrone = drone;
    }
    
    public boolean getIsPro() 
    {
        return this.mIsPro;
    }
    
    public void ShotAPicture (){
        Picture picture = new Picture("pic.jpg");
        System.out.println("I'm shooting a picture!");
    }
    
}
