package laboratory7;

public class Triangle extends Figure{

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }
    public double getArea() {
        double s = getPerimeter()/2;
        return Math.sqrt(s*(s*firstSide)*(s*secondSide)*(s*thirdSide));
    }

    public String getName() {
        return "Triangle";
    }
}
