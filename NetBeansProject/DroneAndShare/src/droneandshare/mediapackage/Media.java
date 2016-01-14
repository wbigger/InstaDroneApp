/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare.mediapackage;

/**
 *
 * @author Claudio Capobianco
 */
public abstract class Media {

    private String mFname;
    private int mSizeH;
    private int mSizeV;
    private String mGpsTag;

    public int getmSizeH() {
        return mSizeH;
    }

    public int getmSizeV() {
        return mSizeV;
    }

    
    
    private void generateRandomProperties() {
        mSizeH = 100 + (int) (Math.random() * 2000);
        mSizeV = 50 + (int) (Math.random() * 1200);
        int lat = -90 + (int) (Math.random() * 180);
        int lon = -180 + (int) (Math.random() * 360);
        mGpsTag = lat + "," + lon;
    }

    private void initMedia(String fname) {
        System.out.println("Inside Media constructor");
        mFname = fname;
        // Let's say that this media has the following properties
        // In a real class, these values are read from the file itself!!
        generateRandomProperties();
        System.out.println("Loading: " + fname);
    }

    /**
     * Load a video file with given filename
     *
     * @param fname The name of the media to be loaded
     */
    public Media(String fname) {
        // Load the media wih the specified filename...
        initMedia(fname);
    }

    /**
     * Create a brand new media from scratch
     */
    public Media() {
        String fname = (int) (Math.random() * 100) + ".media";
        initMedia(fname);
    }

    public String getFname() {
        return mFname;
    }

    /**
     * Load a new content into the class
     *
     * @param filename the name of the file to be loaded
     */
    public void loadNewContent(String filename) {
        // Load the media wih the specified filename...
        System.out.println("Loading new content: " + filename);
        mFname = filename;
        // This new media has, for example, the following properties
        generateRandomProperties();
    }

    @Override
    public String toString() {
        return super.toString() + " and I am a media file with a name: " + mFname;
    }

    /**
     * Show the property of the media
     */
    abstract void showProperty();

}
