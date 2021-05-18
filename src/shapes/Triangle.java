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
public class Triangle {
    private double sideA;
    private double base;
    private double sideC;
    private double height;
    private double area;
    private double perimeter;
    

    
    public Triangle(){
        this.setSideA(sideA);
        this.setBase(base);
        this.setSideC(sideC);
        this.setHeight(height);
    }

    
    public Triangle(double sideA, double base, double sideC, double height){
        this.setSideA(sideA);
        this.setBase(base);
        this.setSideC(sideC);
        this.setHeight(height);
    }
    
    public double getSideA(){
        return sideA;
    }
    
    public void setSideA(double sideA) {
        this.sideA  = sideA;
        this.setArea();
        this.setPerimeter();
    }
    
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double base) {
        this.base  = base;
        this.setArea();
        this.setPerimeter();
    }
    
    public double getSideC(){
        return sideC;
    }
    
    public void setSideC(double sideC) {
        this.sideC  = sideC;
        this.setArea();
        this.setPerimeter();
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
        this.setArea();
        this.setPerimeter();
        
    }
    private void setArea(){
        this.area = (this.base*this.height)/2;
    }
    
    private void setPerimeter(){
        this.perimeter = this.base + this.sideA + this.sideC;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
    
    
    
    
    
    
    
}
