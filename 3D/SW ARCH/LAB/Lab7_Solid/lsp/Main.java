package com.solid.lsp;
import com.solid.lsp.Rectangle;
import com.solid.lsp.Square;
import com.solid.lsp.Shape;

public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        // Rectangle rek = new Rectangle(width, height);
        Shape reg1 = new Shape(new Rectangle(width, height));
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + reg1.getShapeWidth());
        System.out.println("Height = " + reg1.getShapeHeight());
        System.out.println("Area = " + reg1.getShapeArea());

        Shape reg2 = new Shape(new Square(5));
        reg2.setShapeWidth(width);
        reg2.setShapeHeight(height);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + reg2.getShapeWidth());
        System.out.println("Height = " + reg2.getShapeHeight());
        System.out.println("Area = " + reg2.getShapeArea());
    }
}
