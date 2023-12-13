public class Solution {
    public static void main(String[] args) {
        // IShape square = new Rectangle(22,11);
        // FindAreaOfDifferentShape findAreaOfDifferentShape = new FindAreaOfDifferentShape(square);
        // System.out.println(findAreaOfDifferentShape.getArea());
    }
}

//D -> Dependency Inversion (Dependency Injection)
//Low Level modules should not directly depend on High Level Module
// Dependency Injection Implements Dependency Inversion
// Open/Closed principle can be achieved by Dependency Inversion

class FindAreaOfDifferentShape {

    // bad practice
    public double areaSquare(double side) {
        return side * side;
    }

    public double rectangleSquare(double length,double width) {
        return length * width;
    }


    // private IShape shape;

    // public FindAreaOfDifferentShape(IShape shape) {
    //     this.shape = shape;
    // }

    // public double getArea() {
    //     return shape.area();
    // }
}

// interface IShape {
//     double area();
// }

// class Rectangle implements IShape {

//     private double length;
//     private double width;
//     public Rectangle(double length,double width) {
//         this.length = length;
//         this.width = width;
//     }

//     @Override
//     public double area() {
//         return this.length * this.width;
//     }

// }

// class Square implements IShape {

//     private double side;
//     public Square(double side) {
//         this.side = side;
//     }

//     @Override
//     public double area() {
//        return this.side * this.side;
//     }

// }



