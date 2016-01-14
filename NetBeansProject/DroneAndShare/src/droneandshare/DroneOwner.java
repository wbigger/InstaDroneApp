/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare;

/**
 *
 * @author AWT
 */
public class DroneOwner {
    
    private String nickName;
    private Camera camera;
    private AppControl app;
    
    
    public DroneOwner(String nickName, Camera camera, AppControl app){
        this.nickName= nickName;
        this.camera= camera;
        this.app= app;
        System.out.println("Welcome"+ nickName+ "!!");
        System.out.println("Installed camera: "+ camera);
    }
    
    public String getNickName(){
        return nickName;
    }
    
    public Camera getCamera(){
        return camera;
    }
    
    public void setCamera(Camera modello){
        camera= modello;
    }
    
    public void installMyCamera(){
        System.out.println("My camera installed.");
    }
    
}
