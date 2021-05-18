/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
import java.util.*;
/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    
    int choice;
    int rectangle=1;  
    int circle=2;
    int triangle=3;
    int sphere=4;
    int rectangularPrism=5;
    int rectangularPyramid=6;
    int cone=7;
    int terminate=8;
    
    String MainMenu=("Please type:\n'"+rectangle+"' for rectangle\n'"+circle+"' for circle\n'"+triangle+"' for triangle\n'"+sphere+"' for sphere\n'"+rectangularPrism+"' for rectangular prism\n'"+rectangularPyramid+"' for rectangular pyramid\n'"+cone+"' for cone\n'"+terminate+"' to end the program");
    
    do{
    System.out.println(MainMenu);
    choice=in.nextInt();
    
    //Rectangle
    if (choice==1){
        System.out.println("Enter length:");
        double length=in.nextDouble();
        
        System.out.println("Enter width:");
        double width=in.nextDouble();
        
        int area1=1;
        int perimeter1=2;
        
        System.out.println("Type "+1+" for the area, or "+2+" for the perimter.");
        int choice1 = in.nextInt();
        
        if (choice1==1){
        Rectangle r1=new Rectangle(length, width);
        System.out.println("The area of the rectangle is "+r1.getArea()+"\n---------------------------------\n");    
        }
        else {
        Rectangle r1=new Rectangle(length, width);
        System.out.println("The perimeter of the rectangle is "+r1.getPerimeter()+"\n---------------------------------\n");      
        }
    }
    
    //Circle
    else if (choice==2){ 
        System.out.println("Enter radius:");
        double radius=in.nextDouble();
        
        int area1=1;
        int perimeter1=2;
        
        System.out.println("Type "+1+" for the area, or "+2+" for the circumference.");
        int choice1 = in.nextInt();
        
        if (choice1==1){
        Circle c1=new Circle(radius);
        System.out.println("The area of the circle is "+c1.getArea()+"\n---------------------------------\n");    
        }
        else {
        Circle c1=new Circle(radius);
        System.out.println("The circumference of the circle is "+c1.getCircumference()+"\n---------------------------------\n");  
        }
    }
    
    
    //Triangle
    else if (choice==3){ 
        System.out.println("Enter side A:");
        double sideA=in.nextDouble();
        
        System.out.println("Enter base:");
        double base=in.nextDouble();

        System.out.println("Enter side C:");
        double sideC=in.nextDouble();
        
        System.out.println("Enter height:");
        double height=in.nextDouble();
        
        int area1=1;
        int perimeter1=2;
        
        System.out.println("Type "+1+" for the area, or "+2+" for the perimter.");
        int choice1 = in.nextInt();
        
        if (choice1==1){
        Triangle t1=new Triangle(sideA,base,sideC,height);
        System.out.println("The area of the triangle is "+t1.getArea()+"\n---------------------------------\n");    
        }
        else {
        Triangle t1=new Triangle(sideA,base,sideC,height);
        System.out.println("The perimeter of the triangle is "+t1.getPerimeter()+"\n---------------------------------\n");      
        }   
    }
    
    //Sphere
    else if (choice==4){
        System.out.println("Enter radius:");
        double radius=in.nextDouble();
        
        int area1=1;
        int perimeter1=2;
        
        System.out.println("Type "+1+" for the volume, or "+2+" for the surface area.");
        int choice1 = in.nextInt();
        
        if (choice1==1){
        Sphere s1=new Sphere(radius);
        System.out.println("The volume of the sphere is "+s1.getVolume());    
        }
        else {
        Sphere s1=new Sphere(radius);
        System.out.println("The surface area of the sphere is "+s1.getSurfaceArea()+"\n---------------------------------\n");  
        }
    } 
    
    //Rectangular Prism
    else if (choice==5){
        System.out.println("Enter length:");
        double length=in.nextDouble();
        
        System.out.println("Enter width:");
        double width=in.nextDouble();

        System.out.println("Enter height:");
        double height=in.nextDouble();
        
        int area1=1;
        int perimeter1=2;
        
        System.out.println("Type "+1+" for the volume, or "+2+" for the surface area.");
        int choice1 = in.nextInt();
        
        if (choice1==1){
        RectangularPrism rp1=new RectangularPrism(length,width,height);
        System.out.println("The volume of the rectangular prism is "+rp1.getVolume()+"\n---------------------------------\n");    
        }
        else {
        RectangularPrism rp1=new RectangularPrism(length,width,height);
        System.out.println("The surface area of the rectangular prism is "+rp1.getSurfaceArea()+"\n---------------------------------\n");      
        }
    }
    
    //Rectangular Pyramid
    else if (choice==6){
        System.out.println("Enter length:");
        double length=in.nextDouble();
        
        System.out.println("Enter width:");
        double width=in.nextDouble();

        System.out.println("Enter height:");
        double height=in.nextDouble();
        
        int volume=1;
        int surfaceArea=2;
        
        System.out.println("Type "+1+" for the volume, or "+2+" for the surface area.");
        int choice1 = in.nextInt();
        
        if (choice1==1){
        RectangularPyramid rp2=new RectangularPyramid(length,width,height);
        System.out.println("The volume of the rectangular pyramid is "+rp2.getVolume()+"\n---------------------------------\n");    
        }
        else {
        RectangularPyramid rp2=new RectangularPyramid(length,width,height);
        System.out.println("The surface area of the rectangular pyramid is "+rp2.getSurfaceArea()+"\n---------------------------------\n");      
        }  
    }
    
    //Cone
    else if (choice==7){
        System.out.println("Enter radius:");
        double radius=in.nextDouble();
        
        System.out.println("Enter height:");
        double height=in.nextDouble();
        
        int area1=1;
        int perimeter1=2;
        
        System.out.println("Type "+1+" for the volume, or "+2+" for the surface area.");
        int choice1 = in.nextInt();
        
        if (choice1==1){
        Cone c2=new Cone(radius, height);
        System.out.println("The volume of the cone is "+c2.getVolume()+"\n---------------------------------\n");    
        }
        else {
        Cone c2=new Cone(radius, height);
        System.out.println("The surface area of the cone is "+c2.getSurfaceArea()+"\n---------------------------------\n");      
        }
    }
    
    else if (choice==8){
        System.out.println("Ending Program.");
    }
    
    else {
        System.out.println("Sorry that is not an option. Please pick from 1 to 7 for calculations or 8 to end the program.\n\n\n\n");
    }
    
    
    
    
    
    }while (choice!=8);
    in.close();
    }
}



