package laboratory8;

public class Parallelepiped implements GeometricBody{

    float length;
    float width;
    float height;

    public Parallelepiped(float length, float width, float height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSurface(){
        return  2 * (length * width) + 2 * (length * height) + 2 * (width * height);
    }

    public double getVolume(){
        return length * width * height;
    }

    public String getName(){
        return "Parallelepiped";
    }
}
