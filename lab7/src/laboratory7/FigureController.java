package laboratory7;

import java.util.ArrayList;

public class FigureController {

    public Figure getMaxArea(ArrayList<Figure> figures) {
        double max = 0;
        Figure maxFigure = null;
        for(Figure figure : figures) {
            double area = figure.getArea();
            if (area > max) {
                max = area;
                maxFigure = figure;
            }
        }
        return maxFigure;
    }

    public Figure getMaxPerimeter(ArrayList<Figure> figures) {
        double max = 0;
        Figure maxFigure = null;
        for(Figure figure : figures) {
            double perimeter = figure.getPerimeter();
            if (perimeter > max) {
                max = perimeter;
                maxFigure = figure;
            }
        }
        return maxFigure;
    }
}
