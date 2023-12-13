

//every base class object must be replaced by its children class but there should
//not be change in the core functionality or the logic part
public class solution {
    public static void main(String[] args) {
        // Square rec = new Square();
        // rec.setLengthBreadth(10, 20);
        // Square rect = new Square();
        // rect.setLengthBreadth(10, 20);
    }
}
//Rectangle Square
//Every Square is a rectangle

//base class
// class Rectangle {
//     private int len;
//     private int brea;
//     void setLengthBreadth(int length,int breadth) {
//        this.len = length;
//        this.brea = breadth;
//        System.out.println(this.len + " " + this.brea);
//     }
// }

// //derived class
// class Square extends Rectangle{
// }












//base class
class Shape {

}

//derived classes
class Square extends Shape{
}

class Rectangle extends Shape{
    private int length;
    private int breadth;
    void setLengthBreadth(int length,int breadth) {
       this.length = length;
       this.breadth = breadth;
       System.out.println(length + " " + breadth);
    }
}
