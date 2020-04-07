package kz.aitu.oop.examples;

public class Point {

    private double x;
    private double y;

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(4);
        p1.setY(8);

        Point p2 = new Point(8, 11);

        System.out.println(p2.distance(p1));
    }

    public Point() {
    }

    //returns distance between two points
    public double distance(Point point) {
        double distance = Math.sqrt(
                Math.pow(point.getX() - this.getX(), 2) + Math.pow(point.getY() - this.getY(), 2)
        );
        return distance;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
