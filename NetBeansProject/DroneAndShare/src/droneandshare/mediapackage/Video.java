/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare.mediapackage;

/**
 * The Video class represent a video file that can be edited.
 * @author Adecco2016
 */
public class Video extends Media {

    private float mLenghtInMinute;
    private int mFramePerSecond;

    /**
     * Load a video file with given filename
     * @param filename The name of the video to be loaded
     */
    public Video(String filename) {
        super(filename);
        mLenghtInMinute = 0 + (float) (Math.random() * 10);
        mFramePerSecond = 0 + (int) (Math.random() * 50);
    }

    @Override
    public void showProperty() {
        System.out.println("Lenght video: " + mLenghtInMinute + "min");
        System.out.println("Frame per second: " + mFramePerSecond + "sec");
    }

    /**
     * Cut the video at given time (point).
     * 
     * New video will be from beginning to the cut point.
     * @param cutpoint final time (in minute) of the cut
     */
    public void cut(float cutpoint) {
        System.out.println("Cutted at min " + cutpoint);
    }

}
