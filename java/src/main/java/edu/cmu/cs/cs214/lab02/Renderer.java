package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    public Shape shape;
    
    Renderer(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        double area = shape.getArea();
        double perimeter = shape.getPerimeter();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
        System.out.println("Its parameter is " + perimeter + "\n");
    }
}
