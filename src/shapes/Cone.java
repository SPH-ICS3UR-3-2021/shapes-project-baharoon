/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author baharoon
 */
public class Cone {
    private double radius;
    private double height;
    private double volume;
    private double surfaceArea;
    

    
    public Cone(){
        this.setRadius(radius);
        this.setHeight(height);
    }

    
    public Cone(double radius, double height){
        this.setRadius(radius);
        this.setHeight(height);
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius  = radius;
        this.setVolume();
        this.setSurfaceArea();
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height  = height;
        this.setVolume();
        this.setSurfaceArea();
    }
    
    
    private void setVolume(){
        this.volume = Math.PI*this.radius*this.radius*(this.height/3);
    }
    
    private void setSurfaceArea(){
        this.surfaceArea = Math.PI*this.radius*(this.radius+Math.sqrt((this.height*this.height)+(this.radius*this.radius)));
    }

    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
}
