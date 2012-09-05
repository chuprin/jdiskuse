package ua.ks.alexchuprin.jdiskuse.gui;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * File name and path info
 * @author user
 */
public class FileInfo {
    
    private String name;
    private String path;

    public FileInfo(String name, String path) {
        this.name = name;
        this.path = path;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }
    
    
}
