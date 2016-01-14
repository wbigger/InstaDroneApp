/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare;

/**
 *
 * @author Claudio Capobianco
 */
public class DroneAndShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hi, I am your Drone application!");
        
        System.out.println("");
        
        Media media = new Media("sky.jpg");
        media.showProperty();
        
        System.out.println("");
        
        Picture picture = new Picture("yellow.jpg");
        picture.showProperty();
        picture.crop(10,20,100,500);
        
        Media myMedia = new Picture("myPicture.jpg");
        myMedia.showProperty();
        myMedia.crop(10,20,100,500);
        
    }
    
}
