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
    
    private final boolean mIsPro;
    private Drone mDrone;
    private Picture mPicture;
    
    public AppControl(Drone drone) {
        this.mDrone = drone;
        mIsPro = false;
    }
    
    public boolean getIsPro(){
        return this.mIsPro;
    }
    
    public void shotAPicture (){
        System.out.println("I'm AppControl and I'm shooting a picture!");
        mPicture = mDrone.shotAPicture(); 
    }
    
    public void showPicture() {
        System.out.println("Showing picture "+mPicture);
    }
}
