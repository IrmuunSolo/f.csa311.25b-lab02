package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

// path: C:\Users\irmuu\OneDrive\Documents\2B\ПХ бүтээлт\Lab 3\f.csa311.25b-lab02\java
// ажиллуулах код: java -cp target/lab02-1.0-SNAPSHOT.jar edu.cmu.cs.cs214.lab02.Main

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 3);
        Shape square = new Square(4);

        Renderer circleRenderer = new Renderer(circle);
        Renderer rectangleRenderer = new Renderer(rectangle);
        Renderer squareRenderer = new Renderer(square);

        circleRenderer.draw();
        rectangleRenderer.draw();
        squareRenderer.draw();
    }
}