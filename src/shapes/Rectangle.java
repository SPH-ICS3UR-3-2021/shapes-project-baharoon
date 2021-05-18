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
public class Rectangle {
    private double length;
    private double width;
    private double area;
    private double perimeter;
    

    
    public Rectangle(){
        this.setLength(length);
        this.setWidth(width);
    }

    
    public Rectangle(double length, double width){
        this.setLength(length);
        this.setWidth(width);
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length) {
        this.length  = length;
        this.setArea();
        this.setPerimeter();
    }
    
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width) {
        this.width  = width;
        this.setArea();
        this.setPerimeter();
    }
    
    private void setArea(){
        this.area = this.width*this.length;
    }
    
    private void setPerimeter(){
        this.perimeter = this.width*2 + this.length*2;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
