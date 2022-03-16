package com.solid.lsp;
import com.solid.lsp.Shape;


public class Square implements IShape{
    
    private int width;
    private int height;
    
    public Square() {
    }

    public Square(int side) {
        this.setSide(side);
    }

    public void setWidth(int width) {
        this.setSide(width);
    }

    public void setHeight(int height) {
        this.setSide(height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private void setSide(int side) {
        this.height = side;
        this.width = side;
    }

    public int getArea() {
        return width * height;
    }
}
