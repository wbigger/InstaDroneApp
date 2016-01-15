/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare;

import droneandshare.camerapackage.Camera;
import droneandshare.mediapackage.Picture;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Creation of a class named Drone
 *
 * @author Vincenzo e Luca
 */
public class Drone {

    /**
     * Drone's attribute
     *
     */
    private Camera mCamera;

    /**
     * Costructor of Drone class
     *
     * @param camera
     */
    public Drone(Camera camera) {
        mCamera = camera;
        /**
         * Print a video text that shows the string "Loading new camera in
         * progress!"
         *
         */
        System.out.println("Loading new camera in progress! ");

    }

    /**
     * Overloading of the costructor of the class Drone created for the case in
     * which there is no camera inserted
     *
     */
    public Drone() {
        this.mCamera = new Camera("insert in progress");
        /**
         * Print a video text that shows an error
         *
         */
        System.out.println(" no use camera! ");
    }

    /**
     * Creation of a method to install a camera on drone
     *
     * @param camera
     */
    public void installNewCamera(Camera camera) {
        mCamera = camera;
        System.out.println("La camera e' stata installata!! ");

    }

    /**
     * get method used to return mCamera because it was private
     *
     * @return mCamera
     */
    public Camera getmCamera() {
        return mCamera;
    }

    /**
     * return a picture from the camera
     *
     * @return mCamera.shotAPicture()
     * @throws java.lang.Exception
     */
    public Picture shotAPicture() throws Exception {
            return mCamera.shotAPicture();

    }

}
