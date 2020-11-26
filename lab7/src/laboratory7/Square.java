package laboratory7;

public class Square extends Figure {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getPerimeter() {
        return sideLength * 4;
    }
    public double getArea() {
        return sideLength * sideLength;
    }
    public String getName() {
        return "Square";
    }

}
