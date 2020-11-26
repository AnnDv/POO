package laboratory7;

import java.util.ArrayList;

public class main {
    public static void main(String[] strg){

        Figure circle = new Figure() {
            double radius = 3.14;

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * radius;
            }

            @Override
            public double getArea() {
                return Math.PI * radius*radius;
            }

            @Override
            public String getName() {
                return "Circle";
            }
        };

        Figure square = new Square(10);
        Figure rectangle = new Rectangle(3.5, 7.56);
        Figure triangle = new Triangle(3.14, 10, 4.76);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(square);
        figures.add(rectangle);
        figures.add(triangle);
        figures.add(circle);

        FigureController figureController = new FigureController();

        System.out.println("Biggest Area: " + figureController.getMaxArea(figures).getName());
        System.out.println("Biggest perimeter: " + figureController.getMaxPerimeter(figures).getName());
        System.out.println("Area of a circle: " + circle.getArea());
        System.out.println("Perimeter of a circle: " + circle.getPerimeter());
    }
}
