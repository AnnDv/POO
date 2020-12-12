package laboratory8;

public class Cube implements GeometricBody{

    float side;

    public Cube(float side) {
        this.side = side;
    }

    public double getSurface(){
        return 6 * Math.pow(side, 2);
    }

    public double getVolume(){
        return Math.pow(side, 3);
    }

    public String getName(){
        return "Cube";
    }
}
