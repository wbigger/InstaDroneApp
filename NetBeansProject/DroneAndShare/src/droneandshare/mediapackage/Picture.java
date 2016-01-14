/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare.mediapackage;

/**
 * The Picture class represent a picture file that can be edited.
 * @author Adecco2016
 */
public class Picture extends Media {
    
    private float mExposure;
    
    /**
     * Load a video file with given filename
     * @param fname The name of the picture to be loaded
     */
    public Picture(String fname) {
        super(fname);
        System.out.println("Inside Picture constructor");
        mExposure = (float) Math.random();
    }
    
    /**
     * Shot a new picture
     */
    public Picture() {
        super();
        String fname = (int)(Math.random()*100)+".jpg";
        System.out.println("Inside Picture constructor");
        mExposure = (float) Math.random();
    }
    
    @Override
        public void showProperty() {
            super.showProperty();
            System.out.println("exposure: "+mExposure);
        }
        
    /**
     * Crop a picture at given points.
     * 
     * @param x0 top-left corner, horizontal (in pixels)
     * @param y0 top-left corner, vertical (in pixels)
     * @param x1 bottom-right corner, horizontal (in pixels)
     * @param y1 bottom-right corner, vertical (in pixels)
     */
    public void crop(int x0, int y0, int x1, int y1) {
            System.out.println("Cropping picture!!!");
            // Do something to crop the image...
        }
}
