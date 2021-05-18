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
public class Sphere {
    private double radius;
    private double volume;
    private double surfaceArea;
    

    
    public Sphere(){
        this.setRadius(radius);
    }

    
    public Sphere(double radius){
        this.setRadius(radius);
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius  = radius;
        this.setVolume();
        this.setSurfaceArea();
    }
    
    
    private void setVolume(){
        this.volume = (4/3)*Math.PI*this.radius*this.radius*this.radius;
    }
    
    private void setSurfaceArea(){
        this.surfaceArea = this.radius*this.radius*4*Math.PI;
    }

    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
    
}
