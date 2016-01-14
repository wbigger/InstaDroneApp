/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare;

/**
 * Entry point of DroneAndShare application
 * @author Adecco2016
 */
public class DroneAndShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hi, I am your Drone application!");

        System.out.println("");

        // Create cameras without loops
        Camera myCamera = new Camera("Nikon N1");
        Camera mySecondCamera = new Camera("Canon EOS 500d");
        System.out.println("");
        
        // Test Drones and AppControl
        Drone myDrone = new Drone(myCamera);
        AppControl myApp = new AppControl(myDrone);
        System.out.println("");
        
        DroneOwner claudio = new DroneOwner("Claudio", myCamera, myApp, myDrone);
        System.out.println("");
        
        // Install a new camera
        claudio.setCamera(mySecondCamera);
        claudio.installMyCamera();
        
        System.out.println("");
        
        // Test picture shooting
        claudio.askForPicture();
        claudio.askForPicture();
        claudio.askForPicture();
        claudio.askForPicture();
        claudio.askForPicture();
        claudio.askForPicture();
        
        claudio.askForShowPicture();
        
       
    }

}
