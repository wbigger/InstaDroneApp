package droneandshare;
import droneandshare.mediapackage.Picture;

/**
 * This Class defines all the app commands
 * @author Lang
 */
public class AppControl {
    
    /** Determines if the app is pro or not */
    private final boolean mIsPro;
    
    private Drone mDrone;
    private Picture mPicture;
    
    /** Constructor */
    public AppControl(Drone drone) {
        this.mDrone = drone;
        mIsPro = false;
    }
   
    /** get Public mIsPro variable */
    public boolean getIsPro(){
        return this.mIsPro;
    }
   
    /** Commands the drone to Shot a Picture */
    public void shotAPicture (){
        System.out.println("I'm AppControl and I'm shooting a picture!");
        mPicture = mDrone.shotAPicture(); 
    }
     /** Show a Picture */
    public void showPicture() {
        System.out.println("Showing picture "+mPicture);
    }
}
