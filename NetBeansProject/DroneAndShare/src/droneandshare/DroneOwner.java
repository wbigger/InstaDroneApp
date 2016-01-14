/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare;

import droneandshare.camerapackage.Camera;

/**
 * Class DroneOwner represents the drone owner. Get nickname of DroneOwner and
 * the Camera used; ask to AppControl to shot a picture and to Drone to install
 * a new camera.
 *
 * @author AWT
 */
public class DroneOwner {

    private String nickName;
    private Camera camera;
    private AppControl app;
    private Drone drone;

    /**
     * Create a constructor of DroneOwner
     *
     * @param nickName is the nick name of drone owner
     * @param camera is the model of the camera
     * @param app is the name of AppControl
     * @param drone is the model of the drone
     */
    public DroneOwner(String nickName, Camera camera, AppControl app, Drone drone) {
        this.nickName = nickName;
        this.camera = camera;
        this.app = app;
        this.drone = drone;
        System.out.println("Welcome " + nickName + "!!");
        System.out.println(nickName + "has installed camera: " + camera);
    }

    public String getNickName() {
        return nickName;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera modello) {
        camera = modello;
    }

    /**
     * Ask drone to install a new camera
     */
    public void installMyCamera() {
        drone.installNewCamera(camera);
        System.out.println(nickName + "your camera has been installed.");
    }

    /**
     * Ask app to shot a picture
     */
    public void askForPicture() {
        app.shotAPicture();
    }

    /**
     * Ask app to show a picture
     */
    public void askForShowPicture() {
        app.showPicture();
    }

}
