package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    public double getSideLen(){
        return sideLen;
    }
    
    public void setSideLen(double sideLen){
        this.sideLen = sideLen;
    }

    public double getArea() {
        return sideLen * sideLen;
    }

    public double getPerimeter(){
        return sideLen * 4;
    }
}
