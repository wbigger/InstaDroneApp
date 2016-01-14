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
public class Media {
    
    private String mFname;
    private int mSizeH;
    private int mSizeV;
    private String mGpsTag;
   
    private void generateRandomProperties() {
        mSizeH = 100 + (int)(Math.random()*2000);
        mSizeV = 50 + (int)(Math.random()*1200);
        int lat = -90 + (int)(Math.random()*180);
        int lon = -180 + (int)(Math.random()*360);
        mGpsTag = lat+","+lon;
    }
    
    public Media(String fname) {
        // Load the media wih the specified filename...
        System.out.println("Inside Media constructor");
        System.out.println("Loading: "+fname);
        mFname = fname;
        
        // Let's say that this media has the following properties
        // In a real class, these values are read from the file itself!!
        generateRandomProperties();
    }
    
    public String getFname() {
        return mFname;
    }
    
    public void loadNewContent(String filename) {
        // Load the media wih the specified filename...
        System.out.println("Loading new content: "+filename);
        mFname = filename;
        // This new media has, for example, the following properties
        generateRandomProperties();
    }
    
    @Override
    public String toString(){
    return super.toString()+" and I am a media file with a name: " + mFname;
    }
    
    public void showProperty() {
        System.out.println("Media properties: "+
                "size: " + mSizeH+"x"+mSizeV +"; "+
                "gpsTag: " + mGpsTag + ".");
    }
    
}
