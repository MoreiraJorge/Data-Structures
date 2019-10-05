/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediaStructure;

/**
 * this is the super class for the various types of media
 * @author morei
 */
public abstract class media {
    private String name;
    
    /**
     * class default constructor
     */
    public media() {
    }
    
    /**
     * class constructor wich uses the variable name to name media
     * @param name
     */
    public media(String name) {
        this.name = name;
    }
    
    /**
     * this method returns media name
     * @return 
     */
    @Override
    public String toString(){
        String text = this.name;      
        return text;
    }
}
