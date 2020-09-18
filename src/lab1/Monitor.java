package lab1;

public class Monitor {
    public String name;
    public String color;
    public int resolution;
    public float dimensions;

    Monitor(String name, String color, int resolution, float dimensions) {
        this.name = name;
        this.color = color;
        this.resolution = resolution;
        this.dimensions = dimensions;
    }

    public void monitorCharacteristics() {
        System.out.println("Model: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Resolution: " + this.resolution);
        System.out.println("Dimensions: " + this.dimensions);

    }
}
