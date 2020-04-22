package kz.aitu.oop.examples;

public class Shape{
    public String color;
    public boolean filled;
    //constructor number1//

    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    //constructor number2//

    public Shape(string color, boolean filled){
        this.color="green";
        this.filled=true;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor() {
        return color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public boolean isFilled() {
        return filled;
    }
    public String toString() {
        return("A shape with color of"+ color+"and filled");
    }
}
//test all methods//

  public class Test{
    public static void main(string[] args){
        Shape mb= new Shape("red", true);
        System.out.println(mb.toString());
    }
  }

  public class Circle extends Shape{
    public double radius;
    public Circle(string color, boolean filled, double radius){
        super(color, filled);
        this.radius=1;
    }
        public void setRadius(double radius){
            this.radius=radius;
        }
        public double getRadius() {
            return radius;
        }
        public double gerArea(){
        return radius*radius*Math.PI;
        }
      public double gerPerimeter(){
        return 2*radius*Math.PI;
      }

      @Override
      public string toString() {

        return "A circle with radius"+ radius + "which is a subclass of"+super.toString();
      }
}



public class Rectangle extends Shape{
    public double width;
    public double length;
    public Rectangle (string color, boolean filled, double width, double length ){
        super(color, filled);
        this.width=1;
        this.length=1;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getWidth() {
        return width;
    }

    public void setLength(double length){
        this.length=length;
    }
    public double getLength() {
        return length;
    }

    public double gerArea(){
        return width*length;
    }
    public double gerPerimeter(){
        return 2*(width+length);
    }

    @Override
    public string toString() {
        return "Rectangle with width"+ width+ "and length"+ length+", which is a subclass of " +super.toString();
    }
}


public class Square extends Rectangle{
    public double side;
    public Square (string color, boolean filled, double side ){
        super(color, filled);
        this.side=side;
    }
    public void setSide(double side){
        this.side=side;
    }

    public double getSide() {
        return side;
    }


    @Override
    public string toString() {
        return "A square with side"+ side+", which is a subclass of " " +super.toString();
    }

    public double gerArea(){

        return side*side;
    }
    public double gerPerimeter(){
        return 4*side;
    }

    void setWidth(double newWidth){
        width=newWidth;
    }
    void setLength(double newLength){
        length=newLength;
    }

}






