// Test application for Shape hierarchy 

public class ShapeTest {

    public static void main(String[] args) {
        
        // create subclass objects
        Square square = new Square(4);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(3, 6);
        Cube cube = new Cube(4);
        Sphere sphere = new Sphere(4);
        
        // create Shape array
        Shape[] shapes = new Shape[5];
   
        // initialize array
        shapes[0] = square;
        shapes[1] = circle;
        shapes[2] = triangle;
        shapes[3] = cube;
        shapes[4] = sphere;
        
        for(Shape currentShape: shapes)
        {
            System.out.println(currentShape);
            
            // see if shape is a two-dimensional or three-dimensional shape
            if (currentShape instanceof ThreedShape)
            {
                
                ThreedShape threed = (ThreedShape) currentShape;
                
                System.out.printf("%s: %.2f%n%s: %.2f%n%n", "Surface Area", threed.getArea(),
                        "Volume", threed.getVolume());
            }
            
            // calculates for two-dimensional shapes
            else
                System.out.printf("%s: %.2f%n%n", "Area", currentShape.getArea());
        } // end for loop
    } // end method main
} // end class ShapeTest