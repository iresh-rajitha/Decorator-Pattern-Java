package com.ireshrajitha;

import com.ireshrajitha.shape.Shape;

public class GreenBorderDecorator extends ShapeDecorator {
    public GreenBorderDecorator(Shape shape) {
        super(shape);
    }
    public void draw(){
        shape.draw();
        setGreenBorder(shape);
    }
    private void setGreenBorder(Shape shape){
        System.out.println("Added Green Border");
    }

}
