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
public class Picture extends Media {
    
    private float mExposure;
    
    public Picture(String fname) {
        super(fname);
        System.out.println("Inside Picture constructor");
        mExposure = (float) Math.random();
    }
    
    @Override
        public void showProperty() {
            super.showProperty();
            System.out.println("exposure: "+mExposure);
        }
        
        public void crop(int x0, int y0, int x1, int y1) {
            System.out.println("Cropping picture!!!");
            // Do something to crop the image...
        }
}
