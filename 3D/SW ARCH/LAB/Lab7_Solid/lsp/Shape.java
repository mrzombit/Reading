package com.solid.lsp;
import com.solid.lsp.IShape;

//abstract
public class Shape{

    private IShape shape;

    public Shape(IShape shape) {
        this.shape = shape;
    }
    
    public int getShapeArea() {
        return shape.getArea();
    }         

    public void setShapeHeight(int height){
        shape.setHeight(height);
    }

    public void setShapeWidth(int width){
        shape.setWidth(width);
    }

    public int getShapeHeight(){
        return shape.getHeight();
    }

    public int getShapeWidth(){
        return shape.getWidth();
    }
}
