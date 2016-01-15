package droneandshare;
import droneandshare.mediapackage.Picture;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Class defines all the app commands
 * @author Lang
 */
public class AppControl {
    
    /** Determines if the app is pro or not */
    private final boolean mIsPro;
    
    private Drone mDrone;
    private Picture mPicture = null;
    
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
        try { 
            mPicture = mDrone.shotAPicture();
        } catch (Exception ex) {
            System.out.println("###Exception!!AppControl: cannot take picture!");
            System.out.println("###Maybe install a new camera");
            mPicture = null;
        }
    }
     /** Show a Picture */
    public void showPicture() {
        if (mPicture != null) {
        System.out.println("Showing picture "+mPicture);
        } else {
            System.out.println("No picture to be shown");
        }
    }
}
