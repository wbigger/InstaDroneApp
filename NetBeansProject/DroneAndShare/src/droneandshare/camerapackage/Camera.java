/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneandshare.camerapackage;

import droneandshare.mediapackage.Picture;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Class models a new camera and define picture's name
 *
 * @author Valerio e Santo
 */
public class Camera implements CameraInterface {

    private int count = 0;
    private String modelName;

    /**
     * Camera constructor that specifies the creation of a new camera and its
     * name
     *
     * @param modelName camera's modelName
     */
    public Camera(String modelName) {
        this.modelName = modelName;
        System.out.println("New camera created!! Model name: " + modelName);
    }

    /**
     * shoot a picture and give it a name
     *
     * @return return a Picture Objects
     */
    @Override
    public Picture shotAPicture() throws Exception {

        Picture p = null;
        boolean photoTaken = false;
        for (int i = 0; (i < 3) && (photoTaken == false); i++) {
            try {
                p = new Picture(Integer.toString(count) + ".jpg");
                photoTaken = true;
                System.out.println("Camera " + modelName + "has shot photo " + p.getFname());
            } catch (Exception ex) {
                System.out.println("###Exception!! Camera: cannot take the picture, trying again (" + (i+1) + "/3)");
            } finally {
                count++;
            }
        }

        if (photoTaken == false) {
            throw new Exception();
        }

        return p;
    }

    public String getModelName() {

        return modelName;
    }

    @Override
    public String toString() {
        return "Model name: " + modelName;
    }
}
