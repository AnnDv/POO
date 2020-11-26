package laboratory7;

public class Rectangle extends Figure{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }
    public double getArea() {
        return 2 * width * length;
    }
    public String getName() {
        return "Rectangle";
    }
}
