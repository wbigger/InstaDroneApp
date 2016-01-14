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
    
    AppControl app= new AppControl();
    
    public DroneOwner(String nickName, Camera camera){
        this.nickName= nickName;
        this.camera= camera;
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
        System.out.println("New camera instaled:"+ modello);
    }
    
}
