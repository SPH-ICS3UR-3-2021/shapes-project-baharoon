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
public class RectangularPrism {
    private double length;
    private double width;
    private double height;
    private double volume;
    private double surfaceArea;
    

    
    public RectangularPrism(){
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    
    public RectangularPrism(double length, double width, double height){
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length) {
        this.length  = length;
        this.setVolume();
        this.setSurfaceArea();
    }
    
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width) {
        this.width  = width;
        this.setVolume();
        this.setSurfaceArea();
    }
    
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
        this.setVolume();
        this.setSurfaceArea();
        
    }
    private void setVolume(){
        this.volume = (this.width*this.length*this.height);
    }
    
    private void setSurfaceArea(){
        this.surfaceArea = 2*((this.width*this.length)+(this.height*this.length)+(this.height*this.width));
    }

    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
}
